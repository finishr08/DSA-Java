## Java

Java is a versatile, high-level programming language that is widely used for building applications across various platforms. Developed by Sun Microsystems (now owned by Oracle), Java was designed with a core philosophy: "Write Once, Run Anywhere" (WORA). This means that Java code can run on any device that has a Java Virtual Machine (JVM), making it platform-independent.

Java is known for its simplicity, object-oriented nature, and a robust set of libraries that allow developers to build scalable, high-performance applications ranging from web apps to mobile apps, desktop applications, and even enterprise-level solutions.

### Key Features of Java:

- **Object-Oriented**: Java follows the object-oriented paradigm, meaning everything in Java revolves around objects and classes.
- **Platform Independence**: Java applications are compiled into bytecode, which can run on any system that supports JVM, regardless of the underlying architecture.
- **Simple and Easy to Learn**: Java’s syntax is clean, easy to understand, and similar to C++ but with fewer complexities like pointers and manual memory management.
- **Secure**: Java offers a secure environment through features like bytecode verification, secure class loading, and built-in security policies.
- **Multi-threaded**: Java has built-in support for multi-threading, allowing developers to build highly concurrent applications.
- **Rich Standard Library**: The Java Standard Library (API) provides a vast set of classes and functions for various tasks, reducing the need for third-party libraries.

Java is extensively used in various fields such as Android app development, web development, enterprise applications, and big data technologies. This makes it a go-to language for software developers around the world.

## Java Syntax

The basic structure of a Java program consists of the following components:

- **Class Declaration**: Every Java program must have at least one class.
- **Main Method**: This is the entry point for any Java application.
- **Statements**: Instructions to the JVM (Java Virtual Machine).

```java
public class Main {
    public static void main(String[] args) {
        // Program starts here
        System.out.println("Hello, Java!");
    }
}
```

### Key Elements

- **`public class Main`**: Defines a class named `Main`.
- **`public static void main(String[] args)`**: The main method where the execution of the program begins.
- **`System.out.println`**: A method used to print output to the console.

## Java Variables

Variables are used to store data for processing. Java supports various data types, and variables are declared with a specific type.

### Syntax:

```java
type variableName = value;
```

### Example:

```java
int age = 25;
String name = "John Doe";
```

### Types of Variables:

1. **Local Variables**: Declared inside methods.
2. **Instance Variables**: Declared in a class but outside methods.
3. **Static Variables**: Declared with the `static` keyword, shared among all instances of a class.

## Java Data Types

Java has two categories of data types: primitive and non-primitive.

### Primitive Data Types:

Primitive types are the most basic data types in Java:

- **byte**: 1 byte
- **short**: 2 bytes
- **int**: 4 bytes
- **long**: 8 bytes
- **float**: 4 bytes (single precision)
- **double**: 8 bytes (double precision)
- **char**: 2 bytes (character)
- **boolean**: 1 bit (`true` or `false`)

### Example:

```java
int age = 30;
float temperature = 36.6f;
boolean isJavaFun = true;
```

### Non-Primitive Data Types:

These include classes, arrays, and interfaces. These types are created by the programmer.

- **String**: Represents a sequence of characters.
- **Array**: Stores multiple values of the same type.

### Type Casting:

Type casting is when you assign a value of one primitive data type to another.

- **Implicit Casting** (widening): Automatically converting a smaller type to a larger type.
- **Explicit Casting** (narrowing): Manually converting a larger type to a smaller type.

#### Example of Implicit Casting:

```java
int num = 100;
double dNum = num; // Implicit casting: int to double
```

#### Example of Explicit Casting:

```java
double salary = 75000.50;
int roundedSalary = (int) salary; // Explicit casting: double to int
```

### Type Conversion:

Type conversion refers to converting a value from one data type to another.

- **String to Int**:

```java
String number = "123";
int num = Integer.parseInt(number);
```

- **Int to String**:

```java
int num = 123;
String str = Integer.toString(num);
```

### Type Expressions:

In Java, a type expression is an expression where operands are evaluated according to their type.

#### Example:

```java
int result = 10 + 5 * 2; // Multiplication before addition due to operator precedence
```

---

