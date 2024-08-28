//  MAGICAL NUMBER - find the binary equivalent of numbers in range and conditions like
// 1. if '0' na then replace it with '1'
// 2. if '1' na then replace it with '2'

//  // if ip-> n=4
// //         op-> 1

// 1->1->2->sum=2->even
// 2->10->21->sum=3->odd // this is only the magical number and its count is one 
// 3->11->22->sum=4->even
// 4->100->211->sum=4->even
    
import java.util.*;

public class MagicalNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res = magical(n);
        System.out.println(res);
    }

    private static int magical(int n) {
        int magicalcount = 0;
        for (int i = 1; i <= n; i++) {
            String inttobinary = Integer.toBinaryString(i);
            String replaced = replaceDigits(inttobinary);
            int totalsum = sumOfDigits(replaced);
            if (totalsum % 2 != 0) {
                magicalcount++;
            }
        }
        return magicalcount;
    }

    private static String replaceDigits(String inttobinary) {
        return inttobinary.replace('0', '1').replace('1', '2');
    }

    private static int sumOfDigits(String str) {
        int sum = 0;
        char[] arr = str.toCharArray();
        for (char c : arr) {
            sum += Character.getNumericValue(c);
        }
        return sum;
    }
}

