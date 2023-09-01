package programa;

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
        // =====[ Ejercicio 01 ]=====
        // Instanciando
        double pulgadas = 504.5;
        Pulgada p1 = new Pulgada(pulgadas);
        System.out.println(pulgadas + " pulgadas equivalen a:");
        System.out.println(p1.convertir_a_pies() + " pies");
        System.out.println(p1.convertir_a_yardas()+ " yardas");
        System.out.println(p1.convertir_a_metros() + " metros");
        System.out.println(p1.convertir_a_centimetros() + " centimetros");
        // Sin instanciar
        System.out.println(pulgadas + " pulgadas equivalen a:");
        System.out.println(Pulgada.convertir_a_pies(pulgadas) + " pies");
        System.out.println(Pulgada.convertir_a_yardas(pulgadas) + " yardas");
        System.out.println(Pulgada.convertir_a_metros(pulgadas) + " metros");
        System.out.println(Pulgada.convertir_a_centimetros(pulgadas) + " centimetros");
        
        // =====[ Ejercicio 02 ]=====
    }
}
