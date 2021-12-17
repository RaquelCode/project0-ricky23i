package com.PokeBox.data;

import org.junit.jupiter.api.Test;

import com.PokeBox.beans.Pokemon;
import com.PokeBox.data.postgres.PokemonPostgres;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

public class PokemonDAOTest {
	//polymorphism
	private PokemonDAO pokeDao= new PokemonPostgres();
	
	@Test
	public void getByIdWhenIdExists() {
		int idInput = 1;
		Pokemon idOutput = pokeDao.getByID(idInput);
		assertEquals(1, idOutput.getId());
	}
	
	@Test
	public void getByIdWhenIdDoesNotExists() {
		int idInput = -1;
		Pokemon pokeOutput = pokeDao.getByID(idInput);
		assertNull(pokeOutput);
	}
	
	@Test
	public void getAll() {
		Set<Pokemon> Output = pokeDao.getAll();
		assertNotNull(Output);
	}
	
	@Test
	public void addNewPokemon() {
		Pokemon newPoke = new Pokemon();
		int generatedId = pokeDao.create(newPoke);		
		assertNotEquals(0, generatedId);
	}

}
