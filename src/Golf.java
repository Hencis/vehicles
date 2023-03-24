public class Golf extends Volkswagen{
        private String chassisNumber;

        public Golf(Integer fuelTankSize, String fuelType, Integer gears, Double consumptionPer100Km, Double availableFuel, Double tireSize, String chassisNumber) {
            super(fuelTankSize, fuelType, gears, consumptionPer100Km, availableFuel, tireSize);
            this.chassisNumber = chassisNumber;

        }

        public String getChassisNumber() {
            return this.chassisNumber;
        }
}
