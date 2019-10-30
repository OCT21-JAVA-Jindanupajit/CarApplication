import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class Car extends Vehicle {

    private Integer mileage;

    public Car() {
        this("","",Color.NOCOLOR,0,false,0);
    }

    public Car(String make, String model, Color color, Integer speed, boolean start, Integer mileage) {
        super(make, model, color, speed, start);
        this.mileage = mileage;
    }


    public String start() {
        this.start = true;
        return act("is starting");
    }

    public String stop() {
        this.start = false;
        return act("is stopped");

    }

    public String pass(Car otherCar) {
        return act("is passing", "the "+otherCar);
    }

    public String accelerate() {
        return act("is accelerating");
    }

    public String honkAt(Car otherCar) {
        return act("honk at", "the "+otherCar);
    }



    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }
}
