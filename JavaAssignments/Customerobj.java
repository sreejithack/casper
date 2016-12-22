package first;

public class Customerobj {
	String name,address;
	int age,phone;
	
	Customerobj(String name,String address, int age,int phone )
	{
		this.name=name;
		this.address=address;
		this.age=age;
		this.phone=phone;
				
	}

	public static void main(String[] args) {
		Customer cust1=new Customer("Amal", "Malappuram", 28, 987654);
		System.out.println("Customer Details");
		System.out.println("------------------------");
		System.out.println("name:"+cust1.name);
		System.out.println("Address:"+cust1.address);
		System.out.println("age:"+cust1.age);
		System.out.println("Phone-number:"+cust1.phone);
		Customer cust2=new Customer("Veena", "Manjeri", 25, 987654);
		System.out.println("------------------------");
		System.out.println("name:"+cust2.name);
		System.out.println("Address:"+cust2.address);
		System.out.println("age:"+cust2.age);
		System.out.println("Phone-number:"+cust2.phone);
		Customer cust3=new Customer("Meera", "Calicut", 28, 9873454);
		System.out.println("------------------------");
		System.out.println("name:"+cust3.name);
		System.out.println("Address:"+cust3.address);
		System.out.println("age:"+cust3.age);
		System.out.println("Phone-number:"+cust3.phone);
	}

}
