
public class Rectangle extends Shape{
	private double width;
	private double length;
	
	public Rectangle() {}
	public Rectangle(double width, double length) {
		this.setWidth(width);
		this.setLength(length);
	}
	public Rectangle(double width, double length,String color,boolean filled) {
		super(color,filled);
		this.setWidth(width);
		this.setLength(length);
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
	public double getArea() { // deqat bda lera ama tushe mothod overloading buen wata yak naw method balam kare jyawaz...
		// ku java jyay daktawa?
		// ba call krdne aw objectay or lets say the class awha jyaya dakatawa...
		
		return this.length*this.width;
	}
	public double getPerimeter() {// haman sht lowash u hamu aw methodanay nawyan waku yaka...
		// amn esta zor xawm de good bye
		return (this.length+this.width)*2;
	}
	public String toString() {
		return "Rectangle["+ super.toString() + ",width=" + width + ", length=" + length + ']'; 
	}
}
