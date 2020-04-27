/*
 * Copyright (c) 2020.
 * Clément Truillet (clement@ctruillet.eu)
 */

package eu.ctruillet.processingOnIntellijIDEA;

import processing.core.PApplet;

public class Main extends PApplet {
	//Attributs
	public static PApplet processing;
	//Constructeur

	//Méthodes
	public static void main(String[] args) {
		PApplet.main("eu.ctruillet.processingOnIntellijIDEA.Main",args);
	}

	public void settings(){
		size(480, 360);
	}

	public void setup(){
		processing = this;

		surface.setTitle("Processing on IntellijIDEA");

		colorMode(HSB,255,255,255);
	}

	public void draw(){
		fill(random(255),255,255);

		Circle circle = new Circle(random(0,width),random(0,height),random(5,50));
		circle.draw();

	}
}
