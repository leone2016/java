# Interfaces

> ALL INTERFACES are implicitly **abstract**, so they cannot be marked as final

- a class can only extend one class
- but what if we want to *extend* more **abstract** class?
- Then we use interfaces
  - Similar to abstract class
  - but now one class can implement any number of interfaces
  - keyword implements, separated by comma (,)
- Like in abstract classes, you cannot create an instance of the interface using keyword **new**

## Implementation

```java
public interface Car{
    int distanceWithFullTank(int tankVolume); // abstract method (no body!)
    int MAXIMUM_WEIGHT = 2000; //constant field
}

// there are some implicit keywords here
public abstract interface Car{
    public abstract int distanceWithFullTank(int tankVolume); // abstract method (no body!)
    public static final int MAXIMUM_WEIGHT = 2000; //constant field
}
```

👉 Complete Example

```java
public interface Car{
    int distanceWithFullTank(int tankVolume); // abstract method (no body!)
    int MAXIMUM_WEIGHT = 2000; //constant field
}
public interface Ford{
    String getColot();
}

public class fordModelT implements Car, Ford{
    public int distanceWithFullTank(int tankVolume){
        return tankVolumen *9;
    }
    public String getColot(){
        return "black";
    }
}
```

> Rules of implementation
>
> ### Overriding Rules
>
> - Keyword public is required 
>   - when you talking about overriding methods, we said that the overriden method must be at least as accessible as the original method.
>   - When we are talking about interfaces, we said that all abstract methods in interfaces are implicitly public, it means implementation must also be made public
> - Return type must be covariant with the interface method
> - Signature (name & parameters) must match the interface method
>
> All inherited methods must be implemented

### An interface can extend another interface

```java
public interface Mammal{
    public int eats();
}
public interface canSwim extends Mammal{
    public int swim();
}
public class Elephant implements canSwim{
   public int swim(){return 5;}
   public int eats(){ return -1;}
}
```

### Duplicate methods, Example 1

```java
public interface Tetrapod{
    public void eats();
}
public interface Mammal{
    public void eats();
}
public class Dog implements Tetrapod, Mammal{
    public void eats(){
        System.out.print("Dog is eating");
    }
}
```

### Duplicate methods, Example 2

```java
public interface Tetrapod{
    public void eats();
}
public interface Mammal{
    public int eats();
}
public class Dog implements Tetrapod, Mammal{
    //❌ compilation error, now there is two diff methods 
    // this does not compile (non-covariant return types)
    // int eats() is not implemented
    public void eats(){
        System.out.print("Dog is eating");
    }
}
```

## Default Interface Methods

- imagine you have an interface which is implemented by 100 classes
- for some reason you need to add another method in your interface
- if this method were abstract, you would need to implement it in all 100 classes
- this is solved by making a method default (non-abstract)
- default method must have a body (default implementation)

```java
public interface Mammal{
    public void walks();
    public void eats();
    default void sleeps(){
        System.out.println("A mammal sleeps");
    }
}
public class Dog implements Mammal{
    public void walks(){
        System.out.println("Dog walks");
    }
    public void eats(){
        System.out.println("Dog eats");
    }
}

public class Cat implements Mammal{
    public void walks(){
        System.out.println("Cat walks");
    }
    public void eats(){
        System.out.println("Cat eats");
    }
}
```

### Rules for using default methods

1. keyword default with a method can only be used in the interface
   1.  You cannot define **default** methods in any other class, be it concrete class or abstract class
   2. So the default keyword can only be used in interfaces
2. Has to have a body (Default implementation)

