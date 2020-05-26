package entities;

public class EmissionFactors {

    private static final Double BIODIESEL = 0.81; //kgCO2e/litro
    private static final Double DIESEL = 2.79; //kgCO2e/litro
    private static final Double GASOLINE = 2.3; //kgCO2e/litro
    private static final Double ELETRICITY = 0.11; //kgCO2e/kWh
    private static final Double GAS = 0.19; //kgCO2e/kWh
    private static final Double FUEL_OIL = 3.19; //kgCO2e/litro
    private static final Double NATURAL_GAS = 0.21; //kgCO2e/kWh
    private static final Double WASTE = 0.01467; //kgCO2e/kg
    private static final Double WATER = 0.00003; //kgCO2e/litro
    private static final Double LGP = 1.69; //kgCO2e/litro - Gás liquefeito de petróleo, pode ser utilizado como gás de cozinha
    private static final Double BEEF = 60.0; //kgCO2e/kg
    private static final Double CHEESE = 21.0; //kgCO2e/kg
    private static final Double COFFEE = 17.0; //kgCO2e/kg
    private static final Double PIG_MEAT = 7.0; //kgCO2e/kg
    private static final Double POULTRY_MEAT = 6.0; //kgCO2e/kg
    private static final Double FISH = 5.0; //kgCO2e/kg
    private static final Double EGGS = 4.5; //kgCO2e/kg
    private static final Double RICE = 4.0; //kgCO2e/kg
    private static final Double MILK = 3.0; //kgCO2e/kg
    private static final Double FRUITS = 1.4; //kgCO2e/kg
    private static final Double VEGETABLES = 0.4; //kgCO2e/kg

    public static Double getBiodiesel() {
        return BIODIESEL;
    }
    public static Double getDiesel() {
        return DIESEL;
    }
    public static Double getGasoline() {
        return GASOLINE;
    }
    public static Double getEletricity() {
        return ELETRICITY;
    }
    public static Double getGas() {
        return GAS;
    }
    public static Double getFuelOil() {
        return FUEL_OIL;
    }
    public static Double getNaturalGas() {
        return NATURAL_GAS;
    }
    public static Double getWaste() {
        return WASTE;
    }
    public static Double getWater() {
        return WATER;
    }
    public static Double getLgp() {
        return LGP;
    }
    public static Double getBeef() {
        return BEEF;
    }
    public static Double getCheese() {
        return CHEESE;
    }
    public static Double getCoffee() {
        return COFFEE;
    }
    public static Double getPigMeat() {
        return PIG_MEAT;
    }
    public static Double getPoultryMeat() {
        return POULTRY_MEAT;
    }
    public static Double getFish() {
        return FISH;
    }
    public static Double getEggs() {
        return EGGS;
    }
    public static Double getRice() {
        return RICE;
    }
    public static Double getMilk() {
        return MILK;
    }
    public static Double getFruits() {
        return FRUITS;
    }
    public static Double getVegetables() {
        return VEGETABLES;
    }
}