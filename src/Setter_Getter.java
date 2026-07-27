class student{
	String name;
	
	public void setname(String x) {                 // Setter method (To set or update name)
		name = x;
	}
	
	public String getname() {                       // Getter method (To get name)
		return name;
	}
}
public class Setter_Getter {
	public static void main(String[] args) {
		student s = new student();
		s.setname("Sayali");                                          
		System.out.println("Student Name: " + s.getname());
	}

}
