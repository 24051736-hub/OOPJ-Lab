import java.util.Scanner;

class NameFormat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String firstName, lastName;

        System.out.print("Enter first name: ");
        firstName = sc.nextLine();

        System.out.print("Enter last name: ");
        lastName = sc.nextLine();

        System.out.println("Formatted Name: " + lastName + " " + firstName);

        sc.close();
    }
}
