class Vehicle315 {
    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;

    void Vehicle315() {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup = 13;
    }
    Vehicle315(int passengers, int wheels, int maxspeed, int burnup){
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }Vehicle moskvich = new Vehicle(); // дефолт машина с обозначенными характеристиками
    Vehicle39 Ferrari = new Vehicle39(2,4,360,12);//машина с особыми параметрами которые обозначаются вручную в коде(вроде так)
}
