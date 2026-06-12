# Java Utilities

This folder contains reusable helper methods that you can copy and use in your own projects.

## Files

### Helpers.java
Basic utility methods for common tasks:
- `isEven(int number)` - Check if a number is even
- `isOdd(int number)` - Check if a number is odd
- `reverseString(String text)` - Reverse a string
- `factorial(int n)` - Calculate factorial
- `findMax(int[] numbers)` - Find max in array
- `findMin(int[] numbers)` - Find min in array

## 📖 How to Use

### Option 1: Copy and Paste
Just copy the method you need into your own Java file.

### Option 2: Import and Use
You can use the Helpers class in your code:

```java
public class MyProgram {
    public static void main(String[] args) {
        System.out.println(Helpers.isEven(4));  // true
        System.out.println(Helpers.reverseString("hello"));  // "olleh"
    }
}
```

## 💡 Tips

- Look at the comments in Helpers.java to understand each method
- Modify the methods for your needs
- Add your own utility methods here!

## 🎯 Common Utilities to Add

- String utilities (uppercase, lowercase, capitalize)
- Array utilities (search, sort, sum)
- Math utilities (average, power, square root)
- Validation utilities (check email, phone number, etc.)
