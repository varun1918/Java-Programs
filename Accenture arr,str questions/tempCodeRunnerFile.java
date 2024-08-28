import java.util.LinkedHashSet;
import java.util.Set;
public class RemoveDuplicatesArray
{
    public static Set<Integer> removeduplicates(int[] arr)
    {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i:arr)
        {
            set.add(i);
        }
        return set;
    }
    public static void main(String[] args) {
        int []arr={1,2,2,3,4,5};
        Set<Integer> res= removeduplicates(arr);
        System.out.println(res);
    }
}