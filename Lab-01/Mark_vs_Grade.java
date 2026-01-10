import java.util.Scanner;
class Mark_vs_Grade{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int marks;
        System.out.print("Enter marks: ");
        marks = sc.nextInt();

        if(marks >= 90 && marks <= 100) System.out.println("Grade O");
        else if(marks >= 80 && marks < 90) System.out.println("Grade E");
        else if(marks >= 70 && marks < 80) System.out.println("Grade A");
        else if(marks >= 60 && marks < 70) System.out.println("Grade B");
        else if(marks >= 50 && marks < 60) System.out.println("Grade C");
        else if(marks >= 40 && marks < 50) System.out.println("Grade D");
        else if(marks >= 0 && marks < 40) System.out.println("Grade F (Fail)");
        else System.out.println("Invalid marks");
        sc.close();
    }
}