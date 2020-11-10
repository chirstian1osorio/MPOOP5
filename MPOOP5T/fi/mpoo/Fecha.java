package com.mycompany.pr4;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    
    public Fecha(){
        
    }

    /** 
     * 
     * @param dia
     * @param mes
     * @param anio 
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    /** 
     * 
     * @return 
     */
    public int getDia() {
        return dia;
    }

    /** 
     * 
     * @param dia 
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /** 
     * 
     * @return 
     */
    public int getMes() {
        return mes;
    }

    /** 
     * 
     * @param mes 
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /** 
     * 
     * @return 
     */
    public int getAnio() {
        return anio;
    }

    /** 
     * 
     * @param anio 
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /** 
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
    
    

}
