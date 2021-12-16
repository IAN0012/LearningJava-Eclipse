package entities;

public class Rectangle {

	public double width;  	// LARGURA
	public double height; 	// ALTURA
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return (2*width)+(2*height);	
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2)+Math.pow(height, 2));
	}
	
	
	
	
	
	
}
