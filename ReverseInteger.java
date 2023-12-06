package Day2_PP;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number"); //456
        int num = sc.nextInt();
        int reverse = 0;
        int reminder = 0;
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
            System.out.println(reverse);
        }
    }
}
