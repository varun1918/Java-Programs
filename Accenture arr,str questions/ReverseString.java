import java.util.*;
public class ReverseString
{
    public static String revstr(String str)
    {
        int l=str.length();
        String rev= " ";
        for(int i=l-1;i>=0;i--)
        {
            rev+=str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s= in.nextLine();
        System.out.println("the rev str is :"+revstr(s));
    }
}
