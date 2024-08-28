/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class SumofDivisors
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num=in.nextInt();
		System.out.print(sumd(num));
	}
	public static int sumd(int n) // if n=6 then its factors are 1,2,3,6 so its sum is 12
	{
	    int divisor=0;
	    for(int i=1;i<=n;i++)
	    {
	        if(n%i==0)
	        {
	            divisor+=i;
	        }
	    }
	    return divisor;
	}
}