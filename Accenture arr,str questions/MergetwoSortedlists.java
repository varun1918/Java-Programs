/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class MergetwoSortedlists
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> l1= new ArrayList<>();
		List<Integer> l2= new ArrayList<>();
		int n=sc.nextInt();
		for(int i =0; i<n; i++)
		{
			int input = sc.nextInt();
			l1.add(input);
		}
		for(int i =0; i<n; i++)
		{
			int input = sc.nextInt();
			l2.add(input);
		}
		List<Integer>mergelist=new ArrayList<>(l1);
		mergelist.addAll(l2);
        Integer[] numberArray = mergelist.toArray(new Integer[0]);
        Arrays.sort(numberArray);
		System.out.print(Arrays.toString(numberArray));
	}
}