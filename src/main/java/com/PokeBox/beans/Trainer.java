package com.PokeBox.beans;
import java.util.ArrayList;
/**
 * Trainers will be able to add or delete pokemon from a online database. 
 * @author rduen
 *
 */

public class Trainer {

	private int id;
	private String name;
	private String username;
	private int sublv;
	private int age;
	ArrayList<Pokemon> pokemons;
	//contruc
	public Trainer() {
		username=" ";
		id=0;
		name="Trainer";
		sublv=0;
		age=10;
		pokemons= new ArrayList<>();
	}
	// Getters
	public String getUsername() {
	return username;	
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public int getSublv() {
		return sublv;
	}
	public int getAge() {
		return age;
	}
	public ArrayList<Pokemon> getPokemons(){
		return pokemons;
	}
	//setters
	public void setUserName(String username) {
	this.username=username;	
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setSublv(int sublv) {
		this.sublv=sublv;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setPokemons(ArrayList<Pokemon> pokemons){
		this.pokemons=pokemons;
	}
	@Override
	public String toString() {
		return "Name: "+name+" Age: "+age+ "id: "+id+" Box subscription Level: "+sublv;
	}
}
