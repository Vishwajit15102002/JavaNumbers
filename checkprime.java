public class checkprime {
    public static void main(String args[]) {
        int start = 1;
        int end = 100;
        while (start <= end) {
            if (isPrime(start)) {
                System.out.println(start);
            }
            start++;
        }
    }

    public static boolean isPrime(int num) {
        int i;
        for (i = 2; i <= num; i++) {
            if (num % i == 0) {
                break;
            }
        }
        if (i == num) {
            return true;
        } else {
            return false;
        }
    }
}
