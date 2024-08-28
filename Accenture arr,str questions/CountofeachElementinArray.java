import java.util.HashMap;
import java.util.Map;
public class CountofeachElementinArray 
{
    public static Map<Integer,Integer> countfreq(int [] arr)
    {
        Map<Integer,Integer> map= new HashMap<>();
        for(int i:arr)
        {
            if(map.containsKey(i))
            {
                map.put(i,map.getOrDefault(i,0)+1);
            }
            else{
                map.put(i,1);
            }
        }
        return map;
    } 
    public static void main(String[] args)
    {
        int [] arr={1,1,1,1,1,2,3,4,5};
        Map<Integer,Integer> res= countfreq(arr);
        for(Map.Entry<Integer,Integer> entry: res.entrySet())
        {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}

// sorting array by increasing freq

/*import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        
        // Test case 1
        int[] nums1 = {1,2,2,3,3,3,4,4,5,5,5,5,6,6,6,7,8,9,10};
        System.out.println("Sorted by frequency (ascending) and value (descending): " +
            Arrays.toString(main.frequencySort(nums1)));
    }
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        Integer[] ints = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ints[i] = nums[i];
            counts.put(nums[i], counts.getOrDefault(nums[i], 0) + 1);
        }
        Arrays.sort(ints, (a,b) -> {
            int freqA = counts.get(a);
            int freqB = counts.get(b);
            if (freqA == freqB) {
                return b-a;
            } else {
                return freqA - freqB;
            }
        });

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = ints[i];
        }
        return res;
    }
}*/