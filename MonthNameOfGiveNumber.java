package Day2_PP;

import java.util.Scanner;

public class MonthNameOfGiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number between 1 to 12 to get month name");
        int month = sc.nextInt();
        switch (month)
        {
            case 1:
                System.out.println(month + " : jan");
                break;
            case 2:
                System.out.println(month + " : feb");
                break;
            case 3:
                System.out.println(month + " : mar");
                break;
            case 4:
                System.out.println(month + " : apr");
                break;
            case 5:
                System.out.println(month + " : may");
                break;
            case 6:
                System.out.println(month + " : jun");
                break;
            case 7:
                System.out.println(month + " : july");
                break;
            case 8:
                System.out.println(month + " : aug");
                break;
            case 9:
                System.out.println(month + " : sept");
                break;
            case 10:
                System.out.println(month + " : oct");
                break;
            case 11:
                System.out.println(month + " : nov");
                break;
            case 12:
                System.out.println(month + " : dec");
                break;

        }

    }
}
