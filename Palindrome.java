package Day2_PP;

import java.util.Scanner;

public class Palindrome {
    public static void reverseNumber()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number"); //456
        int num = sc.nextInt();
        int reverse = 0;
        int reminder = 0;
        int temp = num;
        if(num <= 9 )
        {
            System.out.println(num);
        }
        else
        {
            while (num != 0)
            {
                reminder = num%10; //6
                reverse = (reverse * 10) + reminder;
                num = num / 10;
            }
            if(temp == reverse)
                System.out.println( temp + " : is palindrome");
            else
                System.out.println(temp + " : is not a palindrome");
           // System.out.println(reverse);

        }
        //return reverse;
    }

//    public static void palindromeNumber(int n) {
//        int output = reverseNumber();
//        if(n == output)
//            System.out.println("number is palindrome");
//        else
//            System.out.println("number is not palindrome");
//    }
    public static void main(String[] args) {
       reverseNumber();
      // palindromeNumber(131);

    }
}
