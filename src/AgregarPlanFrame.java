/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Omar Romero
 */
public class AgregarPlanFrame extends JFrame {

    public AgregarPlanFrame() {
        setSize(400, 400);
        setResizable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPanel opciones = new JPanel(new GridBagLayout());
        GridBagConstraints grid = new GridBagConstraints();

        grid.gridx = 0;
        grid.gridy = GridBagConstraints.RELATIVE;

        JButton Iphone = new JButton("Plan Iphone");
        JButton Samsung = new JButton("Pago Samsung");
        JButton Volver = new JButton("Volver");
        opciones.add(Iphone, grid);
        opciones.add(Samsung, grid);
        opciones.add(Volver, grid);
        
        Volver.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                MenuFrame frame = new MenuFrame();
                frame.setVisible(true);
            }
            
            
            
        });
        
        Iphone.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                IphoneFrame frame = new IphoneFrame();
                frame.setVisible(true);
            }
            
            
            
        });
        
        Samsung.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                SamsungFrame frame = new SamsungFrame();
                frame.setVisible(true);
            }
            
            
            
        });

        add(opciones);
        setVisible(true);
    }

}
