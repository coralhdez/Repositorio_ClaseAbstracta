package com.ceep.test;

import com.ceep.dominio.*;


public class Proyecto_ClaseAbstracta {

    public static void main(String[] args) {
        FiguraGeometrica figura1 = new Rectangulo("Rectángulo");
        figura1.dibujar();
        
        FiguraGeometrica figura2 = new Circulo("Círculo");
        figura2.dibujar();
    }
}
