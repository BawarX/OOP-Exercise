
public class Circle extends Shape{
	private double radius = 1.0;
	public Circle() {}
	public Circle(double radius, String color, boolean filled) {
		super(color,filled);
		this.radius = radius;
	}
	public double getArea() {
		return this.radius*this.radius*Math.PI; // pi * r^2
	}
	public double getPerimeter() {
		return this.radius*2*Math.PI;// radius * pi * 2
	}
	public void setRadius(double rad) {
		this.radius = rad;
	}
	public String toString() {
		return "Circle["+ super.toString() + ",radius=" + radius + ']';
	}
}
