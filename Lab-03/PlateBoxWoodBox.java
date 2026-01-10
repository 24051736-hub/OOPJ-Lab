import java.util.Scanner;

class Plates{
    double length , width;
    Plates(double length , double width){
        this.length = length;
        this.width = width;
        System.out.println("Plate Constructor Called.");
        System.out.println("Length = " +length + " width = " +width);
    }
}

class Box extends Plates {
    double height;
    Box(double length , double width , double height){
        super(length, width);
        this.height = height;
        System.out.println("Box Constructor Called.");
        System.out.println("Height = " +height);
    }
}

class WoodBox extends Box {
    double thickness;
    WoodBox(double length , double width , double height , double thickness){
        super(length, width , height);
        this.thickness = thickness;
        System.out.println("WoodBox Constructor Called.");
        System.out.println("thickness = " +thickness);
    }
}

public class PlateBoxWoodBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter width: ");
        double w = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        System.out.print("Enter thickness: ");
        double t = sc.nextDouble();

        WoodBox wb = new WoodBox(l, w, h, t);

        sc.close();
    }
}