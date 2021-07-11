import java.util.*;

class CalculateBill
{
	Scanner sc =new Scanner(System.in);
	float standardPrice=1.2f;
	float totalCost;
	int units;
	void get()
	{
		System.out.println("----Calculating Electricity Bill-----");
		System.out.println("Enter the Units:");
	    units = sc.nextInt();
	}
	void calculate()
	{
		//System.out.println("Calculating Total Electricity Bill");
		if(units<100)
		{
			totalCost=standardPrice*units;
		}
		else if(units<=300 && units>100)
		{
			totalCost= (100*standardPrice)+2*(units-100);
		}
		else if(units>300)
		{
			totalCost=(100*standardPrice)+(2*200)+3*(units-300);
		}
	}
	void show()
	{
		System.out.println("Electricity Bill is:"+totalCost); 
	}
}
public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateBill c = new CalculateBill();
		c.get();
		c.calculate();
		c.show();

	}

}
