package application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Retangle;
import model.entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		AbstractShape circle = new Circle(Color.WHITE, 3.0);
		AbstractShape retangle = new Retangle(Color.BLACK, 2.0, 2.0);
		
		System.out.println(circle);
		System.out.println(retangle);
	}
}
