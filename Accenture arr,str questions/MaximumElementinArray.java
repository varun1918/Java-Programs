// max element in array
import java.util.*;
public class MaximumElementinArray
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
        System.out.println("the max element is : "+max(arr));
    }
    public static int max(int[] arr)
    {
        int m=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>m)
            {
                m=arr[i];
            }
           // return m;
        }
        return m;
	}
}