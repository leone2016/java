# @FuctionalInterface

- An interface which has **exactly one** abstract method
- Functional Interface can be annotated with @FuctionalInterface
- Java provides many pre-defined functional interfaces
  - e.g. Supplier, Consumer, Predicate, Function
    - Predicate: important for **OCA(1ZO-808)**

```java
@FunctionalInterface // optional
interface Animal{
    public void speak(); //abstract
}
```

```java
class Dog implements Animal{
    public void speak(){
        System.out.println("Woof !!");//implementation
    }
}
```

```java
public class MyClass{
    public static void main(String args[]){
        Dog dog = new Dog();
        dog.speak();
    }
}
```

> Question: 
> Can you make a implementation of this method **speak** but without creating a new class **Dog**? 
>
> SOLUTION: **LAMBDAS**

```java
@FunctionalInterface // optional
interface Animal{
    public void speak(); //abstract
}
```

```java
public class MyClass{
    public static void main(String args[]){
        Animal dog = new Animal(){
            public void speak(){ System.out.println("Woof !"); }
        }
        dog.speak();
    }
}
```

## Lambda expression

```java
@FunctionalInterface // optional
interface Animal{
    public void speak(); //abstract
}
```

```java
public class MyClass{
    public static void main(String args[]){
        /**
        Animal dog = new Animal(){
            public void speak(){ System.out.println("Woof !"); }
        }
        */
        Animal dog = ()-> System.out.println("Woof !");
        
        dog.speak();
    }
}
```

## Different implementation in a single class

```java
@FunctionalInterface // optional
interface Animal{
    public void speak(); //abstract
}
```

```java
public class MyClass{
    public static void main(String args[]){
      
         Animal dog = ()-> System.out.println("Woof !");
         Animal cat = ()-> System.out.println("Meow !");
         Animal cow = ()-> System.out.println("MuuuUUUu !");
        
        dog.speak()
        cat.speak();
        cow.speak();
    }
}
```

## Abstract methods with params

```java
@FunctionalInterface // optional
interface Multiplicable{
    public void multiplay(int a, int b); //abstract
}
```

```java
public class MyClass{
    public static void main(String args[]){
        Multiplicable impl = (a,b)-> a*b; // implementation
        int result = impl.multiply(3,9);
        System.out.println(result);// 27
    }
}
```

## Variation lambda syntax

- One parameter
  - `n -> 2*n`
  - `(n) -> 2*m`
  - `(int n) -> 2*n`
  - `n ->{ return 2*n; }`
  - `(int n) ->{ return 2*n; }`
- More Parameters
  - `(a, b) -> a*b`
  - `(int a, int b) -> a*b;`
  - `(a, b) -> {return a*b; }`
  - `(int a, int b) -> { retun a*b; }`