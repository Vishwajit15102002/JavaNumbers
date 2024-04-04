public class sqOfDigits {
    public static void main(String[] args) {
        int a = 32;
        int ans = divide(a);
        System.out.println(ans);
    }

    public static int divide(int num) {
        int result = 0, temp = 0;
        while (num != 0) {
            result = num % 10;
            temp = digitSquare(temp);
            num = num / 10;
        }
        return p;
    }

    public static int digitSquare(int num) {
        int b = num * num;
        int sum = addition(b);
        return sum;
    }

    public static int addition(int num) {
        int c = 0;
        return c + num;
    }

}
