/*
Clase Vehiculo con Atributos y Metodos 
 */
package taller1;

/**
 *
 * @author MatiasVeraLima
 */
public class Vehiculo {
    public String brand;
    public int model;
    private double litersOfGasoline;
    public int seats;
    protected Float loadCapacity;
/*
Metodos de la Clase Vehiculo -get-and-set-
*/
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "brand=" + brand + ", model=" + model + ", litersOfGasoline=" + litersOfGasoline + ", seats=" + seats + ", loadCapacity=" + loadCapacity + '}';
    }
    
}
