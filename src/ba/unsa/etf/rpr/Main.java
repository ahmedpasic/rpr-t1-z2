package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int n;
	    Scanner ulaz = new Scanner(System.in);
	    System.out.print("Unesite n: ");
	    n = ulaz.nextInt();
	    System.out.print("Brojevi izmedju 1 i n djeljivi sa sumom svojih cifara su: ");
	    for(int i=2; i<n; i++) {
            int temp = i;
            int suma = 0;
            while (temp != 0) {
                suma += temp % 10;
                temp /= 10;
            }
            if (i % suma == 0)
                System.out.println(i);
        }
    }
}
