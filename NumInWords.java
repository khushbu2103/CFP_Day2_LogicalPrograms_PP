package Day2_PP;

import java.util.Scanner;

public class NumInWords {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter any number between 0-9");
        int num = sr.nextInt();
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        System.out.println(arr[num]);
    }
}
