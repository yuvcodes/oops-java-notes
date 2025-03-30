# Encapsulation in Java

## Definition
Encapsulation is the principle of binding an object's state (data) and behavior (methods) together into one unit, typically a class.

## Benefits
- Prevents classes from being tightly coupled, making it easier to modify one class without affecting others.
- Enhances security and reduces errors by restricting direct access to certain attributes.

## Implementation
Attributes are made hidden from other classes and accessed indirectly through methods, creating clear interfaces for communication between classes.

## Types of Access Modifiers
Java has three main access modifiers:

- **Private**: Accessible only within the class it is defined.
- **Protected**: Accessible within the package and by subclasses.
- **Public**: Accessible from any other class.

### Default Access
If no access modifier is specified, the member is accessible only within its own package.

### Usage
Access modifiers help achieve encapsulation by restricting access to class members, enhancing security and reducing errors.

## Encapsulation with Access Modifiers
Encapsulation is achieved by making attributes private and providing public methods (getters and setters) to access and modify these attributes.

### Getters and Setters
- **Getters**: Allow other classes to retrieve attribute values.
- **Setters**: Allow modification of attribute values. This ensures controlled access to the attributes.

## Encapsulation in String Class
The `String` class in Java uses encapsulation to hide its internal representation (a byte array) from external classes, ensuring loose coupling.

### Public Methods
Methods like `length()`, `isEmpty()`, and `charAt()` allow interaction with the string's data without exposing the internal byte array.

### Immutability
Strings are immutable in Java, meaning their internal state cannot be modified after creation, which is enforced through encapsulation.

## Encapsulation Practice
Modify a `BankAccount` class to encapsulate its attributes (`owner` and `balance`) while making them accessible indirectly through methods.

### Methods to Implement
- **Withdrawal and deposit methods** to manage balance updates.
- **Getters** to retrieve the balance and owner.

### Constructor and Main Class
Create a constructor for the `BankAccount` class and a main class to instantiate a `BankAccount`, perform a withdrawal, and print the resulting balance.

