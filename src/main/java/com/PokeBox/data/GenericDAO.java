package com.PokeBox.data;

import java.util.Set;

public interface GenericDAO<D> {

	public int create(D dataToAdd);
	public Set<D> getAll();
	public void update(D dataToUpdate);
	public void delete(D dataToDelete);
	public Set<D> getByLevel( int level);
	
}
