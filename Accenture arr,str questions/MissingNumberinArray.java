import java.util.*;
public class MissingNumberinArray 
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size:");
		int n=in.nextInt();
        System.out.println("enter arr elements:");
		int []arr=new int[n]; 
		for(int i=0;i<arr.length;i++)
		{
		    arr[i]=in.nextInt();
		}
        System.out.println("the missing element is : "+missing_ele(arr,n));
    }
    public static int missing_ele(int[] arr,int n)
    {
       // int n= arr.length +1;
        int sum=0;
        int total;
        for(int i=0;i<n-1;i++)
        {
            sum+=arr[i];
        }
        total=(n*(n+1))/2;
        return total-sum;
    }
}


