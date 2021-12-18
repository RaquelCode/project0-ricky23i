package com.PokeBox.services;

import java.util.Set;
import java.util.stream.Collectors;

import com.PokeBox.data.PokemonDAO;
import com.PokeBox.beans.Pokemon;
import com.PokeBox.data.postgres.PokemonPostgres;

public class TrainerServiceImplementation implements TrainerService{

	private PokemonDAO pokeDao=new PokemonPostgres();
	@Override
	public Set<Pokemon> ViewAllPokemon() {
		return pokeDao.getAll();
	}

	@Override
	public Set<Pokemon> HasItem() {
		Set<Pokemon> pokeWithitems = pokeDao.getByHasItem();
		pokeWithitems= pokeWithitems.stream().filter(pokemon -> !pokemon.getItem().equals("null")).collect(Collectors.toSet());
		return pokeWithitems;
	}

	@Override
	public Set<Pokemon> ViewByLevel(int lv) {
		Set<Pokemon> pokeByLevel = pokeDao.getByLevel(lv);
		pokeByLevel= pokeByLevel.stream().filter(pokemon -> (pokemon.getLevel())>lv).collect(Collectors.toSet());
		return pokeByLevel;
	}

	@Override
	public Pokemon getById(int id) {

		return pokeDao.getByID(id);
	}

	@Override
	public Pokemon addNewPokemon(Pokemon poke) {
		int newID = pokeDao.create(poke);
		if(newID!=0) {
			poke.setId(newID);
			return poke;
			
		}
		return null;
	}

	@Override
	public void removePokemon(int id) {
		pokeDao.delete(pokeDao.getByID(id));	
	}

	@Override
	public Pokemon updatePokemon(Pokemon pokeToUpdate) {
		if (pokeDao.getByID(pokeToUpdate.getId()) != null) {
			pokeDao.update(pokeToUpdate);
			pokeToUpdate = pokeDao.getByID(pokeToUpdate.getId());
			return pokeToUpdate;
		}
		return null;

	}

}
