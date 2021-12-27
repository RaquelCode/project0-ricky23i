package com.PokeBox.data;
import com.PokeBox.beans.Pokemon;
import java.util.Set;

**
 *The PokemonDAO extends the GenericDAO in order to inherit the CRUD methods, 
 *and it sets the type of the data to be Pokemon objects.The author uses to methed getByID int value and getByHasItem.
 *I don't see any problem here since this interface will integrate to the data base.
 *
 */

public interface PokemonDAO extends GenericDAO<Pokemon>{
public Pokemon getByID(int id);
public Set<Pokemon> getByHasItem();
}
