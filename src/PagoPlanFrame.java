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
public class PagoPlanFrame extends JFrame{
    private Tigo tigo;
    public PagoPlanFrame(Tigo tigo){
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
        
        JTextField min=new JTextField();
        min.setPreferredSize(new Dimension(200, 30));
        
        JTextField msg=new JTextField();
        msg.setPreferredSize(new Dimension(200, 30));
        
        JLabel numerot=new JLabel("Que numero deseas pagar");
        JLabel mint=new JLabel("Cuantos minutos de llamada pagas?");
        JLabel msgT=new JLabel("Cuantos mensajes pagas?");
        
        JButton Crear = new JButton("Pagar");
        JButton Volver = new JButton("Volver");
        
        opciones.add(numerot, grid);
        opciones.add(numerotelefono, grid);
        opciones.add(mint, grid);
        opciones.add(min, grid);
        opciones.add(msgT, grid);
        opciones.add(msg, grid);
        
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
               String num = numerotelefono.getText();
               String mins = min.getText();
               String mens = msg.getText();
                
                double pago = tigo.pagoPlan(Integer.parseInt(num), Integer.parseInt(mins), Integer.parseInt(mens));
               
                JOptionPane.showMessageDialog(null, "Tu cobro total es de: " + pago);
                
                
                
            }
            
            
            
        });
        setVisible(true);
    }
}
