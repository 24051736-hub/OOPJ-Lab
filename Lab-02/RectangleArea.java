import java.util.Scanner;

class Rectangle {
    double length;
    double breadth;

    Rectangle() {
        length = 0;
        breadth = 0;
    }

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void area() {
        double area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }
}

class CalculateArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rectangle r1 = new Rectangle();
        System.out.println("Using default constructor:");
        r1.area();

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        Rectangle r2 = new Rectangle(l, b);
        System.out.println("Using parameterized constructor:");
        r2.area();
    }
}
