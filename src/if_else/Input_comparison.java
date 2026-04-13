package if_else;

import java.util.Scanner;

public class Input_comparison {
    static void main(String[] args) {
        System.out.print("Enter the number to compare :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<69)System.out.println("The entered Number is Lesser than 69:");
        else if (n>69) System.out.println("The entered number is greater than 69");
        else System.out.print("the number is equal to 69" );
    }
}
