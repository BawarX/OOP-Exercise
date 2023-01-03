
public class Point3D extends Point2D{
	private float z;
	
	public Point3D(float x, float y, float z) {
		super(x,y);
		this.setZ(z);
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}
	public void setXYZ(float x,float y, float z) {
		this.setXY(x, y);
		this.z = z;
	}
	public float[] getXYZ() {
		float[] list = new float[]{this.getX(),this.getY(),this.z};
	return list;
	}
	public String toString() {
		return "(x"+this.getX()+","+this.getY()+","+this.getZ()+")"; 
	}
}
