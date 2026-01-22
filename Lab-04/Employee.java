import java.util.Scanner;
interface Employee{
    void getDetails();
}
interface Manager extends Employee{
    void getDeptDetails();
}
class Head implements Manager{
    int empId , deptId;
    String empName , deptName;
    Scanner sc = new Scanner(System.in);

    public void getDetails(){
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();
    }

    public void getDeptDetails() {
        System.out.print("Enter Department ID: ");
        deptId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Department Name: ");
        deptName = sc.nextLine();
    }

    void display(){
        System.out.println("\n---Head of Department Details---");
        System.out.println("Employee ID : " +empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Department ID: " +deptId);
        System.out.println("Department Name: " +deptName);
    }
}

class InterfaceDemo{
    public static void main(String[] args){
        Head h = new Head();
        h.getDetails();
        h.getDeptDetails();
        h.display();
    }
}