/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.array.primitivos;

/**
 *
 * @author renzo
 */
public class TestingArrays {

    public static void main(String[] args) {

        int[] enteros = new int[10];
        float[] flotantes = new float[5];
        int[] otrosEnteros = {8,11,2017};
        float j = 0;
        int k;

        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = i+1;
        }

        for (k = 0; k < flotantes.length; k++) {
            j += 0.1;
            flotantes[k] = (float) (j + 1);
        }
       
        for (int entero : enteros) {
            System.out.print(entero+",");
      }
        
        System.out.println("\n");
        
        for (float flotante : flotantes) {
            System.out.print(flotante+",");
        }
        
        System.out.println("\n");
        
        for (int otroEntero : otrosEnteros) {
            System.out.print(otroEntero+",");
        }
        
        System.out.println("\n");
    }

}
