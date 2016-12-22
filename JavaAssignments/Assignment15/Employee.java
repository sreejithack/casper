package first;

public class Employee {

	String name;
	String designation;
	int age,PF,Gratuity,salary;
	public Employee(String name,String designation,int age,int PF,int Gratuity,int salary)
	{
		this.name=name;
		this.designation=designation;
		this.age=age;
		this.PF=PF;
		this.Gratuity=Gratuity;
		this.salary=salary;
		
	}
	
		public int calculatesalary()
		{
			return(salary-(PF+Gratuity));
		}
 void empdisplay()
 {
	 System.out.println("Name:"+name);
		////System.out.println("Designation:"+designation);
		System.out.println("Age:"+age);
		//System.out.println("Salary:"+salary);
		
		System.out.println("TotalSalary:"+calculatesalary());
		
 }
	
	
	
		
	
	
	

}
