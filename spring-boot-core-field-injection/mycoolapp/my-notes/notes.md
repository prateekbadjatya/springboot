🎯 What is IoC in the simplest way?

IoC means: “Don’t make the objects yourself, let Spring give them to you.”




🚗 Example without IoC
class Engine {
void start() {
System.out.println("Engine Started!");
}
}

class Car {
Engine engine = new Engine(); // Car is creating its own Engine

    void drive() {
        engine.start();
        System.out.println("Car is driving...");
    }
}


Here Car creates the Engine.

If tomorrow you want DieselEngine instead of Engine, you must change Car code.

This is tightly coupled.




//==================================================================








🚗 Example with IoC (Spring way)
class Engine {
void start() {
System.out.println("Engine Started!");
}
}

class Car {
Engine engine;  // Car just says "I need an Engine"

    // Spring will give (inject) Engine into Car
    public Car(Engine engine) {
        this.engine = engine;
    }

    void drive() {
        engine.start();
        System.out.println("Car is driving...");
    }
}


Now Car does not create Engine.

Car only depends on Engine.

Spring’s IoC Container creates Engine and gives it to Car.









//===========================================================


✅ Super Simple Definition:
Inversion of Control = You don’t create objects, Spring creates them and gives them to you.