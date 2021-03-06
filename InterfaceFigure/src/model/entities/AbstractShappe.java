package model.entities;

import model.entities.enums.Color;
import models.entities.Shappe;

public abstract class AbstractShappe implements Shappe {
	
	private Color color;
	
	public AbstractShappe(Color color) {
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
