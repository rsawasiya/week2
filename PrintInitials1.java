public class PrintInitials1
{	
	public static void main(String [] arg)
	{
/*	Scanner sc=new Scanner(System.in);  
	System.out.println("Enter the initials:");
	String name=sc.next(); */
	int i,j;
	
	for(i=1;i<=9;i++)
	{
		for(j=9;j>i;j--)
		{
		System.out.print(" ");
		}
	
	
	System.out.print("*");

	if(i==5)
	
		System.out.print(" * * * ");
	else
	{
		for(j=1;j<(i-1)*2;j++)
		{
			
		System.out.print(" ");
		}
	}
		if(i==1)
			System.out.println();
		else
			System.out.println("*");
		
	
	}	
	}
}
