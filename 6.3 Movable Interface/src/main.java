
public class main {

	public static void main(String[] args) {
	MovablePoint m1 =new MovablePoint(2,4,8,9);
	System.out.println(m1);
	
	MovablePoint m2 =new MovablePoint(2,4,8,9);
	
	m2.setX(6);
	m2.setY(7);
	m2.setxSpeed(10);
	m2.setySpeed(90);
	System.out.println(m2);
	
	}
}
