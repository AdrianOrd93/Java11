package tasks;

public class Task5Methods {
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(97));

    }
    private static String isPrimeNumber(int number) {
        if (number % 2 != 0) {
            return "Liczba jest pierwsza";
        }
        return "liczba nie jest pierwsza";
    }
}
