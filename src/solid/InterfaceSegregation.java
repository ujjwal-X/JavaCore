package solid;

//Definition: A class should not be forced to implement interfaces it does not use.
//Example (Violation of ISP)

interface Animal {
    void fly();
    void swim();
    void run();
}

class Dog implements Animal {
    public void fly() {
        throw new UnsupportedOperationException();
    }

    public void swim() {
        // Dog swims
    }

    public void run() {
        // Dog runs
    }
}




//Example (Adhering to ISP)
//Split the interface into smaller, more focused interfaces:


interface Swimmer {
    void swim();
}

interface Runner {
    void run();
}

class Dog1 implements Swimmer, Runner {
    public void swim() {
        // Dog swims
    }

    public void run() {
        // Dog runs
    }
}


public class InterfaceSegregation {
}

