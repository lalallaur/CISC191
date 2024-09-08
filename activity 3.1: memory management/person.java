public class Person {
    // instance variables stored in heap memory
    private String name;
    private int age;

    // constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // method to print person details
    public void displayInfo() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }

    // main method to create an object of person
    public static void main(String[] args) {

        // stack: stores local variable 'p1' in the main method, holds reference to the object in the heap
        // variables created inside methods, name and age in the constructor, are also stored in stack but
        // their actual objects are in the heap

        // heap: object created
        Person p1 = new Person("laur", 21);

        // heap: when line above is executed, 'Person' object is created in a heap, and string "laur" and integer "21" are
        // stored as instance variables.
        // stack: reference to this 'Person" object (stored in heap) is placed in the stack under the variable 'p1'

        // calling method using p1, accessing the object in the heap, printing object's data (name and age)
        p1.displayInfo();

        // stack: reference 'p1' set to 'null', meaning stack no longer references the 'Person' object.
        // heap: 'Person' object is now eligible for garbage collection because no live references are pointing to it.
        p1 = null;

        // when 'System.gc()' is called, garbage collector may reclaim the memory occupied by 'Person' object in the heap
        // not a guarantee that garbage collector will run immediately
        System.gc();
        System.out.println("end of program.");
    }

    // finalize method will be called before the object is destroyed by garbage collector
    @Override
    protected void finalize() throws Throwable {
        System.out.println("garbage collector is called for Person object.");
        super.finalize(); // call the superclass finalize method
    }
}
