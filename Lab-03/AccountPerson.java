import java.util.Scanner;

class Account{
    int acc_no;
    double balance;

    void input(Scanner sc){
        System.out.print("Enter Account no. : ");
        acc_no = sc.nextInt();

        System.out.print("Enter balance : ");
        balance = sc.nextDouble();
    }

    void disp(){
        System.out.println("Account no. : " +acc_no);
        System.out.println("Balance : " +balance);
    }
}

class Person extends Account{
    String name;
    long aadhar_no;

    void input(Scanner sc){
        sc.nextLine();
        System.out.print("\nEnter name : ");
        name = sc.nextLine();

        System.out.print("Enter aadhar no. : ");
        aadhar_no = sc.nextLong();

        super.input(sc);
    }

    @Override
    void disp(){
        System.out.println("Name : " +name);
        System.out.println("Aadhar no. : " +aadhar_no);
        System.out.println("Account no. : " +acc_no);
        System.out.println("Balance : " +balance);
    }
}

public class AccountPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] p = new Person[3];

        for(int i = 0 ; i < 3 ; i++){
            System.out.print("\nEnter person " + (i + 1) +" Details : ");
            p[i] = new Person();
            p[i].input(sc);
        }

        System.out.println("\n---Displaying Details of three persons---");

        for(int i = 0; i < 3; i++){
            System.out.println("\nPerson " +(i+1) + " : ");
            p[i].disp();
        }

        sc.close();
    }
}