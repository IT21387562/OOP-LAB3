package Ex1;

public class Student {
	
	//objects
	String name, ditno, address;
	
	//Constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parameterized constructor
	public Student(String name, String ditno, String address) {
		super();
		this.name = name;
		this.ditno = ditno;
		this.address = address;
	}

	//accessor - get (datatype)
	public String getName() {
		return name;
	}
	
	//mutator - set (void)
	public void setName(String name) {
		this.name = name;
	}
	
	//accessor - get (datatype)
	public String getDitno() {
		return ditno;
	}
	
	//mutator - set (void)
	public void setDitno(String ditno) {
		this.ditno = ditno;
	}
	
	//accessor - get (datatype)
	public String getAddress() {
		return address;
	}
	
	//mutator - set (void)
	public void setAddress(String address) {
		this.address = address;
	}
	
	//Exercise 4
	String getDetails() {
		
		String s = "I am a Student "+"\nMy name is "+ getName()+"\nI am from "+ getAddress()+"\nMy dit no is "+ getDitno();
		return s;
		

		
	}
	
	
	
}
