package com.mycompany.tallerrepaso2;

//Trabajo realizado por Mateo Cardenas Osorio && Andres Camilo Osorno Zapata

public class Simulador {

    public static void main(String[] args) {
      universidad Uni=new universidad();
      for(int i=0;i<1;i++){
      Uni.getFacultad()[i].getEscuela()[i].devolverProfesores();
      Uni.getFacultad()[i].devolverEscuelas();
      Uni.devolverFacultades();
        }
    
    }
    
}
