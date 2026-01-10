import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, original, reversed = 0, digit;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        original = n;

        while (n > 0) {
            digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }

        if (original == reversed) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }

        sc.close();
    }
}
