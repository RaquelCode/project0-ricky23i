package com.PokeBox.beans;

import java.util.Objects;

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
	private String trainer;
	

	//constru
	public Pokemon() {
		id=0;
		health=255;
		exp=0;
		level=0;
		type="type";
		name="Pokemon";
		item="";
		trainer="ricky23i";
	}
	@Override
	public String toString() {
		return "Pokemon [name=" + name +"health=" + health + ", exp=" + exp + ", level=" + level + ", type=" + type
				+  ", item=" + item + "]";
	}
	
	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
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
	@Override
	public int hashCode() {
		return Objects.hash(exp, health, id, item, level, name, trainer, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		return exp == other.exp && health == other.health && id == other.id && Objects.equals(item, other.item)
				&& level == other.level && Objects.equals(name, other.name) && Objects.equals(trainer, other.trainer)
				&& Objects.equals(type, other.type);
	}

	
	
}
