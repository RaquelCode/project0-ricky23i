package com.PetStore.data;

import com.PetStore.beans.Pet;

public class Cat extends Pet{
	private String subspecies;
	private boolean vaccinated;
	
	public Cat() {
		this.setSpecies("cat");
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
		return "Species: "+this.getSpecies()+" Subspecies: "+this.subspecies+" Price: "+this.getPrice()+" Breeder: "+this.getBreeder()+" Age: "+this.getAge()+ " Vaccinated: "+ ((vaccinated)?"The cat has not been vaccinated":"The cat has been vaccinated")+" Description: "+this.getDescription();
	}
}
