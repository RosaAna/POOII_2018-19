package com.iesvirgendelcarmen.ejercicios.ejercicio1;

public class Rectangle {

	private double width;
	private double height;
	private static int numberOfRectangle = 0;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		numberOfRectangle++;
	}

	public Rectangle() {
		//		this.width = 1;
		//		this.height = 1;
		this(1.0, 1.0);
		//numberOfRectangle++;

	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	public static int getNumberOfRectangle() {
		return numberOfRectangle;
	}
	
	public static class ClassNumberOfRectangle {
		public static int getNumberOfRectangle() {
			return numberOfRectangle;
		}
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return (width + height) * 2.0;
	}
	
}
