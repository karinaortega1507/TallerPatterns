/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpatronesdediseño;

import builder.ChevroletDmaxBuilder;
import builder.ChevroletSailBuilder;
import builder.ChevroletSparkBuilder;
import builder.VehiculoDirector;
import creacional.Vehiculo;


/**
 *
 * @author Josue
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VehiculoDirector vD1 = new VehiculoDirector(new ChevroletDmaxBuilder());
        vD1.contruirVehiculo();
        Vehiculo v1=vD1.getComputador();
        System.out.println(v1);
        
        VehiculoDirector vr2 = new VehiculoDirector(new ChevroletSailBuilder());
        vr2.contruirVehiculo();
        Vehiculo v2=vr2.getComputador();
        System.out.println(v2);
        
        VehiculoDirector vr3 = new VehiculoDirector(new ChevroletSparkBuilder());
        vr3.contruirVehiculo();
        Vehiculo v3=vr3.getComputador();
        System.out.println(v3);
        
    }
    
}
