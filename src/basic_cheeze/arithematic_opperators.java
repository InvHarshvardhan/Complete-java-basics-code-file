package basic_cheeze;

import java.util.Scanner;

public class arithematic_opperators {
    static void main() {
        // Write a program to calculate about area of circle
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the Circle : ");
        r = sc.nextInt();
        double Area_of_Circle = 3.1415*r*r;
        System.out.println(Area_of_Circle);
    }
}
