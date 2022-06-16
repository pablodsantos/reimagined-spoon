package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Retangle;
import entities.Shappe;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Shappe circle = new Circle(Color.WHITE, 3.0);
		System.out.println("Area circle: " + String.format("%.2f", circle.area()));
		
		Shappe retangle = new Retangle(Color.BLACK, 2.0, 2.0);
		System.out.println("Area retangle: " + retangle.area());
		
		scanner.close();
	}
}
