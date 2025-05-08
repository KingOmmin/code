/**
 * 
 */
package a;

public class Circle {
	
	public double radius;
	public String color;
	
	Circle(){
		radius = 1.0;
		color = "blue";
	}//default constructor
	Circle(double rad, String col){
		radius = rad;
		color = col;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public double calcArea() {
		return Math.PI* this.radius*this.radius;
	}//end method
	public double calcCircumference() {
		return 2* Math.PI* this.radius;
	}//end method
	public String toString()
	{
		return super.toString() +
		String.format("%f", radius);
	}
}
