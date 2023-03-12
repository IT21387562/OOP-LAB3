package Ex1;

public class Test {
	public static void main(String args[]){
		
		//create object
		
		/*Student s1 = new Student(); //calling default constructor
		Student s2 = new Student();
		
		s1.name = "Amandi";
		s1.ditno = "IT21387562";
		s1.address = "Kurunegala";
		
		s2.name = "Hardik";
		s2.ditno = "IT21387561";
		s2.address = "India";*/
		
		//use parameterized constructor 
		//Student s1 = new Student("Amandi","IT21387562","Kurunegala");
		//Student s2 = new Student("Hardik","IT21387561","India");
		
		//print values
		//System.out.println("Name : " +s1.name + "\nDitNo : "+s1.ditno+ "\nAddress : "+s1.address);
		//System.out.println("Name : " +s2.name + "\nDitNo : "+s2.ditno+ "\nAddress : "+s2.address);
		
		/*Student s1 = new Student();
		s1.setName("Amandi");
		s1.setDitno("IT21387562");
		s1.setAddress("Kurunegala");
		
		System.out.println("Name : " +s1.getName() + "\nDitNo : "+s1.getDitno()+ "\nAddress : "+s1.getAddress());*/
		
		Student s1 = new Student("HEHE","IT4561","MAHO");
		System.out.println(s1.getDetails());

		
	}
}
