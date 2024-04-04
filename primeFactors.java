import java.util.*;

public class primeFactors {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        System.out.println("Prime factors of " + n + " are : ");
        for (int i = 2; i < n; i++) {
            while (n % i == 0) {
                System.out.println(i + " ");
                n /= i;
            }
        }
        if (n > 2) {
            System.out.println(n);
        }

    }
}
