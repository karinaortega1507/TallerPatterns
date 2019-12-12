package builder;

import creacional.Vehiculo;

public class ChevroletSparkBuilder extends VehiculoBuilder{

    @Override
    public void contruirMarcaModelo() {
        c.setMarca("Chevrolet");
        c.setModelo("Spark");
        
    }

    @Override
    public void definirMotor() {
        c.setMotor(1.2f);
    }

    @Override
    public void definirAlmacenamiento() {
        c.setAlmacenamiento(500);
    }

    @Override
    public void definirCarroceria() {
        c.setCarroceria("JWE9EWF8");
    }

    @Override
    public void definirVehiculo() {
        c=new Vehiculo();
        contruirMarcaModelo();
        definirMotor();
        definirAlmacenamiento();
        definirCarroceria();
    }

    @Override
    public Vehiculo getVehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	

}
