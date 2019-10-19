package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    public static int sumaCifara(int broj){
        int suma=0;
        while(broj!=0){
            suma+=broj%10;
            broj/=10;
        }
        return suma;
    }
    public static void main(String[] args) {
	    int n;
	    Scanner ulaz = new Scanner(System.in);
	    System.out.print("Unesite n: ");
	    n = ulaz.nextInt();
	    System.out.print("Brojevi izmedju 1 i n djeljivi sa sumom svojih cifara su: ");
	    for(int i=2; i<n; i++) {
            int suma = sumaCifara(i);
            if (i % suma == 0)
                System.out.println(i);
        }
    }
}
