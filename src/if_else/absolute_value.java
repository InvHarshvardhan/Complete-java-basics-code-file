package if_else;
import java.util.Scanner;

public class absolute_value {
    static void main(String[] args) {
        System.out.println("Enter the Number :");// enetr the number
        Scanner sc = new Scanner(System.in); //taking inputs from user
        int n = sc.nextInt();// scanner the integer
        if(n<0) System.out.println("The abosulte value of integer "+ -n);// if the enter value is less than 0 then multiply the -ve sign
        else  System.out.println("The abosulte value of integer "+n);// else just print the integer as normal

    }
}
