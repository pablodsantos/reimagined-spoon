package model.entities;

import model.entities.enums.Color;

public class Retangle extends AbstractShape{
	
	private Double width;
	private Double height;	
	
	public Retangle(Color color) {
		super(color);
	}

	public Retangle(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public Double area() {
		return width * height;
	}

	@Override
	public String toString() {
		return "Retangle [area()=" + String.format("%.2f", area()) + ", getColor()=" + getColor() + "]";
	}
}
