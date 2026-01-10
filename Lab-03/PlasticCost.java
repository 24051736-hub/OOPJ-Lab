import java.util.Scanner;

class Sheet2D{
    double length;
    double breadth;
    final double Cost_per_sqft = 40;

    Sheet2D(double length , double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    double Calculate_Area(){
        return length * breadth;
    }

    double Calculate_Cost(){
        return Calculate_Area() * Cost_per_sqft;
    }
}

class Box3D extends Sheet2D {
    double height;
    final double COST_PER_CUFT = 60;

    Box3D(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    double calculateVolume() {
        return length * breadth * height;
    }

    double Calculate_Cost() {
        return calculateVolume() * COST_PER_CUFT;
    }
}

public class PlasticCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. 2D Sheet");
        System.out.println("2. 3D Box");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter length: ");
            double l = sc.nextDouble();
            System.out.print("Enter breadth: ");
            double b = sc.nextDouble();

            Sheet2D sheet = new Sheet2D(l, b);
            System.out.println("Cost = Rs " + sheet.Calculate_Cost());

        } else if (choice == 2) {
            System.out.print("Enter length: ");
            double l = sc.nextDouble();
            System.out.print("Enter breadth: ");
            double b = sc.nextDouble();
            System.out.print("Enter height: ");
            double h = sc.nextDouble();

            Box3D box = new Box3D(l, b, h);
            System.out.println("Cost = Rs " + box.Calculate_Cost());
        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
