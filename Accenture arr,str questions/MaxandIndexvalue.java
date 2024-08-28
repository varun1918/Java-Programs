/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class MaxandIndexvalue
{
	public static void main(String[] args) {
		int arr[]={1,3,5,7,6,4};
		int[] result = maxandindex(arr);
		System.out.print(result[0]+","+result[1]);
	}
	public static int[] maxandindex(int arr[])
	{
	    int max=arr[0];
	    int index=0;
	    for(int i=0;i<arr.length;i++)
	    {
	        if(max<arr[i])
	        {
	            max=arr[i];
	            index=i;
	        }
	    }
	    return new int[]{max,index};
	}
}