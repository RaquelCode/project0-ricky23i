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
	private PokemonDAO PokeDao;
	
	@InjectMocks
	private TrainerServiceImplementation trainerServ= new TrainerServiceImplementation();
	private static Set<Pokemon> mockPokemon;
	@BeforeAll
	public static void mockAvailablePetsSetup() {
		mockPokemon = new HashSet<>();
		
		for (int i=1; i<=5; i++) {
			Pokemon poke = new Pokemon();
			poke.setId(i);
			if (i<3)
				poke.setName("Pikachu");
			mockPokemon.add(poke);
		}
	}

	
}
