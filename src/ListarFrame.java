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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Omar Romero
 */
public class ListarFrame extends JFrame{
    public ListarFrame(){
         setSize(400, 400);
        setResizable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPanel opciones = new JPanel(new GridBagLayout());
        GridBagConstraints grid = new GridBagConstraints();

        grid.gridx = 0;
        grid.gridy = GridBagConstraints.RELATIVE;
        
        
        JTextArea area=new JTextArea();
        area.setEditable(false);
        
        //poner una funcion que obtenga el texto que se necesita poner
        String text="";
        area.setText(text);
        
        JScrollPane scrollPane = new JScrollPane(area);
        JLabel datos= new JLabel("Planes agregados");
        
        //agregar funcion o algo para que lo que esta en " " sea el numero de planes de cada uno
        JLabel datosSam= new JLabel("Planes agregados");
        JLabel datosIpho= new JLabel("Planes agregados");
        opciones.add(datos,grid);
        opciones.add(area,grid);
        opciones.add(datosSam,grid);
        opciones.add(datosIpho,grid);
        JButton Volver = new JButton("Volver");
        opciones.add(Volver,grid);
        
        Volver.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                MenuFrame frame = new MenuFrame();
                frame.setVisible(true);
            }
            
            
            
        });
        
        add(opciones);
                setVisible(true);

    }
}
