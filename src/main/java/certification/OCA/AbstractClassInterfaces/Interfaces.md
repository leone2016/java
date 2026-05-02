# Interfaces

> ALL INTERFACES are implicitly **abstract**, so they cannot be marked as **final**

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

// THERE ARE SOME IMPLICIT KEYWORDS
public abstract interface Car{
    public abstract int distanceWithFullTank(int tankVolume); // abstract method (no body!)
    public static final int MAXIMUM_WEIGHT = 2000; //constant field
}
```

### 👉 Complete Example

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

> ## Rules of implementation
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
// Since this 2 interfaces have the same method, 
// they have a covarient return type (same return type)
// ✅ you ONLY need to implement once
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

- Imagine you have an interface which is implemented by 100 classes
- For some reason you need to add another method in your interface
- If this method were abstract, you would need to implement it in all 100 classes
- This is solved by making a method ***default*** (non-abstract)
- Default method must have a `body` (default implementation)

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
3. Implicitly public
4. Cannot be abstract, final or static
5. May or may not be overriden by a class implementing the interface 
6. if the class inherits two or more default methods with the same method signature, then it must overriden the method

```java
public interface Car{
    public default int getMaxSpeed(){  return 100; }
}
public intereface Truck{
    default int getMaxSpeed{ return 70;}
}

public class Van implements Car, Truck{
    /**
    * we must override getMaxSpeed()
    * because there are two of them with a same signature
    */
    @Override
    public int getMaxSpeed(){ return 80;}
    
    public int getMaxSpeedCar(){
        retur Car.super.getMaxSpeed();// access the default implementation of any particular interface
    }
}
```

## Static interface methods

> Static methods **CAN NOT BE** overriden

```java
public interface Car{
    static int getMaxSpeed(){ return 100; } //must need to provide imple
}

public class Ford implement Car{
    // I want to access getMaxSpeed() from Car
    public int getMaxSpeedCar(){
        return Car.getMaxSpeed(); 
    }
}
```

## Private interface methods

- This private methods can be only used only within the interface, and their purpose is usually just to make code more readable, more easier to maintain, more easier to update, and so forth
- This private methods cannot be overriden and they cannot be called outside of the interface

```java
  public interface Car{
      private static int calculateSpeed(){
          int speed = 70 * 2;
          return speed;
      }
      public default int getMaxSpeed(){
          return CalculateSpeed();
      }
      public default int getRecomendedSpeed(){
          return (int) (calculateSpeed() * 0.8);
      }
  }
```

### Rules for using private Interface Methods

1.  Marked with keyword private
2. must have a body
3. private static methods may be called by any method in the interface
4. non-static private methods may be called only by non-static methods

> Default and private non-static methods can call abstract methods

```java

public interface Car{
    int getMaxSpeed();
    int getHorsePower();
    
    //these methods are abstract and they have to be implemented => when you call printCarFeature() from a class which implements the interface, the implementation fiven in that class will be used in printCarFeatures()
    default void printCarFeature(){
        System.out.println("Max speed:"+ getMaxSpeed()+ " | Horse power: "+ getHorsePower()); 
    }
}
```



