
public class Rectangle implements GeometricObject{
	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		this.setWidth(width);
		this.setLength(length);
	}

	@Override
	public double getArea() {
		return width*length;
	}

	@Override
	public double getPerimeter() {
		return (width+length)*2;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	public String toString() {
		return "Rectangle[" + "width=" + width + ",length=" + length + ']';
	}
}
