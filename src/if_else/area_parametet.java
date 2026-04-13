package if_else;

import java.util.Scanner;

public class area_parametet {
    static void main(String[] args) {
        System.out.print("Enter length :");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        System.out.println("Enter the width");
        int b = sc.nextInt();
        System.out.println("the area of the rectangle: "+ l*b);
        System.out.println("The parameter of the rectangle : "+ 2*(l+b));

    }
}
