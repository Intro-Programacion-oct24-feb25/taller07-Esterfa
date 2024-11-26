/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author VEL-ANDRES
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          // Variables iniciales
        int numero = 2; 
        int incremento = 3; 
        int contador = 1; 
        int limite = 6; 
        System.out.println("Serie generada:");

        while (contador <= limite) {
            // Imprimir el número actual
            System.out.println(numero);
            numero += incremento;
            incremento += 2;
            contador++;
        }
    }
}

        
