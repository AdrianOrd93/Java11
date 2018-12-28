package tasks;

public class Task3Loops {
    public static void main(String[] args) {
        int[] tab = {4, 6, 2, 9, 7};
        int sum = 0;

        for (int i : tab) {
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Suma wszystkich elementów: " + sum);
    }
}
