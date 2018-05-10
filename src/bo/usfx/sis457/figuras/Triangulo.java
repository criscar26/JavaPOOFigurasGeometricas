/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.figuras;

/**
 *
 * @author POWER PC
 */
public class Triangulo {
        private float Base;
        private float Altura;
        
    
    /**
     * Método constructor, crea el Triangulo con valores por defecto
     */
    public Triangulo() {
        this.Base = 0;
        this.Altura = 0;
    }
    
   
    public Triangulo (float Base, float Altura) {
        this.Base = Base;
        this.Altura = Altura;
    }

    public void setBase(float Base) {
        this.Base = Base;
    }

    public void setAltura(float Altura) {
        this.Altura = Altura;
    }

    
    
    /**
     * Método que retorna el area del Triangulo
     * @return Retorna el valor del Area de tipo double
     */
    public double getArea() {
        return this.Base*this.Altura/2;
    }
    
    /**
     * Método que retorna el perimetro del Triangulo
     * @return Retorna el valor del Perímetro de tipo double
     */
    public double getPerimetro() {
        double hipotenusa=Math.sqrt(this.Altura*this.Altura+this.Base*this.Base);
        return (hipotenusa+this.Altura+this.Base);
    }
}
