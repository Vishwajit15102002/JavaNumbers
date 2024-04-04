// Ugly numbers are those numbers whose prime factors are 2,3,5 only

public class uglyNumber {
    public static void main(String[] args) {
        int start = 1;
        int end = 10;
        while (start <= end) {
            if (isUgly(start)) {
                System.out.println(start
                        + " is an ugly number");
            }
            start++;
        }
    }

    public static boolean isUgly(int num) {
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 3 == 0) {
                num /= 3;
            } else if (num % 5 == 0) {
                num /= 5;
            } else {
                break;
            }
        }
        if (num == 1) {
            return true;
        } else {
            return false;
        }
    }
}
