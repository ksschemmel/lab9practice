
public class studentpractice {

	private String Name;
	private double gpa;
	private int time_spent;
	
	public studentpractice()
	{
		this.Name=" ";
		this.gpa=0;
		this.time_spent=0;
	}
	public studentpractice(String name, double gpa, int time_spent){
		this.Name=Name;
		this.gpa=gpa;
		this.time_spent=time_spent;
	}
	public String getName() {
		return Name;
	}
	public double getgpa() {
		return gpa;
	}
	public int gettimespent() {
		return time_spent;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	public void setgpa(double gpa) {
		this.gpa=gpa;
	}
	public void settimespent(int time_spent) {
		this.time_spent=time_spent;
	}
	public String HonorsEligible() {
		String Honors;
		if (gpa>=3.5)
			Honors="true";
		else
			Honors="false";
		return Honors;
	}
	public static void main(String[] args) {
		studentpractice Student1= new studentpractice();
		Student1.setName("Kailey");
		Student1.setgpa(3.8);
		Student1.settimespent(3);
		
		System.out.println("Student's honors eligibility check: " + Student1.HonorsEligible());
		
		Student1.setgpa(3.4);
		
	}
	}


