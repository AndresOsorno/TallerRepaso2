package com.mycompany.tallerrepaso2;
        
//Trabajo realizado por Mateo Cardenas Osorio && Andres Camilo Osorno Zapata

import javax.swing.JOptionPane;

public class facultad {
    private String nombre;
    private String telefono;
    private String oficina;
    private String decano;
    private escuela[] Escuela = new escuela[3];

    public facultad() {
        this.nombre = JOptionPane.showInputDialog(null,"Digita el nombre de la facultad: ");
        this.telefono = JOptionPane.showInputDialog(null,"Ingresa el numero telefonico de la facultad  ");
        this.oficina = JOptionPane.showInputDialog(null,"Digita el numero de oficina ");
        this.decano = JOptionPane.showInputDialog(null,"Ingresa el nombre del decano ");
        
        for(int i=0;i<Escuela.length;i++){
        this.Escuela[i] = new escuela();
        }
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public String getDecano() {
        return decano;
    }

    public void setDecano(String decano) {
        this.decano = decano;
    }

    public escuela[] getEscuela() {
        return Escuela;
    }

    public void setEscuela(escuela[] Escuela) {
        this.Escuela = Escuela;
    }

   
    
     public void devolverEscuelas(){
    
         System.out.println("Así mismo, la cantidad de escuelas es de: "+Escuela.length);
    
    
    }
    
    
}