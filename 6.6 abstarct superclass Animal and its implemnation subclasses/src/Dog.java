
public class Dog extends Animal{


	
	public String toString() {
		return "Dog["+ super.toString() + "]";
	}

	@Override
	public void greets() {
		System.out.println("woof");
		
	}
	public void greets(Dog another) {
		System.out.println("Wooooooooooof");
	}

}
