package certification8.OCA;

public class Dog {
    private String name = "Chip";

    public Dog(){
        name = "Teddy";
        System.out.println("Dog constructor");
    }

    {
        System.out.println("Inside the instance initializer block");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.name);
        int b = 1_2;
    }
}
