
public class BigDog extends Dog{


	
	public String toString() {
		return  "BigDog["+ super.toString() + "]"; 
	}
	
	public void greets() {
		System.out.println("Woooow");
	}
	public void greets(Dog another) {
		System.out.println("Woooooooow");
	}
	public void greets(BigDog another) {
		System.out.println("Wooooooooooooooooooooow");
	}

}
