package com.company;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car(4, 5, 1800);
        car1.printInfo();
        System.out.println();
        Motorcycle motorcycle1 = new Motorcycle(2, 170);
        motorcycle1.printInfo();
        System.out.println();
        Car car2 = new Car(4, 3, 11800);
        car2.printInfo();
        System.out.println();
        Motorcycle motorcycle2 = new Motorcycle(2,240);
        motorcycle2.printInfo();
    }
}
