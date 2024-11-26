/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author VEL-ANDRES
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          // Configuración inicial
        double resultado = 0;  // Acumulador para el resultado de la serie
        int contador = 1;      // Contador para los denominadores de la serie
        int signo = 1;         // Variable para alternar los signos de la serie (+ y -)
        
        // String para construir la representación de la serie
        String serie = "";

        // Ciclo para generar la serie
        while (contador <= 15) {
            // Cálculo del término actual
            double termino = signo * (1.0 / contador);
            resultado += termino;

            
            if (contador == 1) {
                serie = "1";  // Primer término
             }else{
                if (signo == 1) {
                    serie += String.format(" + 1/%d", contador);
                }else{
                    serie += String.format(" - 1/%d", contador);
                }
            }


            signo *= -1;


            contador += 2;
        }

        // Mostrar la serie y el resultado
        System.out.println("Serie generada:");
        System.out.println(serie);
        System.out.printf(Locale.US, "\nResultado de la serie: %.5f\n", resultado);
    }
}

