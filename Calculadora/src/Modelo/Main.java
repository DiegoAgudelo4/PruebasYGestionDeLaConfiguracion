
package Modelo;

import java.text.ParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Main {

    public static void main(String[] args) {

        double a = 0, b = 0;
        int  opc = 0;
        String menu = "******* menu******\n"
                + "1. sumar\n"
                + "2. restar\n"
                + "3. Dividir\n"
                + "4. Multiplicar\n";
        opc= Integer.parseInt(JOptionPane.showInputDialog(menu));
        a =Double.parseDouble((JOptionPane.showInputDialog(null,"Ingrese numero 1")));
        b =Double.parseDouble((JOptionPane.showInputDialog(null,"Ingrese numero 2")));
        Operaciones operacion= new Operaciones();
        switch (opc) {
               case 1:
                  JOptionPane.showMessageDialog(null,operacion.suma(a, b));
                break;
            case 2:
                  JOptionPane.showMessageDialog(null,operacion.resta(a, b));
                break;
            case 3:
                  JOptionPane.showMessageDialog(null,operacion.division(a, b));
                break;
            case 4:
                  JOptionPane.showMessageDialog(null,operacion.multiplicacion(a, b));
                break;
            case 5: 
                a=0;
                b=0;
                break; 
            default:
                System.exit(0);
        }
    }

}
