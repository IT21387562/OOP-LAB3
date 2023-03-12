package Ex5;

public class Person {
	
	String name, address;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public void showDetails() {
		
		System.out.println("Name : "+this.name);
		System.out.println("Address : "+this.address);
		
	}
}
