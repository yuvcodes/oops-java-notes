### Classes as Blueprints
Classes in Java are used to model real-life objects by defining their attributes (properties) and behaviors (actions).

  
### Attributes and Behaviors
- **Attributes** represent the state of an object (e.g., height, trunk diameter for a tree).
- **Behaviors** represent actions the object can perform (e.g., growing).


### Objects
- In Java, an object is an instance of a class
- Objects are created using constructors, which initialize their attributes.


### Purpose of Constructors
Constructors are special functions in a class used to create and initialize objects.


### Creating a Constructor
- A constructor is defined using the class name and does not require a return type. 
- It takes parameters to set the initial values of an object's attributes.

### Using the Constructor
By using the `new` keyword and the constructor, you can create an object with specified attributes.  
For example, creating a tree with specific height, diameter, and type.  

## Using Concrete Instances for Application Logic

### Instance Creation
You can create multiple instances of a class, each with its own set of attribute values.  
For example, creating an **oak tree** and a **maple tree** with different heights.

### Application Logic
You can write **application logic** that interacts with these instances, such as printing messages based on their attributes (e.g., height).

### Class and Instances Relationship
- Changes to the **class** (like adding a new method) affect **all instances** of that class.
- For example, adding a method to **announce if a tree is tall** can be used by all tree instances.  

### Employee class - practise question
- **Creating an Employee Class:** Define an `Employee` class with attributes such as `name`, `age`, `salary`, and `location`. Additional attributes can be added as needed.
- **Raise Behavior:** Implement a method to increase the employee's salary, either with a parameterized value or a fixed percentage.
- **Instance Creation:** Use a separate class to create employee instances, apply salary raises, and print salaries to verify updates.
