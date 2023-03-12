package Ex5;

public class PartTimeStudent extends Student {

	int hours;

	public PartTimeStudent(String name, String address, String stid, int hours) {
		super(name, address, stid);
		this.hours = hours;
		// TODO Auto-generated constructor stub
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println("Number of hours : "+this.hours);
	}
	
	


}
