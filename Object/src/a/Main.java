package a;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cir1 = new Circle(3.2,"green");
		Circle cir2 = new Circle();
		
		cir1.calcArea();
		cir1.calcCircumference();
		cir2.calcArea();
		cir2.calcCircumference();
		System.out.printf("Radius: %.2f",cir1.calcArea());
	}

}
