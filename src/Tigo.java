
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
public class Tigo {
    
    public ArrayList<Plan>planes;

    public Tigo() {
         planes=new ArrayList<>();
    }
    
    public void agregarPlan(int numeroTel, String nombre, String extra, String tipo){
         for (Plan plann : planes) {
            if (plann.getNumeroTel() == numeroTel) {
                JOptionPane.showMessageDialog(null, "El número de teléfono ya está en uso.");
                return;
            }
        }

        if (tipo.equalsIgnoreCase("IPHONE")) {
            for (Plan plann : planes) {
                if (plann instanceof PlanIphone && ((PlanIphone) plann).getEmail().equals(extra)) {
                    JOptionPane.showMessageDialog(null, "El email ya está en uso.");
                    return;
                }
            }

            PlanIphone nuevoIphone = new PlanIphone(extra, nombre, numeroTel);
            nuevoIphone.setEmail(extra);  
            planes.add(nuevoIphone);
           JOptionPane.showMessageDialog(null, "Plan iPhone agregado exitosamente.");
            
        } else if (tipo.equalsIgnoreCase("SAMSUNG")) {
            for (Plan plann : planes) {
                if (plann instanceof PlanSamsung && ((PlanSamsung) plann).getPin().equals(extra)) {
                    JOptionPane.showMessageDialog(null, "El PIN ya está en uso.");
                    return;
                }
            }

            PlanSamsung nuevoSamsung = new PlanSamsung(extra, nombre, numeroTel);
            planes.add(nuevoSamsung);
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Tipo de plan no reconocido.");
        }
        
    }
    
    public boolean busqueda(int numeroTel, String datoExtra, String tipo){
        for (Plan plan : planes) {

            if (plan.getNumeroTel() == numeroTel) {
                return true;  
            }

            if (tipo.equalsIgnoreCase("SAMSUNG") && plan instanceof PlanSamsung) {
                PlanSamsung samsung = (PlanSamsung) plan;  
                if (samsung.getPin().equals(datoExtra)) {
                    return true; 
                }
            }

            if (tipo.equalsIgnoreCase("IPHONE") && plan instanceof PlanIphone) {
                PlanIphone iphone = (PlanIphone) plan; 
                if (iphone.getEmail().equals(datoExtra)) {
                    return true;  
                }
            }
    }

    return false;
}
    
    public double pagoPlan(int numeroTel, int mins, int msgs){
        for (Plan plan : planes) {

            if (plan.getNumeroTel() == numeroTel) {
                return plan.pagoMensual(mins, msgs);
            }
           
        }   
   
   return 0;
}
    
public void agregarAmigo(int numeroTel, String pin){
    for (Plan plan : planes) {

            if (plan.getNumeroTel() == numeroTel && plan instanceof PlanSamsung) {
                PlanSamsung samsung = (PlanSamsung) plan;  
                samsung.agregarPinAmigo(pin);
            }else{
                JOptionPane.showMessageDialog(null, "no se agrego");
            }
           
        }
}

public String lista(){
    int contSam=0;
    int contIph=0;
    
    StringBuilder sb = new StringBuilder();
    
    for (Plan plan : planes){
        
        sb.append(plan.imprimir()).append("\n");
        
        if(plan instanceof PlanSamsung){
            contSam++;
        }else if (plan instanceof PlanIphone){
            contIph++;
        }
    }
    
    sb.append("Planes Samsung: ").append(contSam).append("\n");
    sb.append("Planes Iphone: ").append(contIph).append("\n");
    
    return sb.toString();
    
}


}
    

