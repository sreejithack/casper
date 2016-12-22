package first;

public class Custgetset {
	String name,address;
	int age,phone;
	public void setname(String name)
	{
		this.name=name;
	}
	public void setaddress(String address)
	{
		this.address=address;
	}
	public void setage(int age)
	{
		this.age=age;
	}
	
	public void setphone(int phone)
	{
		this.phone=phone;
	}
	
	public String getname()
	{
		return name;
	}
	public String getaddress()
	{
		return address;
	}
	public int getage()
	{
		return age;
	}
	public int getphone()
	{
		return phone;
	}
	
	public static void main(String[] args) {
		Custgetset cgs=new Custgetset();
		cgs.setname("Ayush");
		cgs.setaddress("malappuram");
		cgs.setage(29);
		cgs.setphone(76547);
		System.out.println("name:"+cgs.name);
		System.out.println("Address:"+cgs.address);
		System.out.println("age:"+cgs.age);
		System.out.println("Phone-number:"+cgs.phone);

	}

}
