package Entities;


public class Food {

	private Double consumption, foodFootprint;

	public Food() {
	}
	public Food(Double consumption) {
		this.consumption = consumption;
	}
	public Food(Double consumption, Double foodFootprint) {
		this.consumption = consumption;
		this.foodFootprint = foodFootprint;
	}
	public Double getConsumption() {
		return consumption;
	}
	public void setConsumption(Double consumption) {
		this.consumption = consumption;
	}
	public Double getFoodFootprint() {
		return foodFootprint;
	}
	public void setFoodFootprint(Double foodFootprint) {
		this.foodFootprint = foodFootprint;
	}
	public void balancedDiet(Double consumption) {
		foodFootprint+= consumption * 50.2;
	}
	public void basicDiet(Double consumption) {
		foodFootprint += consumption * 36.5;
	}
	public void veganDiet(Double consumption) {
		foodFootprint += consumption * 7.8;
	}
}