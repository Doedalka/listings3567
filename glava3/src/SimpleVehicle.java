public class SimpleVehicle {
    int passengers;

    class Reftypes {
        public void main(String[] args) {
            SimpleVehicle car1, car2;
            car1 = new SimpleVehicle();
            car1.passengers = 25;
            car2 = car1;
            System.out.println("Количество пассажиров car2 равно" + car2.passengers);
            car2.passengers = 50;
        }
    }
}
