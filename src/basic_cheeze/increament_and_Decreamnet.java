package basic_cheeze;

import java.util.Scanner;

public class increament_and_Decreamnet {
    static void main() {
        System.out.println(" Date 10-04-26");
        int x; // declaration
        int y; // declaration
        int z; // declaration
        System.out.println("Enter the number and i will guess the previous next and at last the real number your thinking about ");
        Scanner sc = new Scanner(System.in);// Scasnner name sc is declared and new scanner has been printed also the data has been input into the system thats why system.in
        x = sc.nextInt();// whatever we write is going to save in x and it is going to return in Int
                        // if somehow we write Double x = sc.nextInt; that means that the whatever we are going to input
                        // it is going to add in a container that has capacities to store decimals but the type script sc.nextInt
                        // the returning value will be int that why we always write  Double int = sc.nextdouble();
        System.out.println("The next number "+ ++x);
        x = x-1;
        System.out.println("The previous number "+ --x);
        System.out.println("The present number "+ ++x); // you can write this also like this

    }
}
