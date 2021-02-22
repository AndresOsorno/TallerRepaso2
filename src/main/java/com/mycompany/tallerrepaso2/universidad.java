package com.mycompany.tallerrepaso2;

//Trabajo realizado por Mateo Cardenas Osorio && Andres Camilo Osorno Zapata

import javax.swing.JOptionPane;

public class universidad {
    private String nombre;
    private String direccion;
    private String telefono;
    private String extension;
    private String tipo;
    private facultad[] Facultad= new facultad[3]; 

    public universidad() {
        this.nombre =JOptionPane.showInputDialog(null,"Digita el nombre de la universidad: ");
        this.direccion = JOptionPane.showInputDialog(null,"Cual es la dirección de la universidad: ");
        this.telefono = JOptionPane.showInputDialog(null,"Digita el numero telefonico de la universidad: ");
        this.extension = JOptionPane.showInputDialog(null,"Que extensión posee la universidad (km2): ");
        this.tipo = JOptionPane.showInputDialog(null,"La universidad es Publica o Privada: ");
        for(int i=0;i<Facultad.length;i++){
        
         this.Facultad[i] = new facultad();
        }
     }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public facultad[] getFacultad() {
        return Facultad;
    }

    public void setFacultad(facultad[] Facultad) {
        this.Facultad = Facultad;
    }

  
    public void devolverFacultades(){
    
        System.out.println("La cantidad de facultades que posee "+getNombre()+" es de: "+ Facultad.length);
    
    
    }
    
    
}
