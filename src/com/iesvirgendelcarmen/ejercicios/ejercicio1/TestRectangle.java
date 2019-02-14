package com.iesvirgendelcarmen.ejercicios.ejercicio1;

public class TestRectangle {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(2.3, 6.3);
		System.out.println(r1);
		System.out.println(r2);
		System.out.printf("Number of rectangles %d%n", Rectangle.getNumberOfRectangle());
		System.out.printf("Number of rectangles %d%n", 
				Rectangle.ClassNumberOfRectangle.getNumberOfRectangle());
		System.out.printf("Area first triangle: %.2f%n", r1.getArea());
		System.out.printf("Perimeter second triangle: %.2f%n", r2.getPerimeter());


	}

}
