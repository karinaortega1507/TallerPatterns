/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacional;

/**
 *
 * @author Josue
 */
public class Vehiculo {
    
    public String marca;
    public String modelo;
    public float motor;
    public float almacenamiento;
    public String carroceria;

    public Vehiculo(String marca, String modelo, float motor, float almacenamiento, String carroceria) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.almacenamiento = almacenamiento;
        this.carroceria = carroceria;
    }

    public Vehiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getMotor() {
        return motor;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }

    public float getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(float almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + ", almacenamiento=" + almacenamiento + ", carroceria=" + carroceria + '}';
    }
    
    
    
    
}
