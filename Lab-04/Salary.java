import java.util.Scanner;

interface Salary{
    void earnings();
    void deductions();
    void bonus();
}

abstract class Manager implements Salary {
    double basic , da , hra , pf;

    Manager(double basic){
        this.basic = basic;
    }

    public void earnings(){
        da = 0.80 * basic;
        hra = 0.15 * basic;
        System.out.println("Earnings = " +(basic + da + hra));
    }

    public void deductions(){
        pf = 0.12 * basic;
        System.out.println("PF Deduction = " +pf);
    }
}

class Substaff extends Manager {

    Substaff(double basic){
        super(basic);
    }

    public void bonus(){
        double bonus = 0.50 * basic;
        System.out.println("Bonus = " +bonus);
    }
}

class SalaryDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();
        Substaff s = new Substaff(basic);
        s.earnings();
        s.deductions();
        s.bonus();

        sc.close();
    }
}