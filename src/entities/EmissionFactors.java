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
}