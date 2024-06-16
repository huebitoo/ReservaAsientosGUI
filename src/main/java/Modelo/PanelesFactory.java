package Modelo;

import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
import java.util.ArrayList;

public class PanelesFactory {

    private ArrayList<JPanel> paneles;
    private int incremento_y = 0;

    public ArrayList<JPanel> crearPaneles(ArrayList<Buses> array_bus, int precio_ruta){
        paneles = new ArrayList<JPanel>();
        for(Buses bus : array_bus){
            JPanel panel_bus1 = new JPanel();
            panel_bus1.setLayout(null);
            panel_bus1.setBackground(Color.PINK);
            panel_bus1.setPreferredSize(new Dimension(550, 0));
            panel_bus1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            // panel_bus1.setBounds(0,0, 550, 100 + incremento_y);

            LocalTime hora = bus.getHora_partida();
            JLabel label_hora = new JLabel(hora.toString());
            label_hora.setFont(new Font("Arial", Font.PLAIN, 16));
            label_hora.setBounds(10,10, 100,40);
            panel_bus1.add(label_hora);

            JLabel label_tipo = new JLabel(bus.getTipoBus());
            label_tipo.setFont(new Font("Arial", Font.PLAIN, 16));
            panel_bus1.add(label_tipo);
            label_tipo.setBounds(10, 50, 120,40);

            JLabel label_precio = new JLabel("" + precio_ruta);
            label_precio.setFont(new Font("Arial", Font.PLAIN, 16));
            panel_bus1.add(label_precio);
            label_precio.setBounds(490, 10, 100, 40);


            paneles.add(panel_bus1);
            incremento_y += 100;
        }


        return paneles;
    }

}
