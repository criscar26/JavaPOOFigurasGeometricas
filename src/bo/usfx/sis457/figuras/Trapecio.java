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
public class Trapecio {
    private float BaseMen;
    private float Altura;
    private float BaseMay;
    private float Lado;

    public Trapecio(float BaseMen, float Altura, float BaseMay, float Lado) {
        this.BaseMen = BaseMen;
        this.Altura = Altura;
        this.BaseMay = BaseMay;
        this.Lado=Lado;
    }
    
        public Trapecio() {
        this.BaseMen = 0;
        this.Altura = 0;
        this.BaseMay = 0;
        this.Lado=0;
    }

    public void setLado(float Lado) {
        this.Lado = Lado;
    }

    public void setBaseMen(float BaseMen) {
        this.BaseMen = BaseMen;
    }

    public void setAltura(float Altura) {
        this.Altura = Altura;
    }

    public void setBaseMay(float BaseMay) {
        this.BaseMay = BaseMay;
    }
    
        
            /**
     * Método que retorna el area del Trapecio
     * @return Retorna el valor del Area de tipo double
     */
    public double getArea() {
            
        return ((this.BaseMay+this.BaseMen)*this.Altura)/2;
    }
    
    /**
     * Método que retorna el perimetro del Trapecio
     * @return Retorna el valor del Perímetro de tipo double
     */
    public double getPerimetro() {
        return 2*this.Lado+this.BaseMay+this.BaseMen;
    }
    
    
}
