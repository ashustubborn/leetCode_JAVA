import java.util.Scanner;

public class RecursionFibonacci {
    static int Func(int n) {
        if (n <= 1) {
            return n;
        }

        return Func(n - 1) + Func(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci series:");
        for (int i = 0; i < n; i++) {
            System.out.print(Func(i) + " ");
        }
        sc.close();
    }
}
