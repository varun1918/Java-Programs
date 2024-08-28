import java.util.*;
public class SecondMaximum 
{
    public static int secondmax(int [] arr)
    {
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                secmax=max;
                max=arr[i];
            }
            else if(arr[i]>secmax && arr[i]!=max)
            {
                secmax=arr[i];
            }
        }
        return secmax;
    }
    public static void main(String[] args)
    {
        int [] arr={1,2,3,4,5};
        System.out.println(secondmax(arr));
    }
    
}
