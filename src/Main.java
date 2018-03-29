import entity.Bike;
import entity.Car;
import entity.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle v=new Bike();
        v.accelerate();
        v.test();
        Bike b=(Bike)v;
        b.gear();

        v=new Car();
        v.accelerate();
        Car c=(Car)v;
        c.gear();
    }

}
