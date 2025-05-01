package oop.pack2;

import oop.pack1.MotorVehicle;

public class Car extends MotorVehicle {

    private int seatingCapacity;

    public Car(String brand, String model, int seatingCapacity){
        super(brand, model);
        this.seatingCapacity = seatingCapacity;
    }

    public int getSeatingCapacity(){
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity){
        this.seatingCapacity = seatingCapacity;
    }

   public String getBrand2(){
        return getBrand();
   }

    @Override
    public void start(){

        System.out.println(getBrand() + " " + getModel()+ " Car is starting" );
    }

    @Override
    public void stop(){

        System.out.println(getBrand() + " " + getModel()+ " Car is stopping" );
    }

    @Override
    public void refuel(){

        System.out.println(" Car is refueling ... !!" );
    }
}