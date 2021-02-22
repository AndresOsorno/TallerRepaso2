package com.mycompany.tallerrepaso2;

//Trabajo realizado por Mateo Cardenas Osorio && Andres Camilo Osorno Zapata

import javax.swing.JOptionPane;

public class profesor {
    private String nombre;
    private String CorreoElectronico;

    public profesor() {
        this.nombre = JOptionPane.showInputDialog(null,"Por favor digita el nombre del profesor");
        this.CorreoElectronico =  JOptionPane.showInputDialog(null,"Digita el correo electronico de: "+getNombre());
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }
    
}
