package entities;

import entities.enums.Color;

public class Retangle extends Shappe{
	
	private Double widht;
	private Double height;

	public Retangle(Color color) {
		super(color);
	}

	public Retangle(Color color, Double widht, Double height) {
		super(color);
		this.widht = widht;
		this.height = height;
	}

	@Override
	public Double area() {
		return widht * height;
	}
}
