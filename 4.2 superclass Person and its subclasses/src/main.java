
public class main {
	public static void main(String[] args) {
		// awja lera yak copy u paste le dadayn :x
		 Student s1 = new Student("bawar","Erbil","software",2023,825);
	        System.out.println(s1);
	        s1.setAddress("Duhok");
	        System.out.println(s1);
	        s1.setFee(300);
	        s1.setProgram("MAD101");
	        s1.setYear(2022);
	        System.out.println("Name is " + s1.getName());
	        System.out.println("Adress is " + s1.getAddress());
	        System.out.println("Fee is " + s1.getFee());
	        System.out.println("Program is " + s1.getProgram());
	        System.out.println("Year is " + s1.getYear());
	        
	        Staff sf1 = new Staff("Azhin", "kalak", "manager", 250);
	        System.out.println(sf1);

	        sf1.setAddress("escort");
	        System.out.println(sf1);
	        sf1.setPay(300);
	        sf1.setSchool("salahaden");
	        System.out.println("Name is " + sf1.getName());
	        System.out.println("Adress is " + sf1.getAddress());
	        System.out.println("Pay is " + sf1.getPay());
	        System.out.println("School is " + sf1.getSchool());
	}
}
