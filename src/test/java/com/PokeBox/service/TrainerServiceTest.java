package com.PokeBox.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import com.PokeBox.beans.Pokemon;
import com.PokeBox.data.PokemonDAO;
import com.PokeBox.services.TrainerServiceImplementation;

@ExtendWith(MockitoExtension.class)
public class TrainerServiceTest {

	@Mock
	private PokemonDAO pokeDao;
	
	@InjectMocks
	private TrainerServiceImplementation tServ= new TrainerServiceImplementation();
	private static Set<Pokemon> mockPokemon;
	
	@BeforeAll
	public static void mockAvailablePetsSetup() {
		mockPokemon = new HashSet<>();
		
		for (int i=1; i<=5; i++) {
			Pokemon poke = new Pokemon();
			poke.setId(i);
			if (i<3)
			{
				poke.setLevel(31);
				poke.setName("Pikachu");
				poke.setItem("leftovers");
			}
			mockPokemon.add(poke);
		}
	}
	@Test
	public void getAllPokemonSucess() {
		when(pokeDao.getAll()).thenReturn(mockPokemon);
		Set<Pokemon> actualPokemon=tServ.ViewAllPokemon();
		assertEquals(mockPokemon, actualPokemon);
	}
	
	
	@Test
	public void addPokemonSuccess() {
		Pokemon poke = new Pokemon();
		when(pokeDao.create(poke)).thenReturn(0);
		Pokemon actualPoke = tServ.addNewPokemon(poke);
		assertNull(actualPoke);

		
	}
	
	@Test
	public void updatePokemonSuccess() {
		Pokemon upPoke = new Pokemon();
		upPoke.setId(1);
		
		doNothing().when(pokeDao).update(Mockito.any(Pokemon.class));
		when(pokeDao.getByID(1)).thenReturn(upPoke);
		Pokemon poke = new Pokemon();
		poke.setId(1);
		poke.setName("updatepokemon");
		Pokemon pokeup = tServ.updatePokemon(poke);
		assertNotEquals(poke, pokeup);
	}
	
	@Test
	public void updatePokemonFailure() {
		Pokemon mockPoke = new Pokemon();
		mockPoke.setId(1);
		
		doNothing().when(pokeDao).update(Mockito.any(Pokemon.class));
		when(pokeDao.getByID(2)).thenReturn(mockPoke);
		Pokemon poke = new Pokemon();
		poke.setId(2);
		poke.setName("updatepokemon");
		Pokemon pokeup = tServ.updatePokemon(poke);
		assertEquals(mockPoke, pokeup);
		
	}
	
	@Test
	public void searchByLevelDoesNotExist() {
		//System.out.println("Level Does Not Exist Test");	
		when(pokeDao.getByLevel(20)).thenReturn(mockPokemon);
		
		Set<Pokemon> actualPokemon = tServ.ViewByLevel(20);
		boolean lv = true;
		//System.out.println( String.valueOf(actualPokemon.isEmpty()));	
		if(actualPokemon.isEmpty())
			assertTrue(lv);
		else {
		for (Pokemon poke : actualPokemon) {
			if (poke.getLevel()<20)
				lv = false;
			
		//System.out.println(poke.getLevel()+ String.valueOf(lv));	
		}
		}
		assertTrue(lv);
		
		
	}
	@Test
	public void searchByLevelExists() {  
		when(pokeDao.getByLevel(20)).thenReturn(mockPokemon);
		Set<Pokemon> actualPokemon = tServ.ViewByLevel(20);
		boolean lv = true;
		for (Pokemon poke : actualPokemon) {
			if (poke.getLevel()<20)
				lv = false;
		}
		
		assertTrue(lv);

	}
	
	@Test
	public void searchByItemExist() {
		when(pokeDao.getByHasItem()).thenReturn(mockPokemon);
		Set<Pokemon> actualPokemon = tServ.HasItem();
		boolean lv = true;
		for (Pokemon poke : actualPokemon) {
			if (poke.getItem().equals("null")) {
				lv = false;
			}
		}
		
		assertTrue(lv);
		
	}
	
	@Test
	public void searchByItemDoesNotExist() {
		
		when(pokeDao.getByHasItem()).thenReturn(mockPokemon);
		Set<Pokemon> actualPokemon = tServ.HasItem();
		boolean lv = false;
		for (Pokemon poke : actualPokemon) {
			if (poke.getItem().isEmpty()||poke.getItem().equals("null"))
				lv = true;
		}
		
		assertTrue(lv);
		
	}
	
}
