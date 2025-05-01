package oop;


import oop.pack1.Vehicle;
import oop.pack2.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println(" == Interview Leonardo Medina == ");

        Vehicle car = new Car("Toyota", "Corrella", 5);
        Vehicle motorcycle = new MotorCycle("Harley", "Sport", true);

        car.start();
        car.stop();
        System.out.println(" ");
        motorcycle.start();
        motorcycle.stop();
        System.out.println(" ");

        Car specificCar = new Car("Honda", "Civic", 5);
        System.out.println("Car brand Before "+ specificCar.getBrand2());
        specificCar.setBrand("Nissan");
        System.out.println("Car brand "+ specificCar.getBrand2());

        specificCar.honk();

        specificCar.refuel();

    }
}
