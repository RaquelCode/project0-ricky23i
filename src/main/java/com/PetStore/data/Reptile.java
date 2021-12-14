package com.PetStore.data;

import com.PetStore.beans.Pet;

public class Reptile extends Pet{
		private String subspecies;
		private boolean water;
		public Reptile() {
			this.setSpecies("Reptile");
		}
		public String getSubspecies() {
			return subspecies;
		}
		public boolean getWater() {
			return water;
		}
		public void setSubspecies(String subspecies) {
			this.subspecies=subspecies;
		}
		public void setWater(boolean water) {
			this.water=water;
		}
		@Override
		public String toString() {
			return "Species: "+this.getSpecies()+" Subspecies: "+this.subspecies+" Price: "+this.getPrice()+" Breeder: "+this.getBreeder()+" Age: "+this.getAge()+ " Terrian: "+ ((water)?"Land and water":"Land only")+" Description: "+this.getDescription();
		}
}
