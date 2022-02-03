/*
Clase Fruta 

 */
package taller1;

import java.util.ArrayList;

/**
 *
 * @author MatiasVeraLima
 */
/*
Atributos de Clase Fruta
 */
public class Fruta {

    public String name;
    private Float averageWeigth;
    public ArrayList<String> colors;

    /*
Metodos de la Clase Fruta -get-and-set-
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String name) {
        this.colors.add(name);
    }

    public ArrayList<String>
            getColors() {
        return this.colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "Fruta{" + "name=" + name + ", averageWeigth=" + averageWeigth + ", colors=" + colors + '}';
    }

}
