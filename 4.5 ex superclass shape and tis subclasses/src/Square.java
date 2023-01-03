// lets think, square dakre property rectrangle bakar bene ka pane u drezhe haya
public class Square extends Rectangle{
		
	public Square() {}
	public Square(double side) {
		super(side,side);
	}
	public Square(double side, String color, boolean filled) {
		super(side,side,color,filled);
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
		return "Square["+super.toString()+"]";
	}
}
