/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Rev_Integer
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int on=n;
	    int r=0;
	    int sign= (n<0)?-1:1;
	    n=Math.abs(n);
	    while(n>0)
	    {
	        int d=n%10; //if(r>(Integer.MAX_VALUE-d)/10){ return 0;}
                        // it is used to check whther it exceeds or not
	        r=r*10+d;
	        n=n/10;
	    }
	    r=r*sign;
	    System.out.println("original:"+on);
	    System.out.println("reversed:"+r);
	    in.close();
	}
}