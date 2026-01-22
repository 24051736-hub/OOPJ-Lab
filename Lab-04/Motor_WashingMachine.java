interface Motor{
    int capacity = 5;
    void run();
    void consume();
}

class WashingMachine implements Motor {
    public void run(){
        System.out.println("Washing machine is running");
    }

    public void consume() {
        System.out.println("Washing machince consumes electricity");
    }

    void displayCapacity(){
        System.out.println("Motor capacity = " +capacity);
    }
}

class InterfaceDemo{
    public static void main(String[] args){
        WashingMachine wm = new WashingMachine();

        wm.run();
        wm.consume();
        wm.displayCapacity();
    }
}