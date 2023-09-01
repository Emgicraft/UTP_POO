package modelos;

/**
 *
 * @author Magh
 */
public class Longitud {
    private double valor;
    private String unidad; // m, cm, in, ft, yd
    
    public Longitud() {
    }
    
    public Longitud(int valor, String unidad) {
        this.valor = (double) valor;
        this.unidad = unidad;
    }
    
    public Longitud(double valor, String unidad) {
        this.valor = valor;
        this.unidad = unidad;
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    
    public double convertir_a(String unid) {
        double res = this.valor;
        if (!this.unidad.equals(unid)) {
            if (!this.unidad.equals("m")) {
                // Normalizo de otros a "m":
                switch (this.unidad) {
                case "cm":
                    res /= 100.0;
                    break;
                case "in":
                    res *= 2.52;
                    res /= 100.0;
                    break;
                case "ft":
                    res *= 12.0;
                    res *= 2.52;
                    res /= 100.0;
                    break;
                case "yd":
                    res *= 3.0;
                    res *= 12.0;
                    res *= 2.52;
                    res /= 100.0;
                    break;
                default:
                    res *= 0.0;
                }
                // Conversión de "m" a otro:
                switch (unid) {
                case "m":
                    break;
                case "cm":
                    res *= 100.0;
                    break;
                case "in":
                    res *= 100.0;
                    res /= 2.52;
                    break;
                case "ft":
                    res *= 100.0;
                    res /= 2.52;
                    res /= 12.0;
                    break;
                case "yd":
                    res *= 100.0;
                    res /= 2.52;
                    res /= 12.0;
                    res /= 3.0;
                    break;
                default:
                    res *= 0.0;
                }
            } else {
                // Conversión de "m" a otro:
                switch (unid) {
                case "m":
                    break;
                case "cm":
                    res *= 100.0;
                    break;
                case "in":
                    res *= 100.0;
                    res /= 2.52;
                    break;
                case "ft":
                    res *= 100.0;
                    res /= 2.52;
                    res /= 12.0;
                    break;
                case "yd":
                    res *= 100.0;
                    res /= 2.52;
                    res /= 12.0;
                    res /= 3.0;
                    break;
                default:
                    res *= 0.0;
                }
            }
        }
        return res;
    }
}
