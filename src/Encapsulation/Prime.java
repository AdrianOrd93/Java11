package Encapsulation;

import java.util.*;

public class Prime {
    public String listOfPrimes(int x, int y) {
        List<Integer> liczbyPierwsze;
        liczbyPierwsze = score(x, y);

        return String.valueOf(liczbyPierwsze);
    }

    private List<Integer> score(int x, int y) {
        List<Integer> liczbyPierwsze = new ArrayList<>();
        for (; x <= y; x++) {
            if (isPrime(x) && x != 1){
                liczbyPierwsze.add(x);
            }
        }
        return liczbyPierwsze;
    }

    private boolean isPrime(int x) {
        boolean isPrime = true;
        int counter = x-1;
        for (; counter>1; counter--) {
            if (x%counter ==0 ) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
