/*
Clase Mascotas 
 */
package taller1;

/**
 *
 * @author MatiasVeraLima
 */
public class Pet {
    public String animal;
    public String name;
    private String sound;
    protected String breed;
/*
Metodos de la Clase Pet -get-and-set-
*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mascota{" + "animal=" + animal + ", name=" + name + ", sound=" + sound + ", breed=" + breed + '}';
    }
    
    
}
