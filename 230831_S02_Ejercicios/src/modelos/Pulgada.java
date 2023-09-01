package modelos;

/**
 * Clase Pulgada, posee como propiedad el valor de la medida y métodos 
 * de conversión a otras unidades, tanto normales como estáticos.
 *
 * @author Moisés
 */
public class Pulgada {
    private double valor;
    
    /**
     * Clase Pulgada.
     * @param valor en pulgadas.
     */
    public Pulgada(double valor) {
        this.valor = valor;
    }
    
    /**
     * Convierte las pulgadas ingresadas a metros.
     * @param valor en pulgadas.
     * @return Valor en metros.
     */
    public static double convertir_a_metros(double valor) {
        return convertir_a(valor, "m");
    }
    
    /**
     * Convierte las pulgadas ingresadas a centimetros.
     * @param valor en pulgadas.
     * @return Valor en centimetros.
     */
    public static double convertir_a_centimetros(double valor) {
        return convertir_a(valor, "cm");
    }
    
    /**
     * Convierte las pulgadas ingresadas a pies.
     * @param valor en pulgadas.
     * @return Valor en pies.
     */
    public static double convertir_a_pies(double valor) {
        return convertir_a(valor, "ft");
    }
    
    /**
     * Convierte las pulgadas ingresadas a yardas.
     * @param valor en pulgadas.
     * @return Valor en yardas.
     */
    public static double convertir_a_yardas(double valor) {
        return convertir_a(valor, "yd");
    }
    
    /**
     * Convierte las pulgadas de entrada a la unidad especificada.
     * @param valor en pulgadas.
     * @param unidad m, cm, ft, yd
     * @return La conversión de pulgadas.
     */
    public static double convertir_a(double valor, String unidad) {
        double res = valor;
        switch (unidad) {
            case "m":
                res *= 2.52;
                res /= 100.0;
                break;
            case "cm":
                res *= 2.52;
                break;
            case "ft":
                res /= 12.0;
                break;
            case "yd":
                res /= 12.0;
                res /= 3.0;
                break;
            default:
                System.out.println("Error! Unidad no válida!");
                res *= 0.0;
        }
        return res;
    }
    
    /**
     * Convierte las pulgadas a metros.
     * @return Valor en metros.
     */
    public double convertir_a_metros() {
        return convertir_a("m");
    }
    
    /**
     * Convierte las pulgadas a centimetros.
     * @return Valor en centimetros.
     */
    public double convertir_a_centimetros() {
        return convertir_a("cm");
    }
    
    /**
     * Convierte las pulgadas a pies.
     * @return Valor en pies.
     */
    public double convertir_a_pies() {
        return convertir_a("ft");
    }
    
    /**
     * Convierte las pulgadas a yardas.
     * @return Valor en yardas.
     */
    public double convertir_a_yardas() {
        return convertir_a("yd");
    }
    
    /**
     * Convierte las pulgadas a la unidad especificada.
     * @param unidad m, cm, ft, yd
     * @return La conversión de pulgadas.
     */
    public double convertir_a(String unidad) {
        double res = this.valor;
        switch (unidad) {
            case "m":
                res *= 2.52;
                res /= 100.0;
                break;
            case "cm":
                res *= 2.52;
                break;
            case "ft":
                res /= 12.0;
                break;
            case "yd":
                res /= 12.0;
                res /= 3.0;
                break;
            default:
                System.out.println("Error! Unidad no válida!");
                res *= 0.0;
        }
        return res;
    }

    /**
     * Método GET de encapsulamiento.
     * @return el valor de la propiedad.
     */
    public double getValor() {
        return valor;
    }

    /**
     * Método SET de encapsulamiento.
     * @param valor en pulgadas.
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
}
