package entities;

public class Transportation {

	double car,taxi,bus,subway,plane,gasoline,gasolineA,gasolineP,ethanol,ethanolA,diesel,dieselA,biodisel,gnv,electric;

	public Transportation(double car, double taxi, double bus, double subway, double plane, double gasoline,
			double gasolineA, double gasolineP, double ethanol, double ethanolA, double diesel, double dieselA,
			double biodisel, double gnv, double electric) {
		this.car = car;
		this.taxi = taxi;
		this.bus = bus;
		this.subway = subway;
		this.plane = plane;
		this.gasoline = gasoline;
		this.gasolineA = gasolineA;
		this.gasolineP = gasolineP;
		this.ethanol = ethanol;
		this.ethanolA = ethanolA;
		this.diesel = diesel;
		this.dieselA = dieselA;
		this.biodisel = biodisel;
		this.gnv = gnv;
		this.electric = electric;
	}
	//a lista de atributos esta grande e é proposital, muitas calculadoras de pegada carbonica carecem em variedade
}
