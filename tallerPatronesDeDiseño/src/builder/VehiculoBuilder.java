package builder;

import creacional.Vehiculo;


public abstract class VehiculoBuilder {
	
	
	protected Vehiculo c;
	
	public abstract void contruirMarcaModelo();
	
	public abstract void definirMotor();
	
	public abstract void definirAlmacenamiento();
	
	public abstract void definirCarroceria();
        
        public abstract void definirVehiculo();
        
	public abstract Vehiculo getVehiculo();

}
