package oop;

import oop.pack1.MotorVehicle;

public class MotorCycle  extends MotorVehicle {

    private boolean hasSideCar;

    public MotorCycle(String brand, String model, boolean hasSideCar){
        super(brand, model);
        this.hasSideCar = hasSideCar;
    }

    public boolean hasSideCar(){
        return hasSideCar;
    }

    public void setSideCar(boolean hasSideCar){
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void start(){

        System.out.println(getBrand() + " " + getModel()+ " MotorCycle is starting" );
    }

    @Override
    public void stop(){

        System.out.println(getBrand() + " " + getModel()+ " MotorCycle is stopping" );
    }

    @Override
    public void refuel(){

        System.out.println(" MotorCycle is refueling ... !!" );
    }
}