package programa;

import java.util.Scanner;
import modelos.Comparador;
import modelos.Pulgada;

/**
 *
 * @author Magh
 */
public class Principal {
    /**
     * @param args son los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // =====[ Ejercicio 01 ]=====
        System.out.println("\n=====[ Ejercicio 01 ]=====");
        System.out.print("Ingrese un valor en pulgadas: ");
        double pulgadas = teclado.nextDouble();
        // Instanciando
        System.out.println("-- Con Instancia --");
        Pulgada plg = new Pulgada(pulgadas);
        System.out.println(pulgadas + " pulgadas equivalen a:");
        System.out.println(String.format("%.8f", plg.convertir_a_pies()) + " pies");
        System.out.println(String.format("%.8f", plg.convertir_a_yardas()) + " yardas");
        System.out.println(String.format("%.8f", plg.convertir_a_metros()) + " metros");
        System.out.println(String.format("%.8f", plg.convertir_a_centimetros()) + " centimetros");
        // Sin instanciar
        System.out.println("-- Sin Instancia --");
        System.out.println(pulgadas + " pulgadas equivalen a:");
        System.out.println(String.format("%.8f", Pulgada.convertir_a_pies(pulgadas)) + " pies");
        System.out.println(String.format("%.8f", Pulgada.convertir_a_yardas(pulgadas)) + " yardas");
        System.out.println(String.format("%.8f", Pulgada.convertir_a_metros(pulgadas)) + " metros");
        System.out.println(String.format("%.8f", Pulgada.convertir_a_centimetros(pulgadas)) + " centimetros");
        
        // =====[ Ejercicio 02 ]=====
        System.out.println("\n=====[ Ejercicio 02 ]=====");
        System.out.print("Ingrese un par de números:\nnum1 = ");
        double n1 = teclado.nextDouble();
        System.out.print("num2 = ");
        double n2 = teclado.nextDouble();
        // Instanciando
        System.out.println("-- Con Instancia --");
        Comparador compara = new Comparador(n1, n2);
        System.out.println("Entre " + n1 + " y " + n2 + ":");
        System.out.println(compara.getMayor() + " es el mayor.");
        System.out.println(compara.getMenor() + " es el menor.");
        // Sin instanciar
        System.out.println("-- Sin Instancia --");
        System.out.println("Entre " + n1 + " y " + n2 + ":");
        System.out.println(Comparador.mayor(n1, n2) + " es el mayor.");
        System.out.println(Comparador.menor(n1, n2) + " es el menor.");
    }
}
