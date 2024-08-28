import java.util.*;
public class IntersectionofArrays 
{
    public static List<Integer> intersection(int[] nums1, int[] nums2)
     {
        int i=0;
        int j=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(i<nums1.length && j <nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                i++;
            }
            else if(nums2[j]<nums1[i])
            {
                j++;
            }
            else{
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        return list;
    }
    public static void main(String[] args) 
    {
        int A[]= {1,2,3,3,4,5,6,7};
        int B[]= {3,3,4,4,5,8};
        List<Integer> res= intersection(A,B);
        for(int j:res)
        {
            System.out.print(j+" ");
        }
    }
}
