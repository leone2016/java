# Predicate

- Predicate is a pre-defined functional interface provided by java
- in order to use it `java.util.fuction` package must be imported
- Predicate has one abstract method, `test(T)`
  - Which takes an argument of type `T` and returns boolean

```java
@FuctionalInterface
public interface Predicate<T>{
    boolean test(T t);
    // ...
}
```

> In order to use Predicate you have to implement `test(T)` method and then you can use it.

```java
import java.util.function.*;

public class MyClass{
    public static void main(String[] args){
        Predicate<Integer> gt10 = n -> n > 10;
        System.out.println(gt10.test(7)); //false
        System.out.println(gt10.test(12)); // true
    }
}
```

another example
```java
import java.util. function .*;
public class Myclass {
	static void myProbe (int n, Predicate<Integer> predicate){
		if (predicate.test(n))
			System.out.println("The test has passed.");
		else
			System.out.println("The test has failed.");
    }
    
    public static void main(String args[]) {
        myProbe(5, n -> n > 2);
        myProbe(5, n -> n % 2 == 0);

        Predicate<Integer> myCriterium = n -> n*n + 5 > 100;
        myProbe(7, myCriterium);
        myProbe(11, myCriterium);
    }
}
```

```bash
The test has passed.
The test has failed.
The test has failed.
The test has passed.
```

