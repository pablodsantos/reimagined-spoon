package entities;

import entities.enums.Color;

public abstract class Shappe {
	
	private Color color;
	
	public Shappe(Color color) {
		super();
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract Double area();
}
