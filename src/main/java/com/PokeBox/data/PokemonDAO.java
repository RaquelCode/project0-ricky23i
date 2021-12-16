package com.PokeBox.data;
import com.PokeBox.beans.Pokemon;
import java.util.Set;

public interface PokemonDAO extends GenericDAO<Pokemon>{
public Set<Pokemon> getByID();
public Set<Pokemon> getByHasItem();
}
