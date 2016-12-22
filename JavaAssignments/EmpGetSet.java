package first;

public class EmpGetSet {
	String name,designation;
	int age=43,PF,Gratuity,salary;
	
	public void Setname(String name){
		this.name=name;
	}
	public void Setdesig(String designation){
		this.designation=designation;
	}
	public void setage(int age)
	{
		this.age=age;
	}
	public void setpf(int pf)
	{
		this.PF=pf;
		
	}
	public void setgrant(int grant)
	{
		this.Gratuity=grant;
	}
	public void setsalary(int salary)
	{
		this.salary=salary;
	}
		
	public String Getname()
	{
		return name;
	}
	public int Getage()
	{
		return age;
	}
	public String Getdesig()
	{
		return designation;
	}
	public int Getpf()
	{
		return PF;
	}
	public int Getgrant()
	{
		return Gratuity;
	}
	public int Getsal()
	{
		return salary;
	}
	
	public int calculatesalary()
	{
		return(salary-(PF+Gratuity));
		
	
	}
	

	public static void main(String[] args) {
		EmpGetSet em=new EmpGetSet();
		em.Setname("Shyam");
		em.Setdesig("manager");
		em.setage(27);
		em.setpf(500);
		em.setgrant(1500);
		em.setsalary(5000);
		
		System.out.println("name:"+em.Getname());
		System.out.println("Designation:"+em.Getdesig());
		System.out.println("age:"+em.Getage());
		System.out.println("TotalSalary:"+em.calculatesalary());
	
		
		

	}
	}

