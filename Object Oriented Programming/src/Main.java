import algebra.calculation.calculator;
//HOW TO CREATE A CLASS?
class student {
    int age;
    String name;
    int x, y;

    //WHAT IS CONSTRUCTOR?
    //In Java, a Constructor is a block of codes similar to the method.
    //It is called when an instance of the class is created.
    //At the time of calling the constructor, memory for the object is allocated in the memory.
    //It is a special type of method that is used to initialize the object.
    //Every time an object is created using the new() keyword, at least one constructor is called.

    //Default Constructor
    student() {
        System.out.println("This is a default constructor");
    }

    //Parameterized Constructor
    student(int a, int b) {
        student obj = new student();
        System.out.println("This is a Parameterized Constructor");
        x = a;
        y = b;
    }

    int add(){
        return x + y;
    }

    int sub(){
        return x - y;
    }

    int mul(){
        return x * y;
    }

    int div(){
        return x / y;
    }

    //WHAT IS METHOD?
    //=> BLOCK OF CODE PERFORMING SOME ACTIONS WHICH RUNS ONLY WHEN IT IS CALLED BY THE USER
    //=> BIG CODE ( OBJ.FACTORIAL(), OBJ.DISPLAY_ARRAY() )

    //DIFFERENCE B/W FUNCTION AND METHOD
    //=> FUNCTIONS ARE CALLED BY JUST THEIR NAME... FOR EXAMPLE { FACTORIAL() } BUT METHOD IS CALLED USING AN OBJECT
    // ANY FUNCTION INSIDE A CLASS BASICALLY WHICH HAS TO BE CALL USING AN OBJECT IS CALLED A METHOD... FOR EXAMPLE { OBJECT NAME.FACTORIAL() }

    //WHY ARE IMPORTANT METHODS IN JAVA?
    //=> 1) WRITE ONCE AND USE MANY TIMES
    //=> 2) TIME SAVE
    //=> 3) DUPLICATE CODE REDUCE

    //TYPES OF METHODS:
    //USER DEFINED METHODS
    //STD LIB METHODS

    //HOW TO DECLARE A METHOD?
    // ACCESS MODIFIER    RETURN TYPE    METHOD NAME(PARAMETER LIST) {
                  //CODE TO BE EXECUTED
    // }

    //WHAT IS METHOD SIGNATURE IN JAVA?
    // METHOD NAME + PARAMETER LIST
    // EXAMPLE ==> sum(int a, int b)

    public int sum(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        //HOW TO CREATE AN OBJECT?
        //CLASS NAME OBJECT NAME = NEW(KEYWORD) CLASS NAME() ->{CONSTRUCTOR}
        student obj1 = new student(55, 7);
        //HOW TO ACCESS ATTRIBUTE OF A CLASS?
        //   *OBJECT NAME.ATTRIBUTE NAME*
        obj1.age = 20;
        obj1.name = "Debjit Das";

        System.out.println("Name is "+obj1.name+" & my age is "+obj1.age);

        //HOW TO ACCESS METHOD OF A CLASS?
        //   *OBJECT NAME.METHOD NAME*
        int sum = obj1.sum(2, 3);
        System.out.println("sum is "+sum);

        System.out.println(obj1.add());
        System.out.println(obj1.sub());
        System.out.println(obj1.mul());
        System.out.println(obj1.div());

        //A package in Java is used to group related classes. Think of it as a folder in a file directory.
        //We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:

        //Built-in Packages (packages from the Java API)
        //User-defined Packages (create your own packages)

        calculator obj2 = new calculator();
    }
}