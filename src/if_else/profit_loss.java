package if_else;

import java.util.Scanner;

public class profit_loss {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Cost Price:");
        double cp = sc.nextDouble();
        System.out.print("Enter the Selling Price :");
        double sp = sc.nextDouble();
        if(cp<sp)System.out.println("Profit " +(sp-cp));
        else if(cp>sp)System.out.println("Loss " + (cp-sp));
        else System.out.println("No profit No loss ");


    }


}
