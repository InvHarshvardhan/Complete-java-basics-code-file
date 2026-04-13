package basic_cheeze;

import java.util.Scanner;

public class scanner_sc {
    static void main() {

        int x;
        int y;
        x = 9;
        y = 10;
        System.out.println(x + y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
        System.out.println("enter the number :");
        Scanner sc = new Scanner(System.in);
        double z = sc.nextInt();
        System.out.println(z);
        System.out.println(z - y);
        int zoro = 200;
        int zoro_bounty = 99;
        int luffy_bounty = 100;
        System.out.println("Zoro rank "+zoro);
        System.out.println("Monkey D Luffy Bounty "+zoro_bounty);
        System.out.println("Luffy D Dragon " + luffy_bounty);
    }
}