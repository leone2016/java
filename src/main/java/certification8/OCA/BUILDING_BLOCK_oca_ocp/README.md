## Classes
–	Classes are basic building block of every java program
–	To design a class means to describe parts and characteristics of these blocks
–	In order to use a class you need to create a object (most of the times)
o	You can think about a clkass as a blueprint, and an object as realization
–	An obj is a single representation of the class, also called instances of class
–	A reference is a varuable that points to a obj
## Fields and Methods
–	Two main elements (members) of Java classes are fields and methods
–	Fields are sometimes referred to variables
o	To be precise: all fields are variables, but not all varaiable are fields
–	Fields hold the info about the state of an object or class
–	Methods describe some action or operation on that state
o	Methods are similar to function in some older programming languages
```java

class Student { }
// in file Student.java
public class Students {
   String name;
   public String getName(){
        return name;
   }
}
```
![test](../assets/img_2.png)
## Keep in mind
- In Java, boolean true and false are completely different from 1 and 0
- all numeric types are signed 
- float requires an f or F suffix
```java
float x = 1.0; //Does not compile
float x = 1.0f; //compile
```
- double requires a d or D suffix
- long requires an l or L suffix

```java
long a = 1987456293645; // does not compile
long a = 1987456293645L; //compile
```
### Support digital format
- base 10 (digits 0-9) "normal" number
- octal (digits 0-7), uses 0 as a prefix (eg 017)
- hexadecimal (digits 0-9 and A-F), uses 0x or 0X as a prefix (eg 0x1A)
- binary (digits 0-1), uses 0b or 0B as a prefix (eg 0b101010)

>  for readability, you can use underscores in numeric literals (ALLOWED)
>  but not in the beginning or end of the number
```java
int a = 1_000_000; // compile
int b = 1_2; // compile, but not recommended
int b1 = 1_____________________2; // compile, but not recommended
int c = 1_000_000_; // does not compile
int d = _1_000_000; // does not compile

double e = 1_000_000.0; // compile
double f = 1_000_000.0_0; // compile
double g = 1_000_000.0_0_0; // compile
double h = 1_000_000.0_0_0_; // does not compile
double i = 1_000_000_.0; // does not compile
double j = 1_000_000_._0; // does not compile
```

### Support character format
- char is a single 16-bit Unicode character
- char is enclosed in single quotes (eg 'a')
- char can be represented by a number (eg 97) or an escape sequence (eg '\u0061')
- char can be represented by a character literal (eg 'a')

### Wrapper classes
- primitive are not objects, and sometimes we prefer to work with objects
- each primitive has a wrapper class
  - an object type which corresponds to the primitive
- most common way to create an object from the primitive is to use the constructor of the wrapper class
  - use static method valueOf()
```java
// className Integer
Integer a = Integer.valueOf(5); // compile
```

![test](../assets/img_3.png)