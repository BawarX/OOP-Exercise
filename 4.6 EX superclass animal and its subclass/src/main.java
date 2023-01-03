
public class main {

	public static void main(String[] args) {
	
		Cat c1 = new Cat("Akaima");
		System.out.println(c1);
		c1.greets();
		Dog d1 = new Dog("Spike");
		Dog d2 = new Dog("doggy");
		System.out.println(d1);
		System.out.println(d2);
		d1.greets(); // this should give woof
		d1.greets(d2); // this should give Wooof
		// everything works perfect ....
	}

}
