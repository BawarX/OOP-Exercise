
public class Square extends Rectangle{
	
	public Square(double side) {
		super(side,side);
	}

	public Square(double width, double length, String color, boolean filled) {
		super(width, length, color, filled);
	}
	
	public double getSide() {
		return this.getLength();
	}
	public void setWidth(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	public void setLength(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	public String toString() {
		return "Square["+super.toString() + "]";
	}
}
