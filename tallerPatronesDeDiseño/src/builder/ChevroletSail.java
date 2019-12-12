package builder;

import creacional.Vehiculo;

public class ChevroletSail extends VehiculoBuilder{

    @Override
    public void contruirMarcaModelo() {
        c.setMarca("Chevrolet");
        c.setModelo("Sail");
        
    }

    @Override
    public void definirMotor() {
        c.setMotor(1.4f);
    }

    @Override
    public void definirAlmacenamiento() {
        c.setAlmacenamiento(1000);
    }

    @Override
    public void definirCarroceria() {
        c.setCarroceria("1J23KO23");
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
        return c;
    }
	

}
