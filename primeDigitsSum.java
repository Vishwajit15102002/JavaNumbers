public class primeDigitsSum {
    public static void main(String[] args) {
        int a = 23;
        int ans = divide(a);
        System.out.println("The sum of prime digits of a number is : " + ans);

    }

    public static int divide(int num) {
        int result, sum = 0;
        while (num != 0) {
            result = num % 10;
            boolean b = isPrime(result);
            {
                if (b) {
                    sum = sum + result;
                }
            }
            num = num / 10;
        }
        return sum;

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
}
