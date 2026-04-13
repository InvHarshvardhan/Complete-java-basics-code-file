package if_else;

import java.util.Scanner;

public class Four_digit_number_or_not {
    static void main(String[] args) {
        System.out.print("Enter the four digit number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>999 && n<10000)System.out.println("Yes it is a four digit number :");
        else System.out.print("Not a four digit :");

    }
}
