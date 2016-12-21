package first;

public class main   {
 
	
	
	
	public static void main(String[] args) {
		
		PermananetEmployee pemp=new PermananetEmployee("John", "HR", 35, 200, 300, 15000);
		pemp.empdisplay();
		pemp.setpcode("PM100");
		pemp.Setphone(98967623);
		pemp.SetEmpcode(1001);
		pemp.setgender("Male");
		//pemp.disp();
		Contractemployee cemp=new Contractemployee("Mary", "Accountant", 24, 500, 600, 10000);
		cemp.setduration(6);
		cemp.Setphone(9823672);
		cemp.SetEmpcode(1002);
		cemp.setgender("Female");
		cemp.empdisplay();
		//cemp.disp();
		
		
		
		
		

	}

}
