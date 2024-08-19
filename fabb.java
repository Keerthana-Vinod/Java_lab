import java.util.Scanner;
class fibonacci
{
	public static void main(String[] args)
	{
	Scanner in=new Scanner(System.in);
	int n=10,num1=0,num2=1;
	System.out.println("fibonacci series up to"+n+");
	for(int i=1;i<=n;i++)
	{
	System.out.println(num1+""+num2);
	int nextTerm=num1+num2;
	num1=num2;
	num2=nextTerm;
	}
	}
}
