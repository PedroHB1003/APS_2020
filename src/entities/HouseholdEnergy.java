package entities;

public class HouseholdEnergy {

	double eletricity,gas,oil,propane;
	//propane � g�s de cozinha
	
	public HouseholdEnergy(double eletricity, double gas, double oil, double propane) {
		this.eletricity = eletricity;
		this.gas = gas;
		this.oil = oil;
		this.propane = propane;
	}
}
