package first;

public class Contractemployee  extends Employee{

	public Contractemployee(String name, String designation, int age, int PF,
			int Gratuity, int salary) {
		super(name, designation, age, PF, Gratuity, salary);
		// TODO Auto-generated constructor stub
	}
	int ContractDuration;
	public void setduration(int duration)
	{
		this.ContractDuration=duration;
	}
	public int Getduration()
	{
		return  ContractDuration;
	}
	public int calculatesalary()
	{
		return(salary-(PF+Gratuity));
	}
	void displ()
	{
		 System.out.println("name:"+name);
			System.out.println("Designation:"+designation);
			System.out.println("age:"+age);
			System.out.println("TotalSalary:"+calculatesalary());
		System.out.println("ContractDuration:"+ ContractDuration);
		
	}

	


}
