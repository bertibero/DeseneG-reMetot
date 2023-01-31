import java.util.Scanner;

public class Main {
    static void pattern(int n) {
        System.out.print(n + " ");
        if (n <= 0)
            return;
        pattern(n - 5);
        System.out.print(n + " ");

    }
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        n = input.nextInt();
        input.close();
        pattern(n);
    }
}