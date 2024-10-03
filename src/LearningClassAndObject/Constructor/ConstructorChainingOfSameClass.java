package LearningClassAndObject.Constructor;

public class ConstructorChainingOfSameClass {
    private String name;
    private int age;

    // Constructor with all parameters
    public ConstructorChainingOfSameClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor with default age
    public ConstructorChainingOfSameClass(String name) {
        this(name, 30); // Calls the other constructor
    }

    // Default constructor
    public ConstructorChainingOfSameClass() {
        this("Unknown"); // Calls the constructor with one parameter
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        ConstructorChainingOfSameClass p1 = new ConstructorChainingOfSameClass("Alice", 25);
        ConstructorChainingOfSameClass p2 = new ConstructorChainingOfSameClass("Bob");
        ConstructorChainingOfSameClass p3 = new ConstructorChainingOfSameClass();

        System.out.println(p1); // Output: Person{name='Alice', age=25}
        System.out.println(p2); // Output: Person{name='Bob', age=30}
        System.out.println(p3); // Output: Person{name='Unknown', age=30}
    }
}


