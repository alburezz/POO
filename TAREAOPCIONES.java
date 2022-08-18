/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaopciones;

import java.util.Scanner;

/**
 *
 * @author Computadora
 */
public class TAREAOPCIONES {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
       public static void main (String [] args) { 
        Scanner  tec= new Scanner (System.in);
        int Opcion=0;
        boolean condicion=true;
        int CantPersonas=0;
        String Nombres [] = new String [CantPersonas];
        String Apellidos [] = new String [CantPersonas];
        int DPI [] = new int [CantPersonas];
        int NIT [] = new int [CantPersonas];
        while(condicion) {
        System.out.println("----------MENU----------");
        System.out.println("[1] INGRESAR PERSONAS");
        System.out.println("[2] MOSTRAR PERSONAS");
        System.out.println("[0] Salir");
        System.out.println("------------------------");
        System.out.println("Opción: ");
        Opcion= tec.nextInt();
        switch (Opcion){
        case 1:
        System.out.println("----OPCION 1----");
        System.out.println("INGRESE EL NUMERO DE PERSONAS A REGISTRAR");
        CantPersonas = tec.nextInt();
        tec.nextLine();
     
        Nombres = new String [CantPersonas];
        Apellidos  = new String [CantPersonas];
         DPI= new int [CantPersonas];
        NIT  = new int [CantPersonas];
        
        for (int i=0; i<CantPersonas; i++){
        System.out.println("-> Persona "+ (i+1));
        System.out.println("Nombre: ");
        Nombres[i] = tec.nextLine();
         tec.nextLine();
        System.out.println("Apellidos: ");
        Apellidos[i] = tec.nextLine();
        System.out.println("DPI: ");
        DPI[i] = tec.nextInt();
        System.out.println("NIT: ");
        NIT[i] = tec.nextInt();
        }
        break;
        case 2:
        System.out.println("----OPCION 2----");
        for (int i=0; i<CantPersonas; i++){
        System.out.println("-> Persona "+ (i+1));
        System.out.println("Nombres: "+ Nombres[i]);
        System.out.println("Apellidos: "+ Apellidos[i]);
        System.out.println("DPI: "+ DPI[i]);
        System.out.println("NIT: "+ NIT[i]);
        }
        break;
        case 0:
         condicion=false;
            System.out.println("Saliste");
        break;
        default:
        System.out.println("Opcion no encontrada");
    }
  }       
  }

