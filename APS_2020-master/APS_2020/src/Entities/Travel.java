package Entities;

public class Travel {

    //distance (km/yr) * EF (kg CO2e/km) = emissions (kg CO2e/yr)
    public static Double distance, travelFootprint;

    public Travel() {
    }
    public Travel(Double distance) {
	this.distance = distance;
    }
    public Travel(Double distance, Double travelFootprint) {
	this.distance = distance;
	this.travelFootprint = travelFootprint;
    }
    public Double getDistance() {
	return distance;
    }
    public void setDistance(Double distance) {
	this.distance = distance;
    }
    public Double getTravelFootprint() {
	return travelFootprint;
    }
    public void setTravelFootprint(Double travelFootprint) {
	this.travelFootprint = travelFootprint;
    }
    //Implementar como métodos!
    public void carBiodiesel(Double distance) {
	travelFootprint += distance * EmissionFactors.getBiodiesel();
    }
    public void carDiesel(Double distance) {
	travelFootprint += distance * EmissionFactors.getDiesel();
    }
    public void carGasoline(Double distance) {
	travelFootprint += distance * EmissionFactors.getGasoline();
    }
    public void carUberTaxi(Double distance) {
	travelFootprint += distance * 0; //Fator de emissão a ser definido
    }
    public void bus(Double distance) {
	travelFootprint += distance * 0; //Fator de emissão e quantidade média de pessoas em uma viagem de ônibus a serem definidos
    }
    public void metro(Double distance) {
	travelFootprint += distance * 0; //Fator de emissão e quantidade média de pessoas em uma viagem de metrô a serem definidos
    }
}