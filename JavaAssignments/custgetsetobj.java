package first;

public class custgetsetobj {
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
		custgetsetobj cgo=new custgetsetobj();
		cgo.setname("Ayush");
		cgo.setaddress("malappuram");
		cgo.setage(29);
		cgo.setphone(76547);
		System.out.println("Customer Details");
		System.out.println("------------------------");
		System.out.println("name:"+cgo.getname());
		System.out.println("Address:"+cgo.getaddress());
		System.out.println("age:"+cgo.getage());
		System.out.println("Phone-number:"+cgo.getphone());
		custgetsetobj cgm=new custgetsetobj();
		cgm.setname("Neha");
		cgm.setaddress("manjeri");
		cgm.setage(22);
		cgm.setphone(76247);	
		System.out.println("------------------------");
		System.out.println("name:"+cgm.getname());
		System.out.println("Address:"+cgm.getaddress());
		System.out.println("age:"+cgm.getage());
		System.out.println("Phone-number:"+cgm.getphone());
		custgetsetobj cgn=new custgetsetobj();
		cgn.setname("Anaga");
		cgn.setaddress("calicut");
		cgn.setage(25);
		cgn.setphone(96547);
		System.out.println("------------------------");
		System.out.println("name:"+cgn.getname());
		System.out.println("Address:"+cgn.getaddress());
		System.out.println("age:"+cgn.getage());
		System.out.println("Phone-number:"+cgn.getphone());
	}

}
