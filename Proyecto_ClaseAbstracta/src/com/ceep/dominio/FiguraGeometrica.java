
package com.ceep.dominio;




public abstract class FiguraGeometrica {   //CLASE ABSTRACTA PORQUE TIENE AL MENOS UN MÉTODO ABSTRACTO
    //NO SE PUEDEN CREAR OBJETOS DE UNA CLASE ABSTRACTA
    private String tipoFigura;

    public FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    
    public abstract void dibujar();

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
        
    
    
}
