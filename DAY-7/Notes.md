# ☕ Day 7 - Methods (Part 1)

## 📚 Topics Covered

* What is a Method?
* Why do we use Methods?
* Advantages of Methods
* Method Syntax
* `public`
* `static`
* `void`
* Method Name
* Method Body
* Method Calling
* Execution Flow
* Method Calling Another Method
* Parameters
* Parameter vs Argument

---

# What is a Method?

## Definition

A method is a block of code that performs a specific task. It is written once and can be called multiple times whenever needed.

## Easy Definition

A method is a reusable block of code that helps us avoid writing the same code again and again.

---

# Why Do We Use Methods?

* To avoid code repetition.
* To make programs easy to read.
* To save time.
* To improve code reusability.
* To make programs easier to maintain.

---

# Advantages of Methods

* Code Reusability
* Easy Maintenance
* Better Readability
* Saves Time
* Organized Programs

---

# Method Syntax

```java
public static void methodName() {

    // Code

}
```

---

# Keywords Explained

## 1. public

An access modifier that allows the method to be accessed from anywhere in the program.

---

## 2. static

The method belongs to the class and can be called without creating an object.

---

## 3. void

The method does not return any value.

---

## 4. Method Name

The name used to identify and call a method.

Example:

```java
hello();
```

---

## 5. Method Body

The code written inside `{ }` is called the method body.

---

# Method Calling

A method is executed by calling it using its name.

Example:

```java
hello();
```

---

# Execution Flow

Java always starts execution from the `main()` method.

Flow:

```
main()
   ↓
Method Call
   ↓
Method Executes
   ↓
Returns to main()
   ↓
Next Statement Executes
```

---

# One Method Calling Another Method

A method can call another method.

Example:

```java
first();
second();
third();
```

Java executes methods in the order they are called.

---

# Parameters

## Definition

A parameter is a variable that receives a value when a method is called.

Example:

```java
public static void hello(String name)
```

Here, `name` is a parameter.

---

# Arguments

The value passed while calling a method is called an argument.

Example:

```java
hello("Bhumi");
```

Here, `"Bhumi"` is an argument.

---

# Parameter vs Argument

| Parameter              | Argument                  |
| ---------------------- | ------------------------- |
| Declared in method     | Passed during method call |
| Receives value         | Sends value               |
| Example: `String name` | Example: `"Bhumi"`        |

---

# Programs Practiced

### Program 1

Method without parameters

```java
hello();
```

---

### Program 2

Method with String parameter

```java
hello("Bhumi");
hello("Rahul");
hello("Aman");
```

---

### Program 3

Method with Integer parameters

```java
add(10,20);
add(30,40);
add(10,5);
```

Output:

```
SUM = 30
SUM = 70
SUM = 15
```

---

# Important Points

* Java starts execution from `main()`.
* A method must be called to execute.
* A method can be called multiple times.
* One method can call another method.
* Parameters receive values.
* Arguments pass values.
* `void` methods do not return any value.

---

# Interview Questions

1. What is a method?
2. Why do we use methods?
3. What is method calling?
4. What is the difference between a parameter and an argument?
5. What is the purpose of the `void` keyword?
6. From which method does Java execution always begin?
7. Can one method call another method?

---

# Today's Progress ✅

* Methods Basics
* Method Calling
* Execution Flow
* Parameters
* Parameter vs Argument
* Practical Coding
* Dry Run Practice

**Next Topic:** Return Type and `return` Keyword.
