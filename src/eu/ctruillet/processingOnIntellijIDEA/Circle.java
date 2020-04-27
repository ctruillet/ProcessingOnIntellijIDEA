/*
 * Copyright (c) 2020.
 * Clément Truillet (clement@ctruillet.eu)
 */

package eu.ctruillet.processingOnIntellijIDEA;

/**
 * Classe Circle qui dessine un cercle
 * Cette classe n'importe pas la librarie processing mais utilise des méthodes processing
 */
public class Circle {
	//Attributs
	private int radius;
	private int x;
	private int y;

	//Constructeur
	public Circle(float x, float y, float radius){
		this.x= (int) x;
		this.y= (int) y;
		this.radius= (int) radius;
	}


	//Méthodes
	public void draw(){
		Main.processing.fill(Main.processing.random(255),255,255);

		Main.processing.circle(this.x,this.y,this.radius);
	}
}

