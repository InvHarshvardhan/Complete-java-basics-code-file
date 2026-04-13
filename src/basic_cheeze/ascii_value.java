package basic_cheeze;

import java.util.Scanner;

public class ascii_value {
    static void main() {
        char ch = 'B';// storing B in char container named as ch
        int x = ch;// restoring storing the charector stored in ch in integer container
            // computer knows a charector cannot be stored in the contauner of int
        // therefore A wil  be coverted into the corresponding ascii value
        System.out.println(x); // we get the ascii value of the B
        Scanner sc = new Scanner(System.in);//import the scanner and it is the new scanner  and produces system input
        int y = sc.nextInt();// inside the integer container of the y we are storing values
        char cr = (char)y;// we are storing y in char container but y is getting typescript
        System.out.println(cr);

        int z =  sc.nextInt();
        System.out.println((char)z);
        int a = sc.nextInt();
        System.out.println(a+0);
    }
}
