package Code;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class Usuario {
    private String  nombre_user;
    private char    genero;
    private String  username;
    private String  contrasena;
    private String  fecha;
    private int     edad;
    private boolean estado; 

    
    public Usuario(String nombre_user, char genero, String username, String contrasena, String fecha, int edad, boolean estado){
        this.nombre_user= nombre_user;
        this.genero=genero;
        this.username=username;
        this.contrasena=contrasena;
        this.fecha=fecha;
        this.edad=edad;
        this.estado=estado;
    }

  
    
    public String getNombre_user(){
    return nombre_user;
    }
    public void setNombre_user(String nombre_user){
    this.nombre_user=nombre_user;    
    }
    
    public char getGenero(){
        return genero;
    }
    public void setGenero(char genero){
        this.genero=genero;
    }
    
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    
    public String getContrasena(){
        return contrasena;
    }
    public void setContrasena(String contrasena){
        this.contrasena=contrasena;
    }
    
    public void setFecha(String fecha){
        this.fecha=fecha;
    }
    public String getFecha(){
        return fecha;
    }
    
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public boolean getEstado(){
        return estado;
    }
    public void setEstado(boolean estado){
        this.estado=estado;
    }  
}


