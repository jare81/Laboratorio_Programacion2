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
public class AmigoFrame extends JFrame{
    private Tigo tigo;
    public AmigoFrame(Tigo tigo){
        this.tigo=tigo;
        setSize(400, 400);
        setResizable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPanel opciones = new JPanel(new GridBagLayout());
        GridBagConstraints grid = new GridBagConstraints();

        grid.gridx = 0;
        grid.gridy = GridBagConstraints.RELATIVE;
        JTextField numerotelefono=new JTextField();
        numerotelefono.setPreferredSize(new Dimension(200, 30));
        
        JTextField pinT=new JTextField();
        pinT.setPreferredSize(new Dimension(200, 30));
        
        JLabel numerot=new JLabel("Que numero deseas agregar como amigo?");
        JLabel pint=new JLabel("Cual es el pin?");
        
        JButton Crear = new JButton("Agregar");
        JButton Volver = new JButton("Volver");
        
        opciones.add(numerot, grid);
        opciones.add(numerotelefono, grid);
        opciones.add(pint, grid);
        opciones.add(pinT, grid);
        
        opciones.add(Crear, grid);
        opciones.add(Volver, grid);

        add(opciones);
        setVisible(true);
        
        Volver.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                MenuFrame frame = new MenuFrame(tigo);
                frame.setVisible(true);
            }
            
            
            
        });
        
      
        Crear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                String pin =pinT.getText();
                String tel =numerotelefono.getText();
                
                tigo.agregarAmigo(Integer.parseInt(tel), pin);
                
                
            }
            
            
            
        });
                setVisible(true);

    }
    }
