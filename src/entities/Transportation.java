package entities;

public class Transportation {

	//Implementar como atributos ou como métodos?
	private Double car,taxi,bus,subway,plane;
	//Valores ainda não definidos para as constantes
	private static final Double AVIATION_GASOLINE = 0.0, ETHANOL = 0.0, BIODIESEL = 0.0, DIESEL = 0.0, GASOLINE = 0.0, GNV = 0.0;

	public Transportation() {
	}
	public Transportation(double car, double taxi, double bus, double subway, double plane) {
		this.car = car;
		this.taxi = taxi;
		this.bus = bus;
		this.subway = subway;
		this.plane = plane;
	}
}
