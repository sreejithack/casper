package first;

public class Contractemployee  extends Employee{

	public Contractemployee(String name, String designation, int age, int PF,
			int Gratuity, int salary) {
		super(name, designation, age, PF, Gratuity, salary);
		
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
	void disp()
	{
		System.out.println("ContractDuration:"+ContractDuration);
	}

	


}
