package com.mycompany.pr4;
/**
 * 
 * @author christian osorio 
 */

public class triangulo {
    private float cateto1;
    private float cateto2;
    private float angulo1;
    private float angulo2;
    private float hipotenusa;

    public triangulo() {
    }
    
   /**
    * 
    * @param cateto1 cateto a de tipo real
    * @param cateto2 cateto b de tipo real
    */
    public triangulo(float cateto1, float cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        hipotenusa();
        angulos();
    }
   /**  
    * 
    * @return 
    */
    public float getCateto1() {
        return cateto1;
    }

    /** 
     * 
     * @param cateto1 
     */
    public void setCateto1(float cateto1) {
        this.cateto1 = cateto1;
    }

    /** 
     * 
     * @return 
     */
    public float getCateto2() {
        return cateto2;
    }

    /** 
     * 
     * @param cateto2 
     */
    public void setCateto2(float cateto2) {
        this.cateto2 = cateto2;
    }

    /** 
     * 
     * @return 
     */
    public float getAngulo1() {
        return angulo1;
    }

    /** 
     * 
     * @param angulo1 
     */
    public void setAngulo1(float angulo1) {
        this.angulo1 = angulo1;
    }

    /** 
     * 
     * @return 
     */
    public float getAngulo2() {
        return angulo2;
    }

    /** 
     * 
     * @param angulo2 
     */
    public void setAngulo2(float angulo2) {
        this.angulo2 = angulo2;
    }

    /** 
     * 
     * @return 
     */
    public float getHipotenusa() {
        return hipotenusa;
    }

    /** 
     * 
     * @param hipotenusa 
     */
    public void setHipotenusa(float hipotenusa) {
        this.hipotenusa = hipotenusa;
    }

    /** 
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "triangulo{" + "cateto1=" + cateto1 + ", cateto2=" +
                cateto2 + ", angulo1=" + angulo1 + ", angulo2=" + angulo2 +
                ", hipotenusa=" + hipotenusa + '}';
    }
    
    /** 
     * 
     */
    private void hipotenusa(){
        this.hipotenusa=(float) Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2,2));
    }

    /** 
     * 
     */
    private void angulos(){
         this.angulo1= (float)Math.toDegrees(Math.atan(cateto2/cateto1));
         
         this.angulo2= 180-90-angulo1;
    }

    /** 
     * 
     * @return 
     */
    public float area(){
        return cateto1*cateto2/2;
    }
    
    /** 
     * 
     * @return 
     */
    public float perimetro(){
        return cateto1+cateto2+hipotenusa;
    }

}
