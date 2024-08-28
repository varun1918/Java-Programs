/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Anagram
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("enter string:");
	    String str1= in.nextLine();
	    //System.out.println("enter string:");
	     String str2= in.nextLine();
	    Anagram ag= new Anagram();
	    boolean res= ag.isAnagram(str1,str2);
	    if(res)
	    {
	        System.out.println(" The given string is anagram");
	    }
	    else{
	        System.out.println("The given string  is not anagram");
	    }
		
	}
	 boolean isAnagram(String s, String t) 
	 {
        if(s.length()!=t.length())
        {
            return false;
        }
        char a1[]=s.toCharArray();
        char a2[]=t.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1,a2);
    }
}