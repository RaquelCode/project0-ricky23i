package com.PokeBox.data.postgres;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.PokeBox.beans.Trainer;
import com.PokeBox.beans.Pokemon;
import com.PokeBox.data.TrainerDAO;
import com.PokeBox.utils.ConnectionUtil;


public class TrainerPostgres implements TrainerDAO{
		private ConnectionUtil connUtil = ConnectionUtil.getConnectionUtil();



	@Override
	public int create(Trainer dataToAdd) {
	return 0;

	}

	@Override
	public Set<Trainer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Trainer dataToUpdate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Trainer dataToDelete) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Trainer> getByLevel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Trainer getByUserName(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
