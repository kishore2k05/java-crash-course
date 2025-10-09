# 📦 Module 02: Variables, Data Types, and Operators

This module is fundamental to all programming, teaching you how to store, manage, and manipulate data within a Java program. We move past basic syntax and start interacting with the information that our programs will process.

## 🎯 Learning Objectives

By the end of this module, you should be able to:

1.  **Declare and Initialize** variables in Java.
2.  Understand the difference between **Primitive** and **Reference** data types.
3.  Choose the appropriate **Data Type** (`int`, `double`, `boolean`, `char`, `String`, etc.) for different kinds of information.
4.  Perform calculations and comparisons using various **Operators**.
5.  Understand and perform **Type Casting** (implicit and explicit conversions).

---

## 🔑 Key Concepts Covered

### 1. Variables

* **Declaration vs. Initialization:** The difference between creating a variable and giving it an initial value.
* **Naming Conventions:** Java rules for variable names (camelCase, allowed characters, reserved keywords).
* **Variable Scope:** Where a variable can be accessed in the code (will be explored more deeply in later modules).

### 2. Data Types

* **Primitives:** The 8 fundamental types (`byte`, `short`, `int`, `long`, `float`, `double`, `boolean`, `char`) and their respective size and range.
* **Reference Types:** Focus on the built-in `String` class as the primary non-primitive type for handling text.

### 3. Operators

| Category | Operators | Example Usage |
| :--- | :--- | :--- |
| **Arithmetic** | `+`, `-`, `*`, `/`, `%` | `result = a + 5;` |
| **Assignment** | `=`, `+=`, `-=`, `*=`, `/=` | `count += 1;` |
| **Unary** | `++` (increment), `--` (decrement) | `i++;` |
| **Relational** | `>`, `<`, `==`, `!=`, `>=`, `<=` | `isGreater = x > y;` |
| **Logical** | `&&` (AND), `||` (OR), `!` (NOT) | `if (a > 0 && b < 10)` |
| **Operator Precedence** | The order in which operators are evaluated (e.g., multiplication before addition). |

---

## 🚀 Suggested Exercises

1.  Create a program that declares one variable of each primitive data type and prints its value.
2.  Write a simple calculator program that uses **Arithmetic Operators** to add, subtract, multiply, and divide two integer variables.
3.  Experiment with **Type Casting**: Assign an `int` to a `double` (implicit cast) and then cast the `double` back to an `int` (explicit cast) to observe the loss of precision.
