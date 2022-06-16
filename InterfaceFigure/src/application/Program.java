package application;

import java.util.Locale;

import model.entities.AbstractShappe;
import model.entities.Circle;
import model.entities.Retangle;
import model.entities.enums.Color;
import models.entities.Shappe;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		
		AbstractShappe circle = new Circle(Color.BLACK, 3.0);
		AbstractShappe retangle = new Retangle(Color.WHITE, 2.0, 2.0);
		
		System.out.println(circle);
		System.out.println(retangle);
	}
}
