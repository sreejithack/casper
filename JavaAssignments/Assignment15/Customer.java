package first;

public class Customer  implements  promotinalOffers
{
	
	String name,address;
	int age,phone;
	
	Customer(String name,String address, int age,int phone )
	{
		this.name=name;
		this.address=address;
		this.age=age;
		this.phone=phone;
				
	}

	public static void main(String[] args) {
		Customer cust=new Customer("Amal", "Malappuram", 28, 987654);
		System.out.println("Customer Details");
		System.out.println("------------------------");
		System.out.println("name:"+cust.name);
		System.out.println("Address:"+cust.address);
		System.out.println("age:"+cust.age);
		System.out.println("Phone-number:"+cust.phone);
		cust.regularOffer(3500);
		cust.seasonOffer(1800);

	}
	public void seasonOffer(int totalPurchaseAmount) {
		
		totalPurchaseAmount=totalPurchaseAmount*10/100;
		System.out.println("10% of purchase:"+totalPurchaseAmount);
	}

	
	public void regularOffer(int amount) {
		amount=amount*0/100;
		System.out.println("0% of purchase:"+amount);
		
	}

}
