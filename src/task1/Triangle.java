package task1;

public class Triangle extends Shape {
	private Point a;
	private Point b;
	private Point c;
	
	public Triangle() {
		
	}

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		c = c;
	}
	
	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + ", getSideA()=" + getSideA() + ", getSideB()="
				+ getSideB() + ", getSideC()=" + getSideC() + ", getArea()=" + getArea() + ", getPerimetr()="
				+ getPerimetr() + "]";
	}

	public double getSideA() {
		double sideA = Math.sqrt(Math.pow((b.getX()-a.getX()),2)+Math.pow((b.getY()-a.getY()),2));
		return sideA;	
	}
	
	public double getSideB() {	
		double sideB = Math.sqrt(Math.pow((b.getX()-c.getX()),2)+Math.pow((b.getY()-c.getY()),2));
		return sideB;
	}
	
	public double getSideC() {
		double sideC = Math.sqrt(Math.pow((c.getX()-a.getX()),2)+Math.pow((c.getY()-a.getY()),2));
		return sideC;
	}
	
	@Override
	public double getArea() {
		double p = (getSideA()+getSideB()+getSideC())/2;
		double area = Math.sqrt(p*(p-getSideA())*(p-getSideB())*(p-getSideC()));
		return area;
	}
	
	@Override
	public double getPerimetr() {
		double p = getSideA()+getSideB()+getSideC();
		return p;
	}
}
