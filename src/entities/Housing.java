package entities;

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
		housingFootprint += use * EmissionFactors.getEletricity();
	}
	public void naturalGas(Double use) {
		housingFootprint += use * EmissionFactors.getNaturalGas();
	}
	public void lgp(Double use) {
		housingFootprint += use * EmissionFactors.getLgp();
	}
	public void waste(Double use) {
		housingFootprint += use * EmissionFactors.getWaste();
	}
	public void water(Double use) {
		housingFootprint += use * EmissionFactors.getWater();
	}
}
