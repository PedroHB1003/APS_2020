package Entities;

public class Housing {

    private Double use, housingFootprint;
    private Integer amountPeople;

    public Housing() {
    }
    public Housing(Double use, Integer amountPeople) {
	    this.use = use;
	    this.amountPeople = amountPeople;
    }
    public Housing(Double use, Double housingFootprint, Integer amountPeople) {
	    this.use = use;
	    this.housingFootprint = housingFootprint;
	    this.amountPeople = amountPeople;
    }
    public Double getUse() {
	    return use;
    }
    public void setUse(Double use) {
	    this.use = use;
    }
    public Double getHousingFootprint() {
	    return housingFootprint;
    }
    public void setHousingFootprint(Double housingFootprint) {
	    this.housingFootprint = housingFootprint;
    }
    public Integer getAmountPeople() {
	    return amountPeople;
    }
    public void setAmountPeople(Integer amountPeople) {
	    this.amountPeople = amountPeople;
    }
    public void eletricity(Double use) {
	    housingFootprint += use * 12 * EmissionFactors.getEletricity() / getAmountPeople();
    }
    public void naturalGas(Double use) {
	    housingFootprint += use * 12 * EmissionFactors.getNaturalGas() / getAmountPeople();
    }
    public void fuelOil(Double use) {
	    housingFootprint += use * 12 * EmissionFactors.getFuelOil() / getAmountPeople();
    }
    public void lgp(Double use) {
	    housingFootprint += use * 12 * EmissionFactors.getLgp() / getAmountPeople();
    }
    public void waste(Double use) {
	    housingFootprint += use * 52 * EmissionFactors.getWaste() / getAmountPeople(); //Esse método irá pegar a quantidade de desperdício em quilos por semana e multiplar por 52 semanas (1 ano)
    }
    public void water(Double use) {
	    housingFootprint += use * 365 * EmissionFactors.getWater() / getAmountPeople(); //Consumo diário de água
    }
}