package com.PokeBox.beans;
/**
 * Pokemon will be stored in a PokeBox with the trainers information. They can add and remove them.
 * 
 * 
 * 
 * @author rduen
 *
 */
public class Pokemon {
 
	private int id;
	private int health;
	private int exp;
	private int level;
	private String type;
	private String name;
	private String item;
	
	@Override
	public String toString() {
		return "Pokemon [name=" + name +"health=" + health + ", exp=" + exp + ", level=" + level + ", type=" + type
				+  ", item=" + item + "]";
	}
//constru
	public Pokemon() {
		id=0;
		health=255;
		exp=0;
		level=0;
		type="type";
		name="Pokemon";
		item="leftovers";
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	
	
}
