package com.PokeBox.data;

import java.util.Set;

import com.PokeBox.beans.Trainer;

/**
 *The TrainerDAO extends the GenericDAO in order to inherit the CRUD methods, 
 *and it sets the type of the data to be Trainer objects.The author uses methed getByUserName String value
 *I don't see any problem here since this interface will integrate the data base.
 * He is using unecessary import java.util.Set,since the code dons't have HashSet to work with!
 */

public interface TrainerDAO extends GenericDAO<Trainer>{

public Trainer getByUserName(String username);

}
