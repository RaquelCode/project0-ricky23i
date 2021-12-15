package com.PokeBox.beans;
import java.util.ArrayList;
/**
 * Trainers will be able to add or delete pokemon from a online database. 
 * @author rduen
 *
 */

public class Trainer {

	private int id;
	private int money;
	private String name;
	private int sublv;
	private int age;
	ArrayList<Pokemon> pokemons;
	//contruc
	public Trainer() {
		id=0;
		money=0;
		name="Trainer";
		sublv=0;
		age=10;
		pokemons= new ArrayList<>();
	}
	// Getters
	public int getId() {
	return id;	
	}
	
	public int getMoney() {
		return money;
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
	public void setId(int id) {
	this.id=id;	
	}
	
	public void setMoney(int money) {
		this.money=money;;
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
		return "Name: "+name+" Age: "+age+ " $: "+money+" Box subscription Level: "+sublv;
	}
}
