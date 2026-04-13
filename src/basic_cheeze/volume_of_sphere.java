package basic_cheeze;

import java.util.Scanner;

public class volume_of_sphere {
    static void main() {
        System.out.print("Enter the radius of the sphere :");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double Vol_of_sphere = 4.0/3.0*3.14*r*r*r;// very important 4/3*3.1415926*r*r*r;
                                                    // int divide int = int therefore the 4/3 = 1 and we get false value;


        System.out.println("The Volume of teh sphere is "+ (double)Vol_of_sphere);

    }
}
