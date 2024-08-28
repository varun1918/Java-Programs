import java.util.HashSet;
public class HashSetex
{
	public static void main(String[] args) {
		int []a={3,1,2,2,5,6,7,1};
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int x:a)
		{
		    hs.add(x);
		}
		System.out.println(hs);
	}
}
