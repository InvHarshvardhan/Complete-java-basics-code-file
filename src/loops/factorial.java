package loops;

import java.util.Scanner;

public class factorial {
    static void main() {
        System.out.print("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;// the first number we want is 1 as factrial of 0 and 1 is 1 but it has greater
        for(int i = 1; i<= n; i++) {
            fact *= i;
            System.out.println(fact);
        }
        System.out.print(" = the final factorial "+fact);


        }


        }


