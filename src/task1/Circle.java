package task1;

public class Circle extends Shape {
	private Point a;
	private Point b;
	
	public Circle() {
		
	}

	public Circle(Point a, Point b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}
	
	public double getSideA() {
		double sideA = Math.sqrt(Math.pow((b.getX()-a.getX()),2)+Math.pow((b.getY()-a.getY()),2));
		return sideA;	
	}
	
	@Override
	public double getArea() {
		double area = Math.PI*Math.pow(getSideA(),2);
		return area;
	}
	
	@Override
	public double getPerimetr() {
		double p = Math.PI*getSideA()*2;
		return p;
	}

	@Override
	public String toString() {
		return "Circle [a=" + a + ", b=" + b + ", getSideA()=" + getSideA() + ", getArea()=" + getArea()
				+ ", getPerimetr()=" + getPerimetr() + "]";
	}
}
