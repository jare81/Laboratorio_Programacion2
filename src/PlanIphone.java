/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class PlanIphone extends Plan {
    private String email;
    
    
    public PlanIphone(String email, String nombreClien, int numeroTel) {
        super(nombreClien, numeroTel);
        this.email=email;
        
    }
    
    public double pagoMensual(int mins, int msgs){
        return 22 + (mins * 0.4) +(msgs*0.1);
    }
    
    public String imprimir(){
        return super.imprimir() + "Email " + email;
    }

    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email){
       this.email=email;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
