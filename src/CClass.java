public class CClass extends Mercedes {
    private String chassisNumber;

    public CClass(Integer fuelTankSize, String fuelType, Integer gears, Double consumptionPer100Km, Double availableFuel, Double tireSize, String chassisNumber) {
        super(fuelTankSize, fuelType, gears, consumptionPer100Km, availableFuel, tireSize);
        this.chassisNumber = chassisNumber;

    }

    public String getChassisNumber() {
        return this.chassisNumber;
    }


    /*public void drive(Double numberOfKm) {
        //How much fuel is needed?
        //Fuel = Distance / 100 x Consumption
        if (this.getCurrentGear() == 1) {
            this.newConsumption = getConsumptionPer100Km() / 100;
            setNewConsumption(this.newConsumption);
            this.fuelNeed = numberOfKm * getNewConsumption();
            setUsedFuel(usedFuel+fuelNeed);

        } else if (beforeGear < getCurrentGear()) {
            this.newConsumption = this.getConsumptionPer100Km() / 100 - (this.getConsumptionPer100Km() * 0.1) / 100;
            setNewConsumption(this.newConsumption);
            this.fuelNeed = numberOfKm * this.newConsumption;
            setUsedFuel(usedFuel+fuelNeed);

        } else {
            this.newConsumption = (this.getConsumptionPer100Km() + (this.getConsumptionPer100Km() * 0.1)) / 100;
            setNewConsumption(this.newConsumption);
            this.fuelNeed = numberOfKm * this.newConsumption;
            setUsedFuel(usedFuel+fuelNeed);
        }
        System.out.println("We need this much fuel:");
        System.out.printf("%,.5f ", getFuelNeed());
        System.out.println("\n");

        if (getFuelNeed() <= getAvailableFuel()) {
            this.availableFuel = getAvailableFuel() - this.fuelNeed;
            System.out.println("Remained fuel: ");
            System.out.printf("%,.5f ", this.availableFuel);
            setUsedFuel(usedFuel+fuelNeed);
            System.out.println(" \nThere is enough fuel to drive so we keep going");
        } else {
            System.out.println("\nThere is not enough fuel to drive " + numberOfKm + "km with this car");

        }
    }

    @Override
    public void start() {
        System.out.println("The vehicle is started");
        setCurrentGear(0);
        setUsedFuel(0.0);
        getUsedFuel();

    }

    @Override
    public void stop() {
        System.out.println("The vehicle is stopped and has used" + getUsedFuel() + "fuel");
        setCurrentGear(0);
        setUsedFuel(0.0);
    }

    public void shiftGear(Integer nextGear) {
        if (beforeGear < nextGear) {
            beforeGear = nextGear - 1;
        } else if (beforeGear == nextGear) {
            beforeGear = nextGear + 1;
        } else {
            beforeGear = beforeGear - 1;
        }
        System.out.println("The car was in " + beforeGear + " and now is in " + nextGear);
        if (nextGear > getGears()) {
            System.out.println("You can't shift above the maximum gear!");
        }
        setCurrentGear(nextGear);


    }*/

}



