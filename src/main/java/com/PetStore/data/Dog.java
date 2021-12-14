package com.PetStore.data;

import com.PetStore.beans.Pet;

public class Dog extends Pet{
	private String subspecies;
	private boolean vaccinated;
	public Dog() {
		this.setSpecies("dog");
	}
	public String getSubspecies() {
		return subspecies;
	}
	public boolean getVaccinated() {
		return vaccinated;
	}
	public void setSubspecies(String subspecies) {
		this.subspecies=subspecies;
	}
	public void setVaccinated(boolean vaccinated) {
		this.vaccinated=vaccinated;
	}
	@Override
	public String toString() {
		return "Species: "+this.getSpecies()+" Subspecies: "+this.subspecies+" Price: "+this.getPrice()+" Breeder: "+this.getBreeder()+" Age: "+this.getAge()+ " Vaccinated: "+ ((vaccinated)?"The dog has not been vaccinated":"The dog has been vaccinated")+" Description: "+this.getDescription();
	}
}
