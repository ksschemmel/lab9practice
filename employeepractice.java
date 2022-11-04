
public class employeepractice {

	private String First_Name;
	private String Last_Name;
	private String Position;
	private double Salary;
	private double Hours_Worked;
	
	public employeepractice()
	{
		this.First_Name=" ";
		this.Last_Name=" ";
		this.Position=" ";
		this.Salary=8.25;
		this.Hours_Worked=0.0;
	}
	public employeepractice(String First_Name, String Last_Name, String Position, double Salary, double Hours_Worked) {
		this.First_Name=First_Name;
		this.Last_Name=Last_Name;
		this.Position=Position;
		this.Salary=Salary;
		this.Hours_Worked=Hours_Worked;
	}
	public String getFirstName() {
		return First_Name;
	}
	public String getLastName() {
		return Last_Name;
	}
	public String getPosition() {
		return Position;
	}
	public double getSalary() {
		return Salary;
	}
	public double getHoursWorked() {
		return Hours_Worked;
	}
	public void setFirstName(String First_Name) {
		this.First_Name=First_Name;
	}
	public void setLastName(String Last_Name) {
		this.Last_Name=Last_Name;
	}
	public void setPosition(String Position) {
		this.Position=Position;
	}
	public void setSalary(double Salary) {
		this.Salary=Salary;
	}
	public void setHoursWorked(double Hours_Worked) {
		this.Hours_Worked=Hours_Worked;
	}
	public double showCurrentPay() {
		double pay;
		if(Hours_Worked<=40) {
			pay=Hours_Worked*Salary;
		}
		else
		{
			double Overtime=Hours_Worked-40.0;
			pay=(40*Salary)+(Overtime*Salary*1.5);
		}
		return pay;
	}
		public String displayPayCheck() {
			StringBuilder sb= new StringBuilder();
				sb.append("=====" +First_Name.toUpperCase()+" "+Last_Name.toUpperCase()+"=====\n");
			sb.append("Hours Worked: " + Hours_Worked + "\n");
			sb.append("Position: " + Position + "\n");
			sb.append("Salary: " + Salary + "\n");
			sb.append("Total Pay: " +this.showCurrentPay()+"\n");
			return sb.toString();
			}
			public static void main(String[] args) {
				employeepractice person1=new employeepractice("John","Doe", "The Boss", 20.00, 30);
				System.out.println(person1.displayPayCheck());
				 
				employeepractice person2=new employeepractice("Harry","Potter","CEO",300.00, 48);
				System.out.println(person2.displayPayCheck());
			}
		}
	

