package if_else;

import java.util.Scanner;

public class ternery_operator {
    static void main() {
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((n%2==0) ? "even" : "odd");


    }
}
