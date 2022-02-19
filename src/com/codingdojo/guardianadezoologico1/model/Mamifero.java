package com.codingdojo.guardianadezoologico1.model;

public class Mamifero {
	// //// ATRIBUTOS ///////////////////////
	private int energy;
	// //// CONSTRUCTORS /////////////////////
	public Mamifero() {
		this.energy = 100;
	}
	// //// GETTERS and SETTERS /////////////////
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	// //// DISPLAY ENERGY /////////////////////
	public int displayEnergy() {
		System.out.println("El nivel de energia es: "+energy);
		return energy;
	}
	
}
