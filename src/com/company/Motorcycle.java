package com.company;

public class Motorcycle extends Vehicle {
    private int maxSpeed;
    private int cost;

    public Motorcycle(int wheelCount, int maxSpeed) {
        super(wheelCount);
        this.maxSpeed = maxSpeed;

    }
    @Override
    public void printInfo(){
        System.out.println("Транспортное средство: Мотоцикл"+"\n"+ "- Количество колёс: "+this.wheelCount+ "\n"+ " -" +
                "Максимальная скорость: "+this.maxSpeed+ " км/ч");
    }
}
