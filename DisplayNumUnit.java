package Day2_PP;

import java.util.Scanner;

public class DisplayNumUnit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n1 = num, n2 = num, n3 = num, n4 = num;
         int a, b, c, d;
        a = n1/10; b = n2%10; //88 12
        c = n3/100; d = n4%100;
        String[] singleDigit = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] twoDigit = {"", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] multiDigit = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] multiThreeDigit = {"", "one hundred", "two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred"};

       // String[]
        if(b == 0)
        {
            System.out.println(multiDigit[a]);
        }
        else if(a == 1 && b != 0 )
        {
            System.out.println(twoDigit[a+b]);
        }
        else if(a==0 )
        {//678
            System.out.println (singleDigit[b]);
        }
        else if (b != 0 && a != 0)
        {
            System.out.println(multiDigit[a]+" "+singleDigit[b]);
        }
        else if(c != 0 && d != 0)
        {
            System.out.println(multiThreeDigit [c]+ " "+singleDigit[d] );
        }
        else {//167
            System.out.println( multiThreeDigit[c]+" "+ multiDigit[b]+" " +singleDigit[d]);
        }
    }
}
