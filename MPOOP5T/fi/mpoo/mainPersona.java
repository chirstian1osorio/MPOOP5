package com.mycompany.pr4;

public class mainPersona {
    public static void main(String[] args) {
        /** 
         * 
         */
        persona amigo= new persona();
        System.out.println("info amigo "+amigo.toString());
        amigo.setNombre("juan");
        amigo.setApellido("ramirez");
        amigo.setfNacimiento(new Fecha(29,1,2000));
        
        System.out.println("onfo amigo"+amigo.toString());
        System.out.println("info amigo "+amigo);
        
        System.out.println("----------------------------");
        persona persona=new persona("jose"," rodrgiguez",4,8,1990);
         System.out.println("info persona "+persona);
        
    }

}
