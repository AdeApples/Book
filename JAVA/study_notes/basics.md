# Java Basics - Complete Guide

## 1️⃣ Variables and Data Types

### What is a Variable?
A variable is a container that holds a value. Think of it like a labeled box.

```java
// Creating variables
String name = "AdeApples";    // String (text)
int age = 25;                  // int (whole number)
double height = 5.9;           // double (decimal number)
boolean isStudent = true;       // boolean (true/false)
```

### Data Types

| Type | Example | Used For | Size |
|------|---------|----------|------|
| **String** | `"hello"` | Text, words, names | varies |
| **int** | `42` | Whole numbers | 32-bit |
| **double** | `3.14` | Decimal numbers | 64-bit |
| **float** | `3.14f` | Decimal numbers (smaller) | 32-bit |
| **boolean** | `true`/`false` | Yes/No, on/off | 1-bit |
| **char** | `'A'` | Single character | 16-bit |
| **long** | `123456789L` | Very large whole numbers | 64-bit |

### Naming Rules

✅ Good names:
```java
String userName = "John";
int ageInYears = 30;
double totalPrice = 99.99;
```

❌ Bad names:
```java
String x = "John";           // Too vague
int 123name = 30;             // Can't start with number
String user-name = "John";     // Can't use hyphens
```

---

## 2️⃣ Loops and Conditionals

### If/Else Statements
Make decisions in your code.

```java
int age = 16;

if (age >= 18) {
    System.out.println("You can vote");
} else if (age >= 16) {
    System.out.println("You can drive");
} else {
    System.out.println("You're too young");
}
```

### Comparison Operators

```java
int x = 10;
x == 10   // Equal to? true
x != 10   // Not equal to? false
x > 10    // Greater than? false
x < 10    // Less than? false
x >= 10   // Greater or equal? true
x <= 10   // Less or equal? true
```

### Logical Operators

```java
int age = 25;
boolean hasLicense = true;

// AND - both must be true
if (age >= 18 && hasLicense) {
    System.out.println("Can drive");  // This prints!
}

// OR - at least one must be true
if (age < 13 || age > 65) {
    System.out.println("Special price");
}

// NOT - flips true/false
if (!hasLicense) {
    System.out.println("Need license");  // Won't print
}
```

### While Loops
Repeat code while a condition is true.

```java
int count = 0;
while (count < 5) {
    System.out.println("Count: " + count);
    count++;  // Don't forget this!
}

// Output:
// Count: 0
// Count: 1
// Count: 2
// Count: 3
// Count: 4
```

### For Loops
Repeat code a specific number of times or through a collection.

```java
// Loop through numbers
for (int i = 0; i < 5; i++) {
    System.out.println("Number: " + i);
}

// Loop through an array
String[] fruits = {"apple", "banana", "orange"};
for (String fruit : fruits) {
    System.out.println("I like " + fruit);
}
```

### Break and Continue

```java
// Break - stop the loop
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break;  // Stops at 5
    }
    System.out.println(i);
}

// Continue - skip to next iteration
for (int i = 0; i < 5; i++) {
    if (i == 2) {
        continue;  // Skips 2
    }
    System.out.println(i);
}
```

---

## 3️⃣ Methods (Functions)

### What is a Method?
A method is reusable code that does one specific job. All Java code must be inside a class!

```java
public class Calculator {
    
    // Method that takes parameters and returns a value
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Method that doesn't return anything (void)
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
    
    public static void main(String[] args) {
        int result = add(5, 3);  // result = 8
        greet("Alice");          // Prints: Hello, Alice!
    }
}
```

### Method Parts

```java
// Access Modifier (public/private)
//        ↓
public static int calculateTotal(double price, double taxRate) {
    //      ↑         ↑ Return type (int, String, void, etc.)
    //   Method name ↑
    //              Parameters (inputs) ↑
    
    double total = price * (1 + taxRate);
    return (int) total;  // ← Return value (output)
}

// Using the method
int myTotal = calculateTotal(100, 0.08);  // Arguments (actual values)
System.out.println(myTotal);  // 108
```

