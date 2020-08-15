/*
*Implemente un algorítmo que le permita 
 */
package tarea2polimorfismo;


/**
 *
 * @author Lenin Alexander Carrillo Imbaquingo
 */

class AumentoVoltaje{

    int DeterminarAumento (int num1, int num2, int num3, int num4){
    return num1+num2+num3;
    }
    double DeterminarAumento (double num1, double num2, double num3, double num4){
    return num1+num2+num3;
    }
}
public class Tarea2polimorfismo {
    public static void main(String[] args) {
                                 System.out.println("       UNIVERDIDAD DE LAS FUERZAS ARMADAS ");
        System.out.println("                ESPE-L            ");
        System.out.println("             PROGRAMACION");
        System.out.println("ALUMNO: LENIN ALEXANDER CARRILLO IMBAQUINGO ");
        System.out.println("DOCENTE: ING LUIS GUERRA");
        System.out.println("FECHA: 14/08/2020");
    
        AumentoVoltaje Objeto1=new AumentoVoltaje();
        AumentoVoltaje Objeto2=new AumentoVoltaje();
        AumentoVoltaje Objeto3=new AumentoVoltaje();
        AumentoVoltaje Objeto4=new AumentoVoltaje();
        
        
        int resultado1;
        Objeto1.DeterminarAumento(89, 47,18,74);
        resultado1=Objeto1.DeterminarAumento(89, 47, 18, 74);
        System.out.println("\n El Aumento de Voltaje es : "+resultado1);
        
        double resultado2;
        Objeto2.DeterminarAumento(9, 45, 5, 6);
        resultado2=Objeto2.DeterminarAumento(9, 45.26, 5, 6);
        System.out.println("El Aumento de Voltaje es : "+resultado2);
        
        int resultado3;
        Objeto3.DeterminarAumento(8, 21, 17, 3);
        resultado3=Objeto3.DeterminarAumento(8, 21, 17, 3);
        System.out.println("El Aumento de Voltaje es : "+resultado3);
        
        double resultado4;
        Objeto4.DeterminarAumento(23, 50, 47, 7);
        resultado4=Objeto4.DeterminarAumento(23.5 , 50,47, 7);
        System.out.println("El Aumento de Voltaje es : "+resultado4);
    }
    
}