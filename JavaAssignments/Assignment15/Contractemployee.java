package first;

public class Contractemployee  extends Employee implements promotinalOffers{

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
	
	int Empcode;
	public void SetEmpcode(int Ecode)
	{
		this.Empcode=Ecode;
	}
	public int GetEmpcode()
	{
		return  Empcode;
	}
	int phone;
	public void Setphone(int ph)
	{
		this.phone=ph;
	}
	public int Getphone()
	{
		return  phone;
	}
	String Gender;
	public void setgender(String gender)
	{
		this.Gender=gender;
	}
	
	public String Getgender()
	{
		return  Gender;
	}
	
	
	void disp()
	{
		System.out.println("EmpCode:"+ GetEmpcode());
		System.out.println("Gender:"+ Getgender());
		System.out.println("PhoneNo:"+ Getphone());
		System.out.println("ContractDuration:"+Getduration());
	}
	
	public void seasonOffer(int totalPurchaseAmount) {
		
		totalPurchaseAmount=totalPurchaseAmount*15/100;
		System.out.println("15% of purchase:"+totalPurchaseAmount);
	}
	
	public void regularOffer(int amount) {
		
		amount=amount*8/100;
		System.out.println("8% of purchase:"+amount);
	}
}
	
			
		
		
			


	


