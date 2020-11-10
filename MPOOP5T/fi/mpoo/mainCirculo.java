package com.mycompany.pr4;

public class mainCirculo {

    public static void main(String[] args) {
        circulo cir1= new circulo();
        //cir1.radio=4.5f;
        cir1.setRadio(3.4f);
        System.out.println("radio cir1= "+cir1.getRadio());
        
        circulo cir2=new circulo(6.0f);
        System.out.println("radio del cir2= "+cir2.getRadio());
        cir2.setRadio(9.0f);
        System.out.println("radio cir2= "+cir2.getRadio());
        
        System.out.println("perimetro cir1= "+cir1.perimetro());
        System.out.println("info de circulo 1 "+cir1.toString());
        
    }
}
