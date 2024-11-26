/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author VEL-ANDRES
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Variables iniciales
        int numero = 2; // Primer número de la serie
        int incremento = 4; // Incremento inicial
        int contador = 1; // Contador para controlar los términos
        int limite = 10; // Número de términos deseados

        // Imprimir la serie
        System.out.println("Serie generada:");

        while (contador <= limite) {
            // Imprimir el número actual
            System.out.println(numero);

            numero += incremento;
            incremento += 2;

            // Aumentar el contador
            contador++;
        }
    }
}
