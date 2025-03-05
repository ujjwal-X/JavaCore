package solid;

//Definition: High-level modules should not depend on low-level modules. Both should depend on abstractions.
//Example (Violation of DIP)
//The Store class directly depends on a concrete implementation:
class MySQLDatabase {
    public void save(String data) {
        // Save to MySQL database
    }
}

class Store {
    private MySQLDatabase database;

    public Store(MySQLDatabase database) {
        this.database = database;
    }

    public void saveData(String data) {
        database.save(data);
    }
}

//Example (Adhering to DIP)
//Use an abstraction to decouple dependencies:

interface Database {
    void save(String data);
}

class MySQLDatabase1 implements Database {
    public void save(String data) {
        // Save to MySQL database
    }
}

class Store1 {
    private Database database;

    public Store1(Database database) {
        this.database = database;
    }

    public void saveData(String data) {
        database.save(data);
    }
}


public class DependencyInversion {
    public static void main(String[] args) {
        
    }
}
