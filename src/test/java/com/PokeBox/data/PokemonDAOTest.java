package com.PokeBox.data;

import org.junit.jupiter.api.*;

import com.PokeBox.beans.Pokemon;
import com.PokeBox.data.postgres.PokemonPostgres;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PokemonDAOTest {
	//polymorphism
	private PokemonDAO pokeDao= new PokemonPostgres();
	
	@BeforeAll
	public void getByIdWhenIdExists() {
		int idInput = 10;
		Pokemon idOutput = pokeDao.getByID(idInput);
		assertEquals(10, idOutput.getId());
	}
	
	@BeforeAll
	public void getByIdWhenIdDoesNotExists() {
		int idInput = -1;
		Pokemon pokeOutput = pokeDao.getByID(idInput);
		assertNull(pokeOutput);
	}
	@BeforeAll
	public void addNewPokemon() {
		Pokemon newPoke = new Pokemon();
		int generatedId = pokeDao.create(newPoke);		
		assertNotEquals(0, generatedId);
	}
	@Test
	public void getAll() {
		Set<Pokemon> Output = pokeDao.getAll();
		assertNotNull(Output);
	}
	@Test
	public void getByHasItem() {
		Pokemon newPoke = new Pokemon();
		newPoke.setItem("leftovers");
		pokeDao.create(newPoke);	
		Set<Pokemon> Output = pokeDao.getByHasItem();
		assertNotNull(Output);
	}
	public void getByLevel() {
		Pokemon newPoke = new Pokemon();
		newPoke.setLevel(25);
		pokeDao.create(newPoke);	
		Set<Pokemon> Output = pokeDao.getByLevel(10);
		assertNotNull(Output);
	}

	@Test
	public void DeletePokemon() {
		Pokemon newPoke = new Pokemon();
		int generatedId=pokeDao.create(newPoke);
		assertNull(pokeDao.getByID(generatedId));
		
	}

}
