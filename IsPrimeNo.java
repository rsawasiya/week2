import java.util.*;
public class IsPrimeNo
{
	public static boolean IsPrime(int no)
	{
	int i,j;
	int flag=0;
	for(i=2;i<no;i++)
	{
		if(no%i==0)
		{
		flag=0;
		break;
		}
		else
		{
			flag=1;
		}	
	}
	if(flag==1)
		return true;
	else
		return false;
	}


public static void main(String args[])
{	int no;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a no:");
	no=sc.nextInt();
	System.out.println(no+"is prime "+IsPrime(no));
}

}
