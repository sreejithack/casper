package first;

public class Empobj {
	String name;
	String designation;
	int age,PF,Gratuity,salary;
	Empobj(String name,String designation,int age,int PF,int Gratuity,int salary)
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
	public void display(){
		System.out.println("name:"+name);
		System.out.println("Designation:"+designation);
		System.out.println("age:"+age);
		System.out.println("TotalSalary:"+calculatesalary());
	}

	public static void main(String[] args) {
		Empobj emp1=new Empobj("Ram","Manager",32,500,800,7000);
		Empobj emp2=new Empobj("Shyam","HR",30,400,900,6000);
		Empobj emp3=new Empobj("Kiran","Accountant",27,1000,800,8000);
		emp1.display();
		emp2.display();
		emp3.display();		 
		
		

	}

}
