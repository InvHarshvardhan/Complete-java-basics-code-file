package if_else;

import java.util.Scanner;

public class greatest_of_three {
    static void main(String[] args) {
        System.out.print("Enter the three numbers ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (x>y && x>z ) System.out.println("First number is greatest " + x);
        else if (y>x && y>z) System.out.println("The second number is Greatest" + y);
        else System.out.println("The third number is greatest " + z);


    }
}
