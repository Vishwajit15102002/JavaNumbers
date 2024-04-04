public class twistedPrime {
    public static void main(String[] args) {
        int a = 43;
        int ans = reverse(a);
        if (isPrime(a)) {
            if (isPrime(ans)) {
                System.out.println("It is twisted prime number");
            } else {
                System.out.println("It is a prime number but not twisted prime number");
            }
        } else {
            System.out.println("It is not a prime number");
        }

    }

    public static boolean isPrime(int n) {
        int i;
        for (i = 2; i <= n; i++) {
            if (n % i == 0) {
                break;
            }
        }
        if (i == n) {
            return true;
        } else {
            return false;
        }

    }

    public static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num = num / 10;
        }
        return rev;
    }
}