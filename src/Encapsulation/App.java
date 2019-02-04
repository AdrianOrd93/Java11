package Encapsulation;

import java.util.Scanner;

public class App extends Prime {
    public static void main(String[] args) {
        Prime prime = new Prime();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe od ktorej zaczniemy: ");
        int x = Integer.parseInt(scanner.next());
        System.out.println("Podaj liczbe na ktorej zakonczymy: ");
        int y = Integer.parseInt(scanner.next());
        System.out.println("Liczby pierwsze z przedziału: ["+ x +", "+ y +"] to: "+ prime.listOfPrimes(x, y));
    }
}
