package com.PetStore.beans;

public class Pet {
	/** Each pet will have an ID,species, price, description,color, age and t/f if the pet is microchipable.
	 * ID will be used as the identifier for searching.
	 * The store will sell, dogs, cats, reptiles, fish, and birds.
	 * 
	 * */
 private int ID;
 private int age;
 private String species;
 private boolean microchipable;
 private int price;
 private String description;
 private String color;
 private String breeder;
 
 // get functions for bean
 public int getID() {
	 return ID;
	 }
 
 public int getAge() {
	 return age; 
 }
 
 public String getSpecies() {
	 return species;
 }
 
 public boolean isMicrochipable() {
	 return microchipable;
 }
 
 public int getPrice() {
	 return price;
 }
 public String getDescription() {
	 return description;
 }
 public String getColor() {
	 return color;
 }
 public String getBreeder() {
	 return breeder;
 }
 
// set functions for bean 
 public void setID(int ID) {
	 this.ID=ID;
	 }
 
 public void setAge(int age) {
	 this.age= age; 
 }
 
 public void setSpecies(String species) {
	 this.species=species;
 }
 
 public void setMicrochipable(boolean microchipable) {
	 this.microchipable= microchipable;
 }
 
 public void setPrice(int price) {
	 this.price= price;
 }
 public void setDescription(String description) {
	 this.description= description;
 }
 public void setColor(String color) {
	 this.color=color;
 }
 public void setBreeder(String breeder) {
	 this.breeder=breeder;
 }
}
