# ☕ Day 8 - Parameters & Return Type

## 📚 Topics Covered

- Parameters
- Arguments
- Parameter vs Argument
- Return Type
- return Keyword
- Return with Parameters
- Multiple Return Statements
- Unreachable Code

---

# Parameters

## Definition

A parameter is a variable that receives a value when a method is called.

### Syntax

```java
public static void hello(String name)
```

Here, `name` is a parameter.

---

# Arguments

## Definition

An argument is the actual value passed to a method during the method call.

### Example

```java
hello("Bhumi");
```

Here, `"Bhumi"` is an argument.

---

# Parameter vs Argument

| Parameter | Argument |
|-----------|----------|
| Declared in method | Passed while calling a method |
| Receives value | Sends value |
| Example: `String name` | Example: `"Bhumi"` |

---

# Return Type

## Definition

A return type specifies the type of value that a method sends back after completing its task.

### Example

```java
public static int add() {

    return 10 + 20;

}
```

Here, `int` is the return type.

---

# return Keyword

## Definition

The `return` keyword is used to send a value back from a method.

### Example

```java
return 30;
```

---

# Difference Between void and return

| void | return |
|------|--------|
| Returns nothing | Returns a value |
| Used when no result is needed | Used when the result is needed |

---

# Return with Parameters

A method can receive values through parameters, perform a task, and return the result.

### Example

```java
public static int add(int a, int b){

    return a + b;

}
```

Method Call

```java
int result = add(10,20);
```

Output

```
30
```

---

# Multiple Return Statements

A method can contain multiple `return` statements, but only one return statement is executed depending on the condition.

### Example

```java
public static String checkAge(int age){

    if(age >= 18){
        return "Eligible";
    }

    return "Not Eligible";

}
```

---

# Unreachable Code

Code written after a `return` statement inside the same execution path is called unreachable code and causes a compile-time error.

### Wrong Example

```java
public static int test(){

    return 10;

    System.out.println("Hello");

}
```

---

# Programs Practiced

## 1. Parameter Practice

```java
hello("Bhumi");
hello("Rahul");
hello("Aman");
```

---

## 2. Addition using Return

```java
public static int add(int a, int b){

    return a + b;

}
```

---

## 3. Multiplication using Return

```java
public static int multiply(int a, int b){

    return a * b;

}
```

---

## 4. Subtraction using Return

```java
public static int sub(int a, int b){

    return a - b;

}
```

---

# Important Points

- Parameters receive values.
- Arguments pass values.
- `void` methods do not return any value.
- `return` sends a value back to the caller.
- The return type and returned value must match.
- Multiple return statements are allowed.
- Only one return statement executes in a single method call.
- Code after `return` in the same execution path is unreachable.

---

# Interview Questions

1. What is a parameter?
2. What is an argument?
3. What is the difference between a parameter and an argument?
4. What is a return type?
5. What is the purpose of the `return` keyword?
6. What is the difference between `void` and `return`?
7. What is unreachable code?
8. Can a method have multiple return statements?

---

# Today's Progress ✅

- Parameters
- Arguments
- Parameter vs Argument
- Return Type
- return Keyword
- Return with Parameters
- Multiple Return Statements
- Unreachable Code

---

## 🚀 Next Topic

**Day 9 - Arrays**