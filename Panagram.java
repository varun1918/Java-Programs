/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.util.HashSet;
public class Panagram
{
	public static void main(String[] args)
	{
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter a string:");
        String str = in.nextLine();
        Panagram pg = new Panagram();
        boolean result = pg.isPanagram(str);
        if(result) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }
	}
	boolean isPanagram(String str)
	{
	    Set<Character> list=new HashSet<>();
	    for(char x:str.toLowerCase().toCharArray())
	    {
	        if(x>='a'&&x<='z')
	        {
	            list.add(x);
	        }
	    }
	    return list.size()==26;
	}
}