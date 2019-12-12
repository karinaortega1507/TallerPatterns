package builder;

import creacional.Vehiculo;

public class VehiculoDirector {
	
	private VehiculoBuilder builder;
	
	
	
	public void contruirVehiculo() {
		builder.definirVehiculo();
	}
	
	
	public Vehiculo getComputador() {
		return builder.getVehiculo();
		
	}
	
	public VehiculoDirector(VehiculoBuilder cB) {
		builder = cB;
		
	}
}
