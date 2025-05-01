package oop.pack1;

public abstract class MotorVehicle implements Vehicle {
    private String brand;
    private String model;

    public MotorVehicle(String brand, String model){
        this.brand = brand;
        this.model = model;

    }


    protected String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void honk(){

        System.out.println("Honking !!");
    }

    public abstract void refuel();
}
