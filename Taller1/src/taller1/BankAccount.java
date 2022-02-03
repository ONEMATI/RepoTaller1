/*
 Clase Cuenta Bancaria con Atributos y Metodos
 */
package taller1;

/**
 *
 * @author MatisVeraLima
 */
public class BankAccount {
    private int accountNumber;
   protected Boolean activated;
/*
Metodos de la Clase Cuenta Bancaria -get-and-set-
*/
    public Boolean getActivated() {
        return this.activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "accountNumber=" + accountNumber + ", activated=" + activated + '}';
    }

}
