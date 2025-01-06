package stringpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public final class Person {
    private final String name;
    private final List<String> hobbies;

    // Constructor to initialize the fields
    public Person(String name, List<String> hobbies) {
        this.name = name;

        this.hobbies = List.copyOf(hobbies);  // Java 9+ to ensure immutability
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies);  // Make the list unmodifiable
    }

    // Method to change the name, returns a new Person object with the modified name
    public Person withName(String newName) {
        return new Person(newName, this.hobbies);
    }

    // Method to add a hobby, returns a new Person object with the new hobby added
    public Person withHobby(String newHobby) {
        List<String> newHobbies = new ArrayList<>(this.hobbies);
        newHobbies.add(newHobby);
        return new Person(this.name, newHobbies);
    }

    public static void main(String[] args) {
        List<String> hobbies = List.of("Reading", "Cycling");
        Person person = new Person("John", hobbies);

        // Display the original object
        System.out.println(person.getName()); // Output: John
        System.out.println(person.getHobbies()); // Output: [Reading, Cycling]

        // Create a new object with a different name
        Person updatedPerson = person.withName("Alice");

        // The original object remains unchanged
        System.out.println(person.getName()); // Output: John
        System.out.println(updatedPerson.getName()); // Output: Alice

        // Create a new object with an added hobby
        Person personWithNewHobby = person.withHobby("Swimming");

        // Original object is unchanged
        System.out.println(person.getHobbies()); // Output: [Reading, Cycling]
        System.out.println(personWithNewHobby.getHobbies()); // Output: [Reading, Cycling, Swimming]
        System.out.println(personWithNewHobby.getName()+" "+personWithNewHobby.getHobbies());

    }
}



