package com.PetStore.data;

import com.PetStore.beans.Pet;

public class Fish extends Pet{
	private String subspecies;
	private boolean salt;
	public Fish() {
		this.setSpecies("fish");
	}
	public String getSubspecies() {
		return subspecies;
	}
	public boolean getSalt() {
		return salt;
	}
	public void setSubspecies(String subspecies) {
		this.subspecies=subspecies;
	}
	public void setVaccinated(boolean salt) {
		this.salt=salt;
	}
	@Override
	public String toString() {
		return "Species: "+this.getSpecies()+" Subspecies: "+this.subspecies+" Price: "+this.getPrice()+" Breeder: "+this.getBreeder()+" Age: "+this.getAge()+ "Water:" + ((salt)?"Salt water":"Fresh water")+" Description: "+this.getDescription();
	}
}
