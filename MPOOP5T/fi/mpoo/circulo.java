package com.mycompany.pr4;

public class circulo {
    
    /** 
     * 
     */
    static double PI=   Math.PI;
    private float radio;

    public circulo() {
    }
   
    /** 
     * 
     * @param radio 
     */
    public circulo(float radio){
        this.radio=radio;
    }

    
    /** 
     * 
     * @return 
     */
    public float getRadio() {
        return radio;
    }

    
    /** 
     * 
     * @param radio 
     */
    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    
    /** 
     * 
     * @return 
     */
    public String toString(){
        return "circulo{"+"radio= "+radio+"}";
    }
    
    
    /** 
     * 
     * @return 
     */
    public float perimetro(){
        return (float)(2*PI*radio);
    }
    
    /** 
     * 
     * @return 
     */
    public float area(){
        return (float)(PI*radio*radio);
    }

}
