package tasks;

public class Task4ConditionalStatements {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000 ; i++) {
            if (i == 999) {
                System.out.println(i);
            }
            else if ((i % 3 == 0 || i % 7 == 0) && i != 0) {
                System.out.println(i + ", ");
            }
        }
    }
}