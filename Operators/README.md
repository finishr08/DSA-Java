## Java Operators

Operators in Java are special symbols that perform specific operations on variables and values. Java provides a wide range of operators that can be classified into different categories based on the type of operation they perform.

### 1. Arithmetic Operators

These operators are used to perform basic arithmetic operations like addition, subtraction, multiplication, etc.

| Operator | Description         | Example |
| -------- | ------------------- | ------- |
| `+`      | Addition            | `a + b` |
| `-`      | Subtraction         | `a - b` |
| `*`      | Multiplication      | `a * b` |
| `/`      | Division            | `a / b` |
| `%`      | Modulus (remainder) | `a % b` |

#### Example:

```java
int a = 10;
int b = 5;
System.out.println(a + b); // 15
System.out.println(a % b); // 0
```

### 2. Assignment Operators

Assignment operators are used to assign values to variables.

| Operator | Description         | Example  |
| -------- | ------------------- | -------- |
| `=`      | Simple assignment   | `a = 10` |
| `+=`     | Add and assign      | `a += 5` |
| `-=`     | Subtract and assign | `a -= 5` |
| `*=`     | Multiply and assign | `a *= 5` |
| `/=`     | Divide and assign   | `a /= 5` |
| `%=`     | Modulus and assign  | `a %= 5` |

#### Example:

```java
int a = 10;
a += 5; // a = a + 5, a becomes 15
```

### 3. Relational (Comparison) Operators

Relational operators are used to compare two values.

| Operator | Description              | Example  |
| -------- | ------------------------ | -------- |
| `==`     | Equal to                 | `a == b` |
| `!=`     | Not equal to             | `a != b` |
| `>`      | Greater than             | `a > b`  |
| `<`      | Less than                | `a < b`  |
| `>=`     | Greater than or equal to | `a >= b` |
| `<=`     | Less than or equal to    | `a <= b` |

#### Example:

```java
int a = 10;
int b = 5;
System.out.println(a == b); // false
System.out.println(a > b);  // true
```

### 4. Logical Operators

Logical operators are used to perform logical "AND", "OR", and "NOT" operations. They are typically used with conditional statements.

| Operator | Description | Example  |
| -------- | ----------- | -------- |
| `&&`     | Logical AND | `a && b` |
| `!`      | Logical NOT | `!a`     |

#### Example:

```java
boolean a = true;
boolean b = false;
System.out.println(a && b); // false
System.out.println(a || b); // true
System.out.println(!a);     // false
```

### 5. Increment and Decrement Operators

These operators are used to increment or decrement a variable by 1.

| Operator | Description | Example |
| -------- | ----------- | ------- |
| `++`     | Increment   | `a++`   |
| `--`     | Decrement   | `a--`   |

#### Example:

```java
int a = 10;
a++; // a becomes 11
a--; // a becomes 10 again
```

---
