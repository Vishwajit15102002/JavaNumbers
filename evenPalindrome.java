public class evenPalindrome {

    public static void main(String args[]) {
        int a = 123;
        int ans = reverse(a);
        if (checkPalindrome(a, ans) && checkEven(a)) {
            System.out.println(a + " is even palindromic number");
        } else {
            System.out.println(a + " is not a even paindromic number");
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

    public static boolean checkPalindrome(int a, int rev) {
        return a == rev;
    }

    public static boolean checkEven(int num) {
        return num % 2 == 0;
    }

}