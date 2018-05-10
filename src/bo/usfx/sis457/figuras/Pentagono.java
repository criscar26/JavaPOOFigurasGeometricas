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


public class Pentagono {
    private float Lado;

    public Pentagono(float Lado) {
        this.Lado = Lado;
    }
    
    public Pentagono(){
        this.Lado=0;
    }

    public void setLado(float Lado) {
        this.Lado = Lado;
    }
    
        /**
     * Método que retorna el area del Pentagono
     * @return Retorna el valor del Area de tipo double
     */
    public double getArea() {
        double apotema=this.Lado/(2*Math.tan(Math.toRadians(36)));
        return (apotema*this.Lado*5)/2;
    }
    
    /**
     * Método que retorna el perimetro del Pentagono
     * @return Retorna el valor del Perímetro de tipo double
     */
    public double getPerimetro() {
        return 5*this.Lado;
    }
}
