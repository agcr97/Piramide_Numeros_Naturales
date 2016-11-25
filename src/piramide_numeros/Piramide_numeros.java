/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramide_numeros;

import javax.swing.JOptionPane;
import modelo.operaciones;

/**
 *
 * @author lenovo
 * Angel Córdova 14:35 25-11-2016
 */
public class Piramide_numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lim;
        lim = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un limite"));
        operaciones objeto1 = new operaciones(lim);
        objeto1.piramide();
    }
    
}
