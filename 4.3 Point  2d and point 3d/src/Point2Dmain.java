import java.util.Arrays;

public class Point2Dmain {

	public static void main(String[] args) {
	
		Point3D p1 = new Point3D(1,2,3);
		System.out.println(p1);
			
		// let's change the values using get and sets
		
		p1.setX(4);
		p1.setY(5);
		p1.setZ(6);
		System.out.println(p1);
		System.out.println(p1.getX());
		System.out.println(p1.getY());
		System.out.println(p1.getZ());
		
		p1.setXY(7, 8);
		System.out.println(p1);
		p1.setXYZ(9, 10, 11);
		System.out.println("new point "+ Arrays.toString(p1.getXYZ()));
		// line 23 jwantren fkraya hata esta detbm or probalbay nmunaka  zor raqya
	}

}
