package com.mycompany.pr4;

public class persona {
    private String nombre;
    private String apellido;
    private Fecha fNacimiento;

    
    /** 
     * 
     */
    public persona() {
        
    }

    
    /** 
     * 
     * @param nombre
     * @param apellido
     * @param fNacimiento 
     */
    public persona(String nombre, String apellido, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
    }

    
    /** 
     * 
     * @param nombre
     * @param apellido
     * @param dia
     * @param mes
     * @param anio 
     */
    public persona(String nombre, String apellido,int dia, int mes, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento=new Fecha(dia,mes,anio);
    }
    
    
    /** 
     * 
     * @return 
     */

    public String getNombre() {
        return nombre;
    }

    
    /** 
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /** 
     * 
     * @return 
     */
    public String getApellido() {
        return apellido;
    }

    
    /** 
     * 
     * @param apellido 
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    /** 
     * 
     * @return 
     */
    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    /** 
     * 
     * @param fNacimiento 
     */
    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    /** 
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre +
                ", apellido=" + apellido + ", fNacimiento=" + 
                fNacimiento + '}';
    }
    
    
    
   
}
