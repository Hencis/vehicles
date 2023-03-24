public class Main {
    public static void main(String[] args) {
        Car car1 = new CClass(30, "DIESEL", 5, 7.6, 10000.0, 22.0, "12gh678");
        Car vehicle= new Golf(30, "diesel", 5, 4.9,30.9, 17.0, "124nm6");

        car1.start();

        car1.shiftGear(5);

        car1.drive(1000.0); // drives 0.01 KMs



        car1.stop();

      /*  car1.shiftGear(5);

        car1.drive(3.2);

        car1.shiftGear(3);

        car1.drive(0.5);


        car1.shiftGear(4);

        car1.drive(0.5);

        car1.shiftGear(4);

        car1.drive(0.5);

        car1.shiftGear(5);

        car1.drive(10.0);

        car1.shiftGear(4);

        car1.drive(0.5);

        car1.shiftGear(3);

        car1.drive(0.1);

        car1.stop();
        Double availableFuel2 = ((CClass) car1).getAverageFuelConsumption();

        Double fuelConsumedPer100Km2 = car1.getAverageFuelConsumption();

        vehicle.start();
        vehicle.shiftGear(1);

        vehicle.drive(1.0);

        vehicle.stop();

        Double availableFuel3 = vehicle.getAvailableFuel();

        Double fuelConsumedPer100Km3 = vehicle.getAverageFuelConsumption();*/
    }
}
