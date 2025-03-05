package java8.realworldquestion;

public class Student {
    private int id;
    private String name;
    private int rollNumber;
    private String className;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Student(int id, String name, int rollNumber, String className) {
        this.id = id;
        this.name = name;
        this.rollNumber = rollNumber;
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", className='" + className + '\'' +
                '}';
    }
}



