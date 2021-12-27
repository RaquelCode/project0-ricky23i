package com.PokeBox.services;

import java.util.Set;

import com.PokeBox.beans.Pokemon;

 // His business logic is working with its implementation.

public  interface TrainerService {

	public Set<Pokemon> ViewAllPokemon();
	public Set<Pokemon> HasItem();
	public Set<Pokemon> ViewByLevel(int lv);
	public Pokemon getById(int id);
	public Pokemon addNewPokemon(Pokemon poke);
	public void removePokemon(int id);
	public Pokemon updatePokemon(Pokemon pokeToUpdate);
}
