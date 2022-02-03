/*
Clase Persona con Atributos y Metodos
 */
package taller1;
/*
@import java.util.Date
*/
import java.util.Date;

/**
 *
 * @author MatiasVeraLima
 */
/*
Atributos de Clase Persona 
*/
public class Persona {
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public Float height;
    public Float weight;
   
/*
Metodos de la Clase Persona -get-and-set-
*/
public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", lastName2=" + lastName2 + ", dateBirth=" + dateBirth + ", height=" + height + ", weight=" + weight + '}';
    }

}
