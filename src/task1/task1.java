package task1;

public class task1 {

	public static void main(String[] args) {
		Point a = new Point(6.5,4.6);
		Point b = new Point(3.6,7.1);
		Point c = new Point(1.2,2.1);
		Shape abc = new Triangle(a,b,c);
		System.out.println(abc.toString());
		
		Point a1 = new Point(2.5,3.5);
		Point b1 = new Point(9.2,3.5);
		Point c1 = new Point(2.5,8.3);
		Point d1 = new Point(9.2,8.3);
		Shape abcd = new Rectangle(a1,b1,c1,d1); 
		System.out.println(abcd.toString());
		
		Point a2 = new Point(3.5,2.1);
		Point b2 = new Point(6.4,4.7);
		Shape ab = new Circle(a2,b2);
		System.out.println(ab.toString());
	}
}
