/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 * Angel Córdova 14:35 25-11-2016
 */
public class operaciones {
    public int lim;

    public operaciones(int lim) {
        this.lim = lim;
    }

    

    public int getLim() {
        return lim;
    }

    public void setLim(int lim) {
        this.lim = lim;
    }
    
    public void piramide(){
        String salida = "";
        int num = 0;
        for( int i=1; i<=lim; i++){
            for(int j=1; j<=i; j++){
                num += 1;
                salida = salida + " " + num;
            }
            salida = salida + "\n";
        }
        JOptionPane.showMessageDialog(null, salida);
    }
}
