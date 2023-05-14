class Vehicle310 {
    int passengers;
    int wheels;
    private int maxspeed;
    int burnup;

    Vehicle310(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }

    double distance(double interval) {
        double val = this.maxspeed * interval;
        return val;
    }
}
class VehicleAccesDemo{
    public static void main(String[] args) {
        Vehicle310 Ferrari = new Vehicle310(2, 4 , 360 , 12);
        double distance = Ferrari.distance(0.5);
        System.out.println("Ferrari за полчаса проедет "+ distance+ "Км");
    }
}