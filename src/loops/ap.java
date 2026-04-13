package loops;

import java.util.Scanner;

public class ap {
    static void main(String[] args) {
        System.out.print("Enter the number of terms :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i<=n; i+=3){
            System.out.println(i);
        }
    }
}
