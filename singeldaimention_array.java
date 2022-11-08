package ARRAY;

import java.util.Scanner;

public class singeldaimention_array 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner len =new Scanner(System.in);
		System.out.println("ENTER THE LENTH");
		         int lc=len.nextInt();
                 int[] ab=new int[lc];
                 int total=0;
            	 System.out.println("ENTER THE VALUVE");
            	 for(int i=0;i<ab.length;i++)
            	 {
            	 ab[i] =len.nextInt();
            	 total=total+ ab[i];
                 }
            	System.out.println("total value="+total );
	}

}
