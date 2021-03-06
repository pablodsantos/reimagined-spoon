package model.entities;

import model.entities.enums.Color;

public class Circle extends AbstractShappe {
	
	private Double radius;

	public Circle(Color color) {
		super(color);
	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	@Override
	public Double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle color: " + getColor() + "\n" + "Circle Area: " + String.format("%.2f", area());
	}
}
