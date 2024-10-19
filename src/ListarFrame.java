/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Omar Romero
 */
public class ListarFrame extends JFrame{
  private Tigo tigo;

    public ListarFrame(Tigo tigo) {
        this.tigo = tigo;
        setSize(400, 400);
        setResizable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPanel opciones = new JPanel(new GridBagLayout());
        GridBagConstraints grid = new GridBagConstraints();
        grid.gridx = 0;
        grid.gridy = GridBagConstraints.RELATIVE;

        // Crear JTextArea para mostrar la lista de planes
        JTextArea areaMensajes = new JTextArea(10, 30); // Ajusta el tamaño como prefieras
        areaMensajes.setEditable(false);
        areaMensajes.setLineWrap(true);
        areaMensajes.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(areaMensajes);

         
        areaMensajes.setText(tigo.lista());

        opciones.add(scrollPane, grid);

        
        JButton volver = new JButton("Volver");
        opciones.add(volver, grid);
        
        volver.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); 
                MenuFrame frame = new MenuFrame(tigo);  
                frame.setVisible(true);
            }
        });

        add(opciones);
        setVisible(true);
    }
    
}
