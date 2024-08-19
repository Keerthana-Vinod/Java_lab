import java.util.*;
import java.lang.*;
class transpose
{
   public static void main(String args[])
    {
	int trans[][]=new int[100][100];
	int num[][]=new int [100][100];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of rows and columns of the matrix");
	int row=sc.nextInt();
	int col=sc.nextInt();
	System.out.println("Enter the elements os the matrix");
	for(int i=0;i<row;i++)
	{
	  for(int j=0;j<col;j++)
	  {
	    num[i][j]=sc.nextInt();
 	  }
	}
	for(int i=0;i<row;i++)
	{ 
	  for(int j=0;j<col;i++)
	  {
		trans[i][j]=num[j][i];
	  }
	}
	for(int i=0;i<row;i++)
	{
	  for(int j=0;j<col;j++)
	  {
		System.out.println("Then transpose of the matrix is:"+trans[i][j]);
	  }
	}
     }
}

 
