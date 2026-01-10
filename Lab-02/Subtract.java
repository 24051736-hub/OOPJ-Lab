class Subtract {

    void subtract(int a, int b) {
        System.out.println("Result (int, int): " + (a - b));
    }

    void subtract(int a, int b, int c) {
        System.out.println("Result (int, int, int): " + (a - b - c));
    }

    void subtract(double a, double b) {
        System.out.println("Result (double, double): " + (a - b));
    }
}

class SubtractResult {
    public static void main(String[] args) {

        Subtract obj = new Subtract();

        obj.subtract(10, 5);
        obj.subtract(20, 5, 3);
        obj.subtract(15.5, 4.2);
    }
}
