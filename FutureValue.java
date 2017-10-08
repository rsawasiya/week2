import java.util.*;
public class FutureValue
{
	public static double futureValue(int amount)
	{
	double futurevalue;
	int T,r;
	float C=12;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no. of years:");
	T=sc.nextInt();
	System.out.println("Enter the no. of times amount to be Compounded:");
	r=sc.nextInt();
	futurevalue=C*Math.pow((1+r),T);
	return futurevalue;
	}
public static void main(String args[])
{
	int amount;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the amount to be invested:");
	amount= sc.nextInt();
	System.out.println("Future value is"+futureValue(amount));
}

}
