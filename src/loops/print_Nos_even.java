package loops;

import java.util.Scanner;

public class print_Nos_even {
    static void main(String[] args) {
        System.out.print("enter n :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i<=n;i++){
            if (i%2==0){
                System.out.println(i);
            }
            else System.out.println(" ");

        }
    }
}
