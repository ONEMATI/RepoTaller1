/*
 Clase House con Atributos y Metodos

 */
package taller1;

/**
 *
 * @author MatiasVeraLima
 */
public class House {
    public String typeOfHouse;
    public Float squareMeter;
    private int roms;
    public String address;
    public Boolean garden;
    protected Boolean typeOfSecurity;
    private int bathroom;
/*
Metodos de la Clase House -get-and-set-
*/
    public String getTypeOfHouse() {
        return typeOfHouse;
    }

    public void setTypeOfHouse(String typeOfHouse) {
        this.typeOfHouse = typeOfHouse;
    }

    @Override
    public String toString() {
        return "Casa{" + "typeOfHouse=" + typeOfHouse + ", squareMeter=" + squareMeter + ", roms=" + roms + ", address=" + address + ", garden=" + garden + ", typeOfSecurity=" + typeOfSecurity + ", bathroom=" + bathroom + '}';
    }
    
}
