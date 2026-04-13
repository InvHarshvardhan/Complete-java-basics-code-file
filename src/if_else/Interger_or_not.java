package if_else;

import java.util.Scanner;

public class Interger_or_not {
    static void main(String[] args) {
        System.out.print("Enter teh number : ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = (int)x;
        if(n-x<0)System.out.println("Not a an integer :");
        else System.out.println("Integer");

    }
}
