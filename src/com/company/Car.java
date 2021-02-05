package com.company;

public class Car extends Vehicle implements Costable {
    private int doorsCount;
    private int cost;

    public Car(int wheelCount, int doorsCount,int cost) {
        super(wheelCount);
        this.doorsCount = doorsCount;
        this.cost=cost;
    }

    @Override
    public int getCost() {
       return this.cost;
    }

    @Override
    public void printInfo(){
        System.out.println("Транспортное средство: Машина" + "\n"+ "- Количество дверей: "+this.doorsCount+ "\n"+ "- " +
                "Количество колёс: "+this.wheelCount + "\n"+ "- Стоимость машины (USD): "+ getCost());
    }
}
