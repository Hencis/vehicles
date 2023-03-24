public abstract class Car implements Vehicle {
    private final Integer fuelTankSize;
    private final String fuelType;
    private final Integer gears;

    private final Double consumptionPer100Km;
    // private String chassisNumber;
    private Double availableFuel;
    private Integer beforeGear = 0;
    private Double tireSize;

    public Double getTireSize() {
        return tireSize;
    }

    private Double averageFuelConsumption;

    private Double consumedFuel = 0.0;

    private Double totalConsumedFuel = 0.0;

    private Double totalKm = 0.0;

    public String getFuelType() {
        return fuelType;
    }

    public Integer getGears() {
        return gears;
    }

    public Integer getFuelTankSize() {
        return fuelTankSize;
    }

    public Double getConsumptionPer100Km() {
        return consumptionPer100Km;
    }

    public Double getAvailableFuel() {
        return availableFuel;
    }

    protected Car(Integer fuelTankSize, String fuelType, Integer gears, Double consumptionPer100Km, Double availableFuel, Double tireSize) {
        this.fuelTankSize = fuelTankSize;
        this.fuelType = fuelType;
        this.gears = gears;
        this.consumptionPer100Km = consumptionPer100Km;
        this.availableFuel = availableFuel;
        this.tireSize = tireSize;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuelTankSize=" + fuelTankSize +
                ", fuelType='" + fuelType + '\'' +
                ", gears=" + gears +
                ", consumptionPer100Km=" + consumptionPer100Km +
                ", availableFuel=" + availableFuel +
                ", tireSize=" + tireSize +
                '}';
    }

    @Override
    public void start() {
        System.out.println("The car is started.");
        averageFuelConsumption = 0.0;

    }

    protected void shiftGear(Integer gear) {
        if ((gear > gears) || gear < 0) {
            System.out.println("Invalid gear");
            return;
        }
        calculateAverageFuelConsumption(gear);
        beforeGear = gear;
    }

    private void calculateAverageFuelConsumption(Integer gear) {
        if (this.beforeGear < gear) {
            //averageFuelConsumption = averageFuelConsumption * (1 + (gear - beforeGear) / 10);
            totalConsumedFuel = totalConsumedFuel * (1 + (gear - beforeGear) / 10);

        } else {
            // averageFuelConsumption = averageFuelConsumption / (1 + (beforeGear - gear) / 10);
            totalConsumedFuel = totalConsumedFuel / (1 + (beforeGear - gear) / 10);
        }
    }

    public void drive(Double km) {
        consumedFuel = km * consumptionPer100Km / 100;
        if (consumedFuel > this.availableFuel) {
            System.out.println("You don't have enough fuel to drive " + km + " km's!");
        }
        availableFuel = availableFuel - consumedFuel;
        totalKm = totalKm + km;
        totalConsumedFuel += consumedFuel;

    }

    protected Double getAverageFuelConsumption() {
        averageFuelConsumption = totalConsumedFuel * 100 / totalKm;
        return averageFuelConsumption;

    }

    public void stop() {
        System.out.println("The car has stopped");
        System.out.println("This much fuel remained in the car: " + availableFuel);
        System.out.println("The total of the consumed fuel: " + totalConsumedFuel);
        System.out.println("The total km: " + totalKm);

    }


}

