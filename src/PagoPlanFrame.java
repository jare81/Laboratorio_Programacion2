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
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Omar Romero
 */
public class PagoPlanFrame extends JFrame{
    public PagoPlanFrame(){
        setSize(400, 400);
        setResizable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPanel opciones = new JPanel(new GridBagLayout());
        GridBagConstraints grid = new GridBagConstraints();

        grid.gridx = 0;
        grid.gridy = GridBagConstraints.RELATIVE;
        JTextField numerotelefono=new JTextField();
        numerotelefono.setPreferredSize(new Dimension(200, 30));
        
        JLabel numerot=new JLabel("Que numero deseas pagar");
        
        JButton Crear = new JButton("Pagar");
        JButton Volver = new JButton("Volver");
        
        opciones.add(numerot, grid);
        opciones.add(numerotelefono, grid);
        opciones.add(Crear, grid);
        opciones.add(Volver, grid);

        add(opciones);
        setVisible(true);
        
        Volver.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                MenuFrame frame = new MenuFrame();
                frame.setVisible(true);
            }
            
            
            
        });
        
      
        Crear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                //codigo para agregar amigo
                
                
                
            }
            
            
            
        });
        setVisible(true);
    }
}
