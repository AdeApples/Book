# Python Basics - Complete Guide

## 1️⃣ Variables and Data Types

### What is a Variable?
A variable is a container that holds a value. Think of it like a labeled box.

```python
# Creating variables
name = "AdeApples"      # String (text)
age = 25                # Integer (whole number)
height = 5.9            # Float (decimal number)
is_student = True       # Boolean (True or False)
```

### Data Types

| Type | Example | Used For |
|------|---------|----------|
| **String** | `"hello"` | Text, words, names |
| **Integer** | `42` | Whole numbers |
| **Float** | `3.14` | Decimal numbers |
| **Boolean** | `True` / `False` | Yes/No, on/off |
| **List** | `[1, 2, 3]` | Multiple items |
| **Dictionary** | `{"name": "Bob"}` | Key-value pairs |

### Naming Rules

✅ Good names:
```python
user_name = "John"
age_in_years = 30
total_price = 99.99
```

❌ Bad names:
```python
x = "John"           # Too vague
123name = 30         # Can't start with number
user-name = "John"   # Can't use hyphens
```

---

## 2️⃣ Loops and Conditionals

### If/Else Statements
Make decisions in your code.

```python
age = 16

if age >= 18:
    print("You can vote")
elif age >= 16:
    print("You can drive")
else:
    print("You're too young")
```

### Comparison Operators

```python
x = 10
x == 10   # Equal to? True
x != 10   # Not equal to? False
x > 10    # Greater than? False
x < 10    # Less than? False
x >= 10   # Greater or equal? True
x <= 10   # Less or equal? True
```

### Logical Operators

```python
age = 25
has_license = True

# AND - both must be True
if age >= 18 and has_license:
    print("Can drive")  # This prints!

# OR - at least one must be True
if age < 13 or age > 65:
    print("Special price")  # Prints only if condition is True

# NOT - flips True/False
if not has_license:
    print("Need license")  # Won't print since has_license is True
```

### While Loops
Repeat code while a condition is true.

```python
count = 0
while count < 5:
    print(f"Count: {count}")
    count = count + 1  # Don't forget this!

# Output:
# Count: 0
# Count: 1
# Count: 2
# Count: 3
# Count: 4
```

### For Loops
Repeat code a specific number of times or through a list.

```python
# Loop through numbers
for i in range(5):
    print(f"Number: {i}")

# Loop through a list
fruits = ["apple", "banana", "orange"]
for fruit in fruits:
    print(f"I like {fruit}")
```

### Break and Continue

```python
# Break - stop the loop
for i in range(10):
    if i == 5:
        break  # Stops at 5
    print(i)

# Continue - skip to next iteration
for i in range(5):
    if i == 2:
        continue  # Skips 2
    print(i)
```

---

## 3️⃣ Functions and Methods

### What is a Function?
A function is reusable code that does one specific job.

```python
def greet(name):
    """This is a docstring - it explains what the function does"""
    return f"Hello, {name}!"

# Using the function
result = greet("Alice")
print(result)  # Hello, Alice!
```

### Function Parts

```python
#     Function name ↓
def calculate_total(price, tax_rate):
    #             ↑ Parameters (inputs)
    
    total = price * (1 + tax_rate)
    return total  # ← What the function sends back
    #     ↑ Return value (output)

# Using the function
my_total = calculate_total(100, 0.08)
#                         ↑ Arguments (actual values)
print(my_total)  # 108.0
```

### Function Examples

```python
# Simple function
def add(a, b):
    return a + b

result = add(5, 3)  # result = 8


# Function with multiple returns
def check_age(age):
    if age >= 18:
        return "Adult"
    else:
        return "Child"


# Function with no return (just does something)
def say_hello(name):
    print(f"Hello, {name}!")
    # No return statement needed


# Function with default values
def greet(name, greeting="Hello"):
    return f"{greeting}, {name}!"

print(greet("Bob"))  # Hello, Bob!
print(greet("Bob", "Hi"))  # Hi, Bob!
```

### Method vs Function
A **method** is a function that belongs to an object.

```python
text = "hello"

# These are methods (they belong to the string)
print(text.upper())  # HELLO
print(text.capitalize())  # Hello
print(text.replace("l", "L"))  # heLLo
```

---

## 4️⃣ Object-Oriented Programming (OOP)

### What is OOP?
OOP is a way to organize code by creating "objects" that have properties and actions.

Think of a **Dog**:
- **Properties**: name, age, color, breed
- **Actions**: bark(), eat(), sleep()

### Classes
A class is a blueprint for creating objects.

```python
class Dog:
    # __init__ is called when you create a new Dog
    def __init__(self, name, age):
        self.name = name  # Property
        self.age = age    # Property
    
    # Methods (actions)
    def bark(self):
        return f"{self.name} says: Woof!"
    
    def have_birthday(self):
        self.age = self.age + 1
        return f"{self.name} is now {self.age} years old"


# Creating objects (instances of the class)
my_dog = Dog("Buddy", 3)
print(my_dog.name)  # Buddy
print(my_dog.bark())  # Buddy says: Woof!
print(my_dog.have_birthday())  # Buddy is now 4 years old
```

### More OOP Examples

```python
class Car:
    def __init__(self, brand, model, year):
        self.brand = brand
        self.model = model
        self.year = year
        self.speed = 0
    
    def accelerate(self):
        self.speed += 10
        return f"{self.brand} {self.model} is now going {self.speed} mph"
    
    def brake(self):
        self.speed = 0
        return f"{self.brand} {self.model} has stopped"
    
    def info(self):
        return f"{self.year} {self.brand} {self.model}"


# Using the class
my_car = Car("Toyota", "Camry", 2022)
print(my_car.info())  # 2022 Toyota Camry
print(my_car.accelerate())  # Toyota Camry is now going 10 mph
print(my_car.accelerate())  # Toyota Camry is now going 20 mph
print(my_car.brake())  # Toyota Camry has stopped
```

---

## 📝 Practice Exercises

### Exercise 1: Variables
Create variables for:
- Your name (string)
- Your age (integer)
- Your height (float)
- Are you a student? (boolean)

### Exercise 2: Conditionals
Write code that:
- Asks the user their age
- Prints "You're a teenager" if 13-19
- Prints "You're an adult" if 18+
- Prints "You're a kid" otherwise

### Exercise 3: Loops
Write code that:
- Prints numbers 1 to 10
- Prints every other number (2, 4, 6, 8, 10)
- Prints numbers backwards (10 to 1)

### Exercise 4: Functions
Create a function that:
- Takes two numbers as input
- Returns the sum, difference, and product
- Use it with different numbers

### Exercise 5: Classes
Create a class for:
- A Student with name, grade, and GPA
- Add methods to raise/lower GPA
- Create multiple students and test the methods

---

## 🎯 Key Takeaways

✅ Variables store data
✅ Conditionals make decisions
✅ Loops repeat code
✅ Functions organize code
✅ Classes organize data and functions together

Start simple and practice! You'll get better with each project. 🚀
