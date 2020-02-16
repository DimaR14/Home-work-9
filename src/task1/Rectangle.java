package task1;

public class Rectangle extends Shape {
	private Point a;
	private Point b;
	private Point c;
	private Point d;
	
	public Rectangle() {
		
	}

	public Rectangle(Point a, Point b, Point c, Point d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
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

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	public Point getD() {
		return d;
	}

	public void setD(Point d) {
		this.d = d;
	}
	
	public double getSideA() {
		double sideA = Math.sqrt(Math.pow((b.getX()-a.getX()),2)+Math.pow((b.getY()-a.getY()),2));
		return sideA;	
	}
	
	public double getSideB() {
		double sideA = Math.sqrt(Math.pow((c.getX()-b.getX()),2)+Math.pow((c.getY()-b.getY()),2));
		return sideA;	
	}
	
	public double getSideC() {
		double sideA = Math.sqrt(Math.pow((d.getX()-c.getX()),2)+Math.pow((d.getY()-c.getY()),2));
		return sideA;	
	}
	
	public double getSideD() {
		double sideA = Math.sqrt(Math.pow((a.getX()-d.getX()),2)+Math.pow((a.getY()-d.getY()),2));
		return sideA;	
	}
	
	@Override
	public double getArea() {
		double area = getSideA()*getSideB();
		return area;
	}
	
	@Override
	public double getPerimetr() {
		double p = getSideA()*2+getSideB()*2;
		return p;
	}

	@Override
	public String toString() {
		return "Rectangle [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", getSideA()=" + getSideA()
				+ ", getSideB()=" + getSideB() + ", getSideC()=" + getSideC() + ", getSideD()=" + getSideD()
				+ ", getArea()=" + getArea() + ", getPerimetr()=" + getPerimetr() + "]";
	}
}
