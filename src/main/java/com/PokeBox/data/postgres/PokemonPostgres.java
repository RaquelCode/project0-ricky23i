package com.PokeBox.data.postgres;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import com.PokeBox.beans.Pokemon;
import com.PokeBox.data.PokemonDAO;
import com.PokeBox.utils.ConnectionUtil;

public class PokemonPostgres implements PokemonDAO{

	@Override
	public int create(Pokemon dataToAdd) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Set<Pokemon> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Pokemon dataToUpdate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Pokemon dataToDelete) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Pokemon> getByLevel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Pokemon> getByID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Pokemon> getByHasItem() {
		// TODO Auto-generated method stub
		return null;
	}

}
