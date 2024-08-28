// Find  the largest number that can be formed by permutation

import java.util.*;

class LargePermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // getting input as string [3,30,34,5,9]
        String result = processString(str);
        System.out.println(result); // output: 9543330f
    }

    public static String processString(String str) {
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' && str.charAt(i) != '[' && str.charAt(i) != ']' && str.charAt(i) != ',') {
                newstr += str.charAt(i); // removing the spaces and other spl charectors and appending each number into the string
            }
        }
        char[] arr = newstr.toCharArray(); // converting string to char array for sorting
        Arrays.sort(arr);
        StringBuilder result = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            result.append(arr[i]);
        }
        return result.toString();
    }
}

/*import java.util.*;

class Largepermutaion {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // getting input as string [3,30,34,5,9]
        String newstr = "";
        for (int i = 0; i < str.length(); i++)
            if(str.charAt(i) != ' ') // removing the spaces and appending each number into the string
                newstr += str.charAt(i);
        char [] arr = newstr.toCharArray(); // converting string to char array for sorting
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i]); // output: 9543330
    }
} */
