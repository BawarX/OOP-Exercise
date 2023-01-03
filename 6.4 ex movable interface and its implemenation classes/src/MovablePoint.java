
public class MovablePoint implements Movable{
	
	private int x;
	private int y;
	private int xSpeed;
	private int ySpeed;
	
	public MovablePoint(int x,int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getxSpeed() {
		return xSpeed;
	}
	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}
	public int getySpeed() {
		return ySpeed;
	}
	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}
	public String toString() {
		return "("+x+","+","+") speed"+ xSpeed+","+ ySpeed+")";
	}
	@Override
	public void moveUp() {
		this.y -= this.ySpeed;
	}
	@Override
	public void moveDown() {
		this.y += this.ySpeed;
	}
	@Override
	public void moveLeft() {
		this.x -= this.xSpeed;
	}
	@Override
	public void moveRight() {
		this.x += this.xSpeed;	
	}
}
