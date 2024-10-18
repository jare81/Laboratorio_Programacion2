
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class PlanSamsung extends Plan {
    private String pin;
    private ArrayList<String>bbm;

    public PlanSamsung(String pin, String nombreClien, int numeroTel) {
        super(nombreClien, numeroTel);
        this.pin = pin;
        bbm=new ArrayList<>();
    }
    
    public double pagoMensual(int mins, int msgs){
       double pago=40;
       
        if (mins > 200) {
            pago += (mins - 200) * 0.8 ;  
        }
        
        if (msgs > 300) {
            pago +=  (msgs - 300) * 0.2; 
        }

    return pago;
       
    }
    
    public String imprimir(){
        return super.imprimir() + "Pin " + pin;
    }
    
     public void agregarPinAmigo(String pinAmigo) {
        if (!bbm.contains(pinAmigo)) {
            bbm.add(pinAmigo);
            JOptionPane.showMessageDialog(null, "El PIN " + pinAmigo + " ha sido agregado.");
        } else {
            JOptionPane.showMessageDialog(null, "El PIN " + pinAmigo + " ya está en la lista.");
        }
    }
     
     public String getPin(){
         return pin;
     }
    
    
}
