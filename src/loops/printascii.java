package loops;

import java.util.Scanner;

public class printascii {
    static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        for(i = 1; i<=n; i++ ){

            System.out.println((char)(i+65));

        }
    }
}
