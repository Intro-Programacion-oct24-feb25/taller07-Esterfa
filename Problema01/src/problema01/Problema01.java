/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

/**
 *
 * @author VEL-ANDRES
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaReporte = "";
        String nombreJugador;
        String posicionCampo;

        int edad;
        boolean bandera = true;
        String salir;
        // variable acumuladoras
        int sumaEdades = 0;

        // contador para saber el número de iteraciones
        int contadorIteraciones = 0;
        // variables para promedio
        double promedioEdad;
        double promedioEstatura;
        cadenaReporte = String.format("%s%s\n", cadenaReporte,
                "Listado de Jugadores");

        while(bandera){
            System.out.println("Ingrese el nombre del Jugador: ");
            nombreJugador = entrada.nextLine();

            // agrego una iteración
            contadorIteraciones = contadorIteraciones + 1; // primera(0+1=1)

            // Ejmplo 1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
            cadenaReporte = String.format("%s%d.) %s\n",
                    cadenaReporte,
                    contadorIteraciones,
                    nombreJugador,
                    );

            // entrada.nextLine(); //
            System.out.println("Desea salir del ciclo; digite: si");
            salir = entrada.nextLine();
            if(salir.equals("si")){
                bandera = false;
            }
        }


        // presentación de cadena final
        System.out.printf("%s\n", cadenaReporte);

    }
}
        
        
        
        
        
    