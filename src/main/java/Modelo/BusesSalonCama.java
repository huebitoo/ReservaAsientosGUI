package Modelo;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BusesSalonCama extends Buses{

    public BusesSalonCama(){

    }

    public String tipoAsientos(){
        return "Salon Cama";
    }

    public int cantidadAsientos(){
        return 30;
    }

    @Override
    public JButton botonAsiento(int pos_x, int pos_y, int numero) {
        JButton boton = new JButton();
        boton.setFont(new Font("Arial", Font.PLAIN, 4));
        boton.setFocusable(false);
        boton.setBackground(Color.gray);
        boton.setForeground(Color.white);
        boton.setBounds(pos_x, pos_y, 35, 35);
        boton.setToolTipText("" + numero);
        boton.setText("");
        return boton;
    }
}
