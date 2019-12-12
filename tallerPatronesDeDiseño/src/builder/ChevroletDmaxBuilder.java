package builder;

import creacional.Vehiculo;

public class ChevroletDmaxBuilder extends VehiculoBuilder{

    @Override
    public void contruirMarcaModelo() {
        c.setMarca("Chevrolet");
        c.setModelo("Dmax");
        
    }

    @Override
    public void definirMotor() {
        c.setMotor(3f);
    }

    @Override
    public void definirAlmacenamiento() {
        c.setAlmacenamiento(2200);
    }

    @Override
    public void definirCarroceria() {
        c.setCarroceria("45FB32S1");
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
