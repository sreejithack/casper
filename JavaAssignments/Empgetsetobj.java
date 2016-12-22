package first;

public class Empgetsetobj {
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
		Empgetsetobj emo=new Empgetsetobj();
		emo.Setname("Shyam");
		emo.Setdesig("manager");
		emo.setage(27);
		emo.setpf(500);
		emo.setgrant(1500);
		emo.setsalary(5000);
		System.out.println("name:"+emo.Getname());
		System.out.println("Designation:"+emo.Getdesig());
		System.out.println("age:"+emo.Getage());
		System.out.println("TotalSalary:"+emo.calculatesalary());
		System.out.println("----------------------------------------------------");
		Empgetsetobj emn=new Empgetsetobj();
		emn.Setname("Rohan");
		emn.Setdesig("Accountant");
		emn.setage(29);
		emn.setpf(800);
		emn.setgrant(1500);
		emn.setsalary(6000);
		System.out.println("name:"+emn.Getname());
		System.out.println("Designation:"+emn.Getdesig());
		System.out.println("age:"+emn.Getage());
		System.out.println("TotalSalary:"+emn.calculatesalary());
		System.out.println("----------------------------------------------------");
		Empgetsetobj emp=new Empgetsetobj();
		emp.Setname("Niya");
		emp.Setdesig("HR");
		emp.setage(29);
		emp.setpf(400);
		emp.setgrant(1500);
		emp.setsalary(5000);
		System.out.println("name:"+emp.Getname());
		System.out.println("Designation:"+emp.Getdesig());
		System.out.println("age:"+emp.Getage());
		System.out.println("TotalSalary:"+emp.calculatesalary());
		System.out.println("----------------------------------------------------");
		
		
	
	}

}
