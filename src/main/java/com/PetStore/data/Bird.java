package com.PetStore.data;

import com.PetStore.beans.Pet;

public class Bird extends Pet{
	private String subspecies;
	private boolean flys;
	public Bird() {
		this.setSpecies("bird");
	}
	public String getSubspecies() {
		return subspecies;
	}
	public boolean getFlies() {
		return flys;
	}
	public void setSubspecies(String subspecies) {
		this.subspecies=subspecies;
	}
	public void setFlies(boolean flys) {
		this.flys=flys;
	}
	@Override
	public String toString() {
		return "Species: "+this.getSpecies()+" Subspecies: "+this.subspecies+" Price: "+this.getPrice()+" Breeder: "+this.getBreeder()+" Age: "+this.getAge()+ " Flys: "+ ((flys)?"The bird flys":"The bird does not fly")+" Description: "+this.getDescription();
	}
}
