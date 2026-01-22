import java.util.Scanner;

abstract class Student{
    int rollno;
    int Regno;

    void getinput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number : ");
        rollno = sc.nextInt();
        System.out.print("Enter registration number : ");
        Regno = sc.nextInt();
    }

    abstract void Course();
}

class kiitian extends Student{
    void Course(){
        System.out.println("Course : B.Tech.");
    }

    void display(){
        System.out.println("Roll Number: " +rollno);
        System.out.println("Registration Number: "+Regno);
    }
}

class Main{
    public static void main(String[] args){
        kiitian k = new kiitian();
        k.getinput();
        k.display();
        k.Course();
    }
}