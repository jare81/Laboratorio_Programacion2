/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Omar Romero
 */
public class SamsungFrame extends JFrame{
    private Tigo tigo;
    
    public SamsungFrame(Tigo tigo){
        this.tigo=tigo;
        setSize(400, 400);
        setResizable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPanel opciones = new JPanel(new GridBagLayout());
        GridBagConstraints grid = new GridBagConstraints();

        grid.gridx = 0;
        grid.gridy = GridBagConstraints.RELATIVE;
        
        
        JTextField name=new JTextField();
        name.setPreferredSize(new Dimension(200, 30));
        JTextField numerotelefono=new JTextField();
        numerotelefono.setPreferredSize(new Dimension(200, 30));
        
        JTextField pin=new JTextField();
        pin.setPreferredSize(new Dimension(200, 30));
        
        JLabel namet=new JLabel("Nombre");
        JLabel numt=new JLabel("Numero de Telefono");
        JLabel pint=new JLabel("Pin");
        
        JButton Crear = new JButton("Crear");
        JButton Volver = new JButton("Volver");
        
        opciones.add(namet, grid);
        opciones.add(name, grid);
        opciones.add(numt, grid);
        opciones.add(numerotelefono, grid);
        opciones.add(pint, grid);
        opciones.add(pin, grid);
        
        opciones.add(Crear, grid);
        opciones.add(Volver, grid);

        add(opciones);
        setVisible(true);
        
        Volver.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                AgregarPlanFrame frame = new AgregarPlanFrame(tigo);
                frame.setVisible(true);
            }
            
            
            
        });
        
        //aca para crear plan samsung
        Crear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
              String nombre = name.getText(); 
                String numero = numerotelefono.getText(); 
                String pinText = pin.getText(); 

                if (!nombre.isEmpty() && !numero.isEmpty() && !pinText.isEmpty()) {
                    try {
                        tigo.agregarPlan(Integer.parseInt(numero), nombre, pinText, "SAMSUNG");
                        
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número de teléfono válido.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
                }
            }
            
            
            
        });
        
    }

}
