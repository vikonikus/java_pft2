package ru.stqa.pft.sandbox;


public class MyFirstProgram {
	public static void main (String[] args){

		Square s = new Square(5);
		System.out.println("Square's area " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(2, 5);
		System.out.println("Rectangle's area " + r.a + " and "
						+ r.b + " = " + r.area());



		Point p1 = new Point(0, 0);
		Point p2 = new Point(1, 1);
		System.out.println("Distance from p1 to p2 = " + p1.distanceTo(p2));

	}

}