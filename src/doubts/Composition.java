package doubts;

class Engine {
    int number=0;
    Engine(int n){
        this.number=n;
        System.out.println(number + " from engine class");
    }
}

class Car {
    Engine e;
    Car(Engine e){
        System.out.println(e.toString() + "from Car class");
    }
}

public class Composition {
    public static void main(String[] args) {
        Engine e = new Engine(1);
        Car c = new Car(e);
    }
}
