package tasks;

public class Task2Variables {
    public static void main(String[] args) {
        int[] tab = new int[3];
        tab[0] = 2;
        tab[1] = 4;
        tab[2] = 7;

        int sum  = tab[0] + tab[1] + tab[2];
        int multiplication = tab[0] * tab[1] * tab[2];

        System.out.println("Dodawanie tablic: " + sum);
        System.out.println("----------------------------");
        System.out.println("Mnożenie tablic: " + multiplication );
    }
}
