# Thinking-in-Java
  Go to the Resource: Thinking in Java by Bruce Eckel [link](http://www.dblab.ntua.gr/~gtsat/collection/Java%20books/Bruce.Eckel.Thinking.In.Java.4th.Edition.Dec.2007.eBook-BBL.pdf)

                  [Most of selected example source code in here selected to the real-projects]
                  
                  
### 1. Introduction to Objects

    1.1 The progress of abstraction
    
     | All programming languages provide abstractions. 
     | It can be argued that the complexity of the problems you’re able to solve is directly related to the kind
     | and quality of abstraction.
    
      
     
  --
### 2. Everything is an Object

  An object has state, behavior and identity.
        
  The tellers, customers, accounts, transactions, etc., can each be represented with a unique entity in the computer program.
  This entity is the object, and each object belongs to a particular class that defines its characteristics and behaviors.

  There needs to be a way to make a request of the object so that it will do something, such as complete a transaction, draw something on the screen,
  or turn on a switch. And each object can satisfy only certain requests. The requests you can make of an object are defined by its interface,
  and the type is what determines the interface. A simple example might be a representation of a light bulb:


<img width="720" alt="Screen Shot 2022-01-11 at 12 24 41 AM" src="https://user-images.githubusercontent.com/11626327/148791691-4ae9b651-d9a0-4d5c-9753-1933f685e3c5.png">

 <b> Java uses three explicit keywords to set the boundaries in a class: public, private, and protected. </b>
  
 <b> <u> public means the following element is available to everyone. </u> </b>
 
 <b> The private keyword, on the other hand, means that no one can access that element except you, </b> the creator of the type, inside methods of that type.
 private is a brick wall between you and the client programmer. 
 
 Someone who tries to access a private member will get a compile-time error. 
 
 <b> The protected keyword acts like private, with the exception that an inheriting class has access to protected members, but not private members. </b>

 ### 2.1 Reusing the implementation
  Code reuse is one of the greatest advantages that <b> object-oriented programming </b> languages provide.

 You are composing a new class from existing classes, this concept is called composition (if the composition happens dynamically, 
 it’s usually called aggregation).
 Composition is often referred to as a “has-a” relationship, as in “A car has an engine.”

<img width="394" alt="Screen Shot 2022-01-11 at 12 44 29 AM" src="https://user-images.githubusercontent.com/11626327/148794723-90252d0c-39cf-4727-a12a-5864a9b5ea71.png">

### Interchangeable objects with polymorphism

  <b> Java also has numerous containers in its standard library. </b>

In some libraries, one or two generic containers is considered good enough for all needs, 
and in others (Java, for example) the library has different types of containers for different needs: 

 >> several different kinds of <b> List classes (to hold sequences) </b>,
    <b> Maps (also known as associative arrays, to associate objects with other objects)</b>, 

  <b> Sets (to hold one of each type of object), and more components such as queues, trees, stacks, etc. </b>
  
There are two reasons that you need a choice of containers. First, containers provide different types of interfaces and external behavior.

<b> A stack has a different interface and behavior than a queue</b>, which is different from a set or a list.
One of these might provide a more flexible solution to your problem than the other. 

Second, different containers have different efficiencies for certain operations.
For example, there are two basic types of List: ArrayList and LinkedList. 
Both are simple sequences that can have identical interfaces and external behaviors. But certain operations can have significantly different costs. 

Randomly accessing elements in an ArrayList is a constant-time operation; it takes the same amount of time regardless of the element you select. 

However, in a <b>  LinkedList </b> it is expensive to move through the list to randomly select an element, and it takes longer to find an element that is farther down the list. 
On the other hand, if you want to insert an element in the middle of a sequence, 

You might start building your program with a LinkedList and, when tuning for performance, change to an ArrayList.
Because of the abstraction via the interface List, you can change from one to the other with minimal impact on your code.

### Relational operators

Relational operators generate a boolean result. They evaluate the relationship between the values of the operands.

A relational expression produces true if the relationship is true, and false if the relationship is untrue. The relational operators are less than (<), greater than (>), **less than or equal to (<=), greater than or equal to (>=), equivalent (==) and not equivalent (!=). **


Equivalence and nonequivalence work with all primitives, but the other comparisons won’t work with type boolean. Because boolean values can only be true or false, “greater than” and “less than” doesn’t make sense.

      //: operators/Equivalence.java
          public class Equivalence {
            public static void main(String[] args) {
              Integer n1 = new Integer(47);
              Integer n2 = new Integer(47);
              System.out.println(n1 == n2);
              System.out.println(n1 != n2);
            }
          } /* Output:
          false
          true
          *///:~

### The static keyword.

You can achieve both of these effects with the <b> static keyword</b>. 



### 3. Operators
