
public class Circle extends Shape{

		protected double radius = 1.0;
		
		public Circle() {}
		public Circle(double radius) {
			this.radius = radius;
		}
		public Circle(double radius, String color, boolean filled) {
			super(color,filled);
			this.radius = radius;
		}
		// madam extende shape krdya ka shape intereface.. awe methode abstracta dabe betn..
		@Override
		public double getArea() {
			return this.radius*this.radius*Math.PI;
		}
		@Override
		public double getPerimeter() {	
			return this.radius*2*Math.PI;
		}
		public String toString() {
			return "Circle["+ super.toString() + ",radius"+ radius + "]";
		}
		
		public void setRadius(int radius) {
			this.radius = radius;
		}
}