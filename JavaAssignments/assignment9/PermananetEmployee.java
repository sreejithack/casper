package first;


public class PermananetEmployee extends Employee  
 {


	public PermananetEmployee(String name, String designation, int age, int PF,
			int Gratuity, int salary) {
		super(name, designation, age, PF, Gratuity, salary);
		
	      }

	int PermanentCode;
	public void setpcode(int pcode)
	{
		this.PermanentCode=pcode;
	}
	public int Getpcode()
	{
		return  PermanentCode;
	}
	void disp()
	{
		System.out.println("PermanentCode:"+ PermanentCode);
	}

	}
