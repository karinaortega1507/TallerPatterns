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
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Josue
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        ArrayList<Vehiculo> listVehiculos = new ArrayList<>();
        VehiculoDirector vD1 = new VehiculoDirector(new ChevroletDmaxBuilder());
        vD1.contruirVehiculo();
        Vehiculo v1=vD1.getComputador();
        listVehiculos.add(v1);
        
        VehiculoDirector vr2 = new VehiculoDirector(new ChevroletSailBuilder());
        vr2.contruirVehiculo();
        Vehiculo v2=vr2.getComputador();
        listVehiculos.add(v2);
        
        VehiculoDirector vr3 = new VehiculoDirector(new ChevroletSparkBuilder());
        vr3.contruirVehiculo();
        Vehiculo v3=vr3.getComputador();
        listVehiculos.add(v3);
        
        System.out.println("\n\n\t\t************ SISTEMA DE VENTAS ************\n\n");
        System.out.println("\t\t Escoja el auto que desea vender\n");
        System.out.println("\t\t 1. Chevrolet DMAX");
        System.out.println("\t\t 2. Chevrolet SAIL");
        System.out.println("\t\t 3. Chevrolet SPARK");
        System.out.println("\t\t Ingrese la opción: ");
        Scanner s = new Scanner(System.in);
        op = s.nextInt();
        switch(op){
            case 1:
                System.out.println("Se ha preparado una Chevrolet DMAX para la venta: \nDescripción:");
                System.out.println(listVehiculos.get(op-1));
                break;
            case 2:
                System.out.println("Se ha preparado un Chevrolet SAIL para la venta: \nDescripción:");
                System.out.println(listVehiculos.get(op-1));
                break;
            case 3:
                System.out.println("Se ha preparado un Chevrolet SPARK para la venta: \nDescripción:");
                System.out.println(listVehiculos.get(op-1));
                break;
        }
    }
    
}
