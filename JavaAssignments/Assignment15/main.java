package first;

public class main   {
 
	
	
	
	public static void main(String[] args) {
		
		PermananetEmployee pemp=new PermananetEmployee("John", "HR", 35, 200, 300, 15000);
		System.out.println("Permanent Employee");
		System.out.println("....................");
		
		pemp.empdisplay();
		pemp.setpcode("PM100");
		pemp.Setphone(98967623);
		pemp.SetEmpcode(1001);
		pemp.setgender("Male");
		pemp.regularOffer(2500);
		pemp.seasonOffer(2000);
		//pemp.disp();
		/*Contractemployee cemp=new Contractemployee("Mary", "Accountant", 24, 500, 600, 10000);
		System.out.println("Contract Employee");
		System.out.println("....................");
		cemp.setduration(6);
		cemp.Setphone(9823672);
		cemp.SetEmpcode(1002);
		cemp.setgender("Female");
		cemp.empdisplay();
		//cemp.disp();
		cemp.regularOffer(100);
		cemp.seasonOffer(300);*/
		
		
		
		
		

	}

}
