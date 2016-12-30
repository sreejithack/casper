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
		int totalPurchaseAmount=cemp.regularOffer(9000);
		int amount=cemp.seasonOffer(4900);
		if(totalPurchaseAmount>=2500&&amount>=2500)
		{
			int x=totalPurchaseAmount*15/100;
			
			int total=totalPurchaseAmount-x;
			System.out.println("totalPurchaseAmount:"+total);
			 int y=amount*8/100;
			int totalamount=amount-y;
			System.out.println("Amount :"+totalamount);
			int  payEmi= 0;
			payEmi=total-totalamount;
			System.out.println("Amount to be paid:"+payEmi);
		}

	}

}