### Method Examples

```java
// Simple method
public static int multiply(int a, int b) {
    return a * b;
}

// Method with if/else
public static String checkAge(int age) {
    if (age >= 18) {
        return "Adult";
    } else {
        return "Child";
    }
}

// Method that doesn't return (void)
public static void printName(String name) {
    System.out.println("Name: " + name);
    // No return needed
}

// Method with default behavior
public static String greet(String name) {
    return "Hello, " + name + "!";
}
```

### Static vs Non-Static

```java
public class Helper {
    // Static method - belongs to the class
    public static void staticMethod() {
        System.out.println("I'm static!");
    }
    
    // Non-static method - belongs to an object
    public void nonStaticMethod() {
        System.out.println("I'm non-static!");
    }
}

// Using static method
Helper.staticMethod();  // Works directly!

// Using non-static method
Helper helper = new Helper();
helper.nonStaticMethod();  // Need to create an object first
```

---

## 4️⃣ Object-Oriented Programming (OOP)

### What is OOP?
OOP is a way to organize code by creating "objects" that have properties and actions.

Think of a **Dog**:
- **Properties**: name, age, color, breed
- **Methods (actions)**: bark(), eat(), sleep()

### Classes
A class is a blueprint for creating objects.

```java
public class Dog {
    // Properties (variables)
    private String name;
    private int age;
    
    // Constructor - called when you create a new Dog
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Methods (actions)
    public String bark() {
        return name + " says: Woof!";
    }
    
    public void haveBirthday() {
        age = age + 1;
        System.out.println(name + " is now " + age + " years old");
    }
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
}

// Creating objects (instances of the class)
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 3);
        System.out.println(myDog.getName());  // Buddy
        System.out.println(myDog.bark());     // Buddy says: Woof!
        myDog.haveBirthday();                 // Buddy is now 4 years old
    }
}
```

### More OOP Examples

```java
public class Car {
    private String brand;
    private String model;
    private int year;
    private int speed;
    
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = 0;
    }
    
    public void accelerate() {
        speed += 10;
        System.out.println(brand + " " + model + " is now going " + speed + " mph");
    }
    
    public void brake() {
        speed = 0;
        System.out.println(brand + " " + model + " has stopped");
    }
    
    public String getInfo() {
        return year + " " + brand + " " + model;
    }
}

// Using the class
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022);
        System.out.println(myCar.getInfo());  // 2022 Toyota Camry
        myCar.accelerate();                   // Toyota Camry is now going 10 mph
        myCar.accelerate();                   // Toyota Camry is now going 20 mph
        myCar.brake();                        // Toyota Camry has stopped
    }
}
```

### Encapsulation (Private/Public)

```java
public class Person {
    // Private - only this class can access
    private String email;
    private int age;
    
    // Public - anyone can access
    public String name;
    
    // Use methods to control access
    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Invalid email!");
        }
    }
    
    public String getEmail() {
        return email;
    }
}
```

---

## 📝 Practice Exercises

### Exercise 1: Variables
Create a class with variables for:
- Your name (String)
- Your age (int)
- Your height (double)
- Are you a student? (boolean)

### Exercise 2: Conditionals
Write a method that:
- Takes age as a parameter
- Returns "Teenager" if 13-19
- Returns "Adult" if 18+
- Returns "Child" otherwise

### Exercise 3: Loops
Write a method that:
- Prints numbers 1 to 10
- Prints every other number (2, 4, 6, 8, 10)
- Prints numbers backwards (10 to 1)

### Exercise 4: Methods
Create methods that:
- Takes two numbers as input
- Returns the sum
- Returns the product
- Returns if the first is greater than the second

### Exercise 5: Classes
Create a Student class with:
- Properties: name, grade, GPA
- Methods to raise/lower GPA
- Method to get student info
- Create multiple students and test

---

## 🎯 Key Takeaways

✅ Variables store data
✅ Conditionals make decisions
✅ Loops repeat code
✅ Methods organize code
✅ Classes organize data and methods together
✅ Objects are instances of classes

Start simple and practice! You'll get better with each project. 🚀
