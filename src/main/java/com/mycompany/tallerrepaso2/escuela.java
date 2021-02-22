package com.mycompany.tallerrepaso2;

//Trabajo realizado por Mateo Cardenas Osorio && Andres Camilo Osorno Zapata

import javax.swing.JOptionPane;

public class escuela {
    private String nombre;
    private String telefono;
    private String oficina;
    private String director;
    private profesor[] profesor=new profesor[3];

    public escuela() {
        this.nombre = JOptionPane.showInputDialog(null,"Digita el nombre de la escuela ");
        this.telefono = JOptionPane.showInputDialog(null,"Cual es el numero telefonico de la escuela: ");
        this.oficina = JOptionPane.showInputDialog(null,"Digita el numero de oficina");
        this.director = JOptionPane.showInputDialog(null,"Cual es el nombre del director de "+ getNombre());
        for(int i=0;i<profesor.length;i++){
        this.profesor[i] =new profesor();
        
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nommbre) {
        this.nombre = nommbre;
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public profesor[] getProfesor() {
        return profesor;
    }

    public void setProfesor(profesor[] profesor) {
        this.profesor = profesor;
    }

 
    public void devolverProfesores(){
    
        System.out.println("La cantidad de profesores es de: "+profesor.length);
    
    
    }
    
            
}
