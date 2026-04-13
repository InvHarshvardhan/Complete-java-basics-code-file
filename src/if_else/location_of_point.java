package if_else;

import java.util.Scanner;

import static java.text.ChoiceFormat.nextDouble;

public class location_of_point {
    static void main(String[] args) {
        System.out.print("Enter x coordinate :");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.println("Enter y coordinate :");
        double y  = sc.nextDouble();
        if (x>0 && y>0)System.out.println("THE ENTERED COORDINATE IS PLACED IN FIRST QUADRANT ");
        else if (x<0 && y> 0) System.out.println("THE ENTERED COORDINATES ARE PLACED IN 2ND QUARANT");
        else  if (x<0 && y<0) System.out.println("THE ENTERED COORDINATES ARE PLACED IM 3RD QUADRANT ");
        else System.out.println("THE ENTERED COORDINATE IS PRESENT IN 4TH QUADRANT ");
    }
}
