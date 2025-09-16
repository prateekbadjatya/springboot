🔑 What is Setter Injection?

Setter Injection means:
👉 Instead of giving the dependency (like Engine) through the constructor, Spring gives it using a setter method.

So Spring calls the setEngine(...) method and passes the Engine object.




🚗 Example (Setter Injection)
Engine class
import org.springframework.stereotype.Component;

@Component
class Engine {
void start() {
System.out.println("Engine Started!");
}
}

Car class (uses Setter Injection)



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class Car {
private Engine engine;

    // Setter method
    @Autowired   // tells Spring: inject Engine here
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    void drive() {
        engine.start();
        System.out.println("Car is driving...");
    }
}




✅ Summary in 1 Line:
Setter Injection = Spring gives the dependency by calling the setter method of your class.