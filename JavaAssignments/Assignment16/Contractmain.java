package first;

public class Contractmain {

	public static void main(String[] args) {
		Contractemployee cemp=new Contractemployee("Mary", "Accountant", 24, 500, 600, 10000);
		cemp.setduration(6);
		cemp.Setphone(9823672);
		cemp.SetEmpcode(1002);
		cemp.setgender("Female");
		cemp.empdisplay();
		//cemp.disp();
		cemp.regularOffer(1000);
		cemp.seasonOffer(3000);
		

	}

}
