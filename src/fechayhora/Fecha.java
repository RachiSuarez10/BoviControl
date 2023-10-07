/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fechayhora;

import java.util.Calendar;

/**
 *
 * @author suare
 */
public class Fecha {

    private int dia, mes, anio;
     String mesLetra;

    static Calendar Fecha = Calendar.getInstance();

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public String convertirMesenLetras() {
       
        switch (mes + 1) {
            case 1:
                mesLetra = "Enero";
                break;
            case 2:
                mesLetra = "Febrero";
                break;
            case 3:
                mesLetra = "Marzo";
                break;
            case 4:
                mesLetra = "Abril";
                break;
            case 5:
                mesLetra = "Mayo";
                break;
            case 6:
                mesLetra = "junio";
                break;
            case 7:
                mesLetra = "Julio";
                break;
            case 8:
                mesLetra = "Agosto";
            case 9:
                mesLetra = "Septiembre";
                break;
            case 10:
                mesLetra = "Octubre";
                break;
            case 11:
                mesLetra = "Noviembre";
                break;
            case 12:
                mesLetra = "Diciembre";
                break;
            default:
                mesLetra = "nada chavo";
                break;
        }
        return mesLetra;
    }

    public String imprimirFecha() {
        convertirMesenLetras();
        String impFecha;
        return impFecha = "Hoy es " + dia + " " + mesLetra + " " + anio;
    }

}
