package Day2_PP;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++)
        {
            sum = sum + i;
        }
        System.out.println("sum of given natural number: " + sum);
    }
}
