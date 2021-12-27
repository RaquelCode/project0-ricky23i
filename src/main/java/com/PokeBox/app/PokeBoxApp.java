package com.PokeBox.app;

import io.javalin.Javalin;
import io.javalin.http.HttpCode;

import static io.javalin.apibuilder.ApiBuilder.*;

import java.util.Set;

import org.eclipse.jetty.http.HttpStatus;

import com.PokeBox.beans.Pokemon;
import com.PokeBox.services.TrainerService;
import com.PokeBox.services.TrainerServiceImplementation;

/**
 * This class is the PokeBoxApp which use Javalin as a framework to handle HTTP requests. 
 * What I have noted this class have the code well organized and readable with all different endpoints required for this project.
 * And the endpoint (GET, POST, PUT)are grouped together and nested to make it more easy to understand. 

 */


public class PokeBoxApp {
	private static TrainerService tServ= new TrainerServiceImplementation();
	public static void main(String[] args) {
		Javalin app = Javalin.create();

		app.start();

		app.routes(() -> {
			path("/Pokemon", () -> {
				//view view by level, view if has item,view allpokemon
				get(ctx -> {
					String lvSearch = ctx.queryParam("lv");
					String itemSearch = ctx.queryParam("item");
					if(lvSearch!=null && !"".equals(lvSearch)) {
						Set<Pokemon> pokeFound=tServ.ViewByLevel(Integer.parseInt(lvSearch));
						if(pokeFound.isEmpty()) {
							ctx.status(404);
							ctx.result("Pokemon higher than level "+ lvSearch + " do not exist.");
						}
						else
						ctx.json(pokeFound);
					}
					else if (itemSearch!=null && !"".equals(itemSearch)) {
						Set<Pokemon> pokeFound=tServ.HasItem();
						if(pokeFound.isEmpty()) {
							ctx.status(404);
							ctx.result("No Pokemon have items");
						}
						else
						ctx.json(pokeFound);
					}
					else {
						Set<Pokemon> pokeFound=tServ.ViewAllPokemon();
						ctx.json(pokeFound);
					}
				});
				//add new pokemon
				post(ctx -> {
					Pokemon newPoke = ctx.bodyAsClass(Pokemon.class);
					if (newPoke !=null) {
						tServ.addNewPokemon(newPoke);
						ctx.status(HttpStatus.CREATED_201);
					} else {
						ctx.status(HttpStatus.BAD_REQUEST_400);
					}

				});
				path("/{id}", () -> {
					//view pokemon by id
					get(ctx -> {
						try {
							int pokeId = Integer.parseInt(ctx.pathParam("id")); 
							Pokemon poke = tServ.getById(pokeId);
							if (poke != null)
								ctx.json(poke);
							else
							{
								ctx.status(404);
								ctx.result("Pokemon ID does not exist");
							}
						} catch (NumberFormatException e) {
							ctx.status(400);
							ctx.result("Pokemon ID must be a numeric value");
						}

					});
					//update pokemon
					put(ctx -> {
						try {
							int pokeId = Integer.parseInt(ctx.pathParam("id")); // num format exception
							Pokemon pokeToEdit = ctx.bodyAsClass(Pokemon.class);
							if (pokeToEdit != null && pokeToEdit.getId() == pokeId) {
								pokeToEdit = tServ.updatePokemon(pokeToEdit);
								if (pokeToEdit != null)
									ctx.json(pokeToEdit);
								else
									ctx.status(404);
							} else {
								// conflict: the id doesn't match the id of the pet sent
								ctx.status(HttpCode.CONFLICT);
								ctx.result("Pokemon IDs do not match");
							}
						} catch (NumberFormatException e) {
							ctx.status(400);
							ctx.result("Pokemon ID must be a numeric value");
						}

					});
				});
			});
		});

	}
}
