# Abstract Classes

> Classes which can be extended, but cannot be initialized
>
> - Class Mammal is **abstract class**, and class Dog is concrete class

```java
public abstract class Mammal{}

public class Dog extends Mammal{}

Dog dog = new Dog(); //✅OK

Mammal mammal = new Mammal(); //❌NOK!!
```

## Abstract Methods

- marked with abstract keyword
- don't have a body
- the implementation (body) is done in classes which extend an abstract class

```java
public abstrac class Mammal{
    public abstract void speak();
}

public class Dog extends Mammal{
    public void speak(){ System.out.println("Woof");}
}

public class Cat extends Mammal{
    public void speak(){ System.out.println("Meow");}
}
```

### Rules for using abstract methods

- Only instance methods can be marked abstract
  - not variables, constructor, static methods, etc.
- Abstract method can only be declared in an abstract class
- Non-abstract class which extends abstract class must implement all inherited methods.
- All other rules with overriding methods apply

```java
abstract class Animal{
    public abstract void speak();
}
abstract class Mammal extends Animal{
    public abstract void walks();
}

/**
* Dog extends Mammal which extends Animal => Dog is a first concreate class,
which inhertits aabstract methods from both Mammal and Animal
**/
public class Dog extends Mammal{
    @Override
    public void speak(){
        System.out.println("Woof!");
    }
    
    @Override
    public void walks(){
        System.out.println("Dogs Walks");
    }
    
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.speak();
        dog.walks();
    }
}
```

>  🧠 Keep in Mind
>
> - abstract classes can have constructors
>   - but they can be called only using super() from the child class
> - abstract class or method cannot be marked final `final means that the class/methods cannot be extended`
> - abstract class or method cannot be marked private
> - static methods **cannot** be overriden
>   - therefore, abstract static is not allowed

