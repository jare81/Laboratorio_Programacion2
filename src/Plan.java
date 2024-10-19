/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public abstract class  Plan {
    private String nombreClien;
    private int numeroTel;

    public Plan(String nombre_c, int numero_tel) {
        this.nombreClien = nombre_c;
        this.numeroTel = numero_tel;
    }
    
    

    public String getNombre_c() {
        return nombreClien;
    }

    public void setNombre(String nombre_c) {
        this.nombreClien = nombre_c;
    }

    public int getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(int numero_tel) {
        this.numeroTel = numero_tel;
    }
    
    public abstract double pagoMensual(int mins, int msgs);
    
    public String imprimir(){
        return "\nNombre Cliente: " + nombreClien + "\nNumero Telefono: " + numeroTel  ;
    }
    
}
