import java.util.*;
public class FreqofChar 
{
    public static Map<Character,Integer> countfreq(String s)
    {
        Map<Character,Integer> map= new HashMap<>();
        for(char i:s.toCharArray())
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
        String str= "aabbccc";
        Map<Character,Integer> res= countfreq(str);
        for(Map.Entry<Character,Integer> entry: res.entrySet())
        {
            System.out.print(entry.getKey()+""+entry.getValue());
        }
    }
    
}
