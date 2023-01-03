
public class Cat extends Animal{

	
	public String toString() {
		return "Cat[" + super.toString() + "]";
	}
		
	@Override
	public void greets() {
		System.out.println("Meow");
		
	}
	

}
