package Ex5;

public class Student extends Person {

	String stid;
	
	public Student(String name, String address, String stid) {
		super(name, address);
		this.stid = stid;
	}

	public void showDetails() {
		
		super.showDetails();
		
		System.out.println("Student id : "+this.stid);
	}
	

}
