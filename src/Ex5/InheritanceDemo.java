package Ex5;

public class InheritanceDemo {
	
	public static void main(String args[]) {
		
		Person p1 = new Person("Amandi","Kurunegala");
		
		p1.showDetails();
		
		Student s1 = new Student("Hardik","India","2021");
		
		s1.showDetails();
		
		PartTimeStudent pt1 = new PartTimeStudent("Buvi","colombo","2021",12);
		
		pt1.showDetails();
		
	}

}
