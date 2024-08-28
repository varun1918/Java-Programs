/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// max element in array
import java.util.*;
public class RevArr
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int []arr=new int[n]; 
		for(int i=0;i<arr.length;i++)
		{
		    arr[i]=in.nextInt();
		}
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void rev(int[] arr)
    {										//start    //end
      int start=0;  						// 0 1 2 3 4 -> index
      int end=arr.length-1;					// 1 2 3 4 5 -> array
      while(start<end)						// st++; oth index move to 1 and end--; one position come front untill it reaches a middle element its get swapped 
      {										// 5 4 3 2 1
          swap(arr,start,end);
          start++;
          end--;
      }
	}
	static void swap(int[]arr,int i1,int i2)
	{
	    int t=arr[i1];
	    arr[i1]=arr[i2];
	    arr[i2]=t;
	}
}