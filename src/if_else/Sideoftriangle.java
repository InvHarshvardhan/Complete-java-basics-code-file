package if_else;

import java.util.Scanner;

public class Sideoftriangle {
    static void main(String[] args) {
        System.out.println("ENTER THE LENGHT OF SIDES OF TRIANGLE");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a+b > c && a+c > b && b+c > a)System.out.println("the sides are possible to be a traingle");
        else System.out.print("not a Trainagle");
    }
}
