/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.dominio;

/**
 *
 * @author Alumno Mañana
 */
public class Rectangulo extends FiguraGeometrica{  //HAY QUE IMPLEMENTAR TODOS LOS METODOS ABSTRACTOS DE LA CLASE PADRE
    
    
    public Rectangulo(String tipoFigura){
        super(tipoFigura);
    }
    
    @Override
    public void dibujar(){  //aqui se implementa el metodo abstracto de la clase padre
        System.out.println("Se imprime un: " + this.getClass().getSimpleName()); //imprime el nombre de la clase en la que me encuentro
    }
        
}
