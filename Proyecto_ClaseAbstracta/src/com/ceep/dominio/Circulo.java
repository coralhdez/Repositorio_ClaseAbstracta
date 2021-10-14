
package com.ceep.dominio;


public class Circulo extends FiguraGeometrica {

    public Circulo(String tipoFigura){
        super(tipoFigura);
    }
    
    @Override
    public void dibujar(){ // instancio el método abstracto de la padre
        System.out.println("Esto es un: " + this.getClass().getSimpleName());
    } 

   
}
