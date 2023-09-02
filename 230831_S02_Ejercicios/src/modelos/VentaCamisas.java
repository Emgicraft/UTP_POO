package modelos;

/**
 *
 * @author Magh
 */
public class VentaCamisas {
    //private int[][] detalle;
    private int talla;
    private int cantidad;
    private double precioPorCamisa;
    private double impuesto = 0.19;

    public VentaCamisas(int talla, int cantidad) {
        this.talla = talla;
        this.cantidad = cantidad;
        calcularPrecio();
    }

    private void calcularPrecio() {
        if (talla <= 6) {
            precioPorCamisa = 7.0;
        } else if (talla >= 8 && talla <= 20) {
            precioPorCamisa = 10.0;
        } else {
            precioPorCamisa = 14.0;
        }

        // Aplicar descuento por cantidad
        if (cantidad > 5 * 12) {
            int camisasRegaladas = (cantidad / 25) * 2;
            cantidad += camisasRegaladas;
        }

        // Aplicar incremento por cuotas
        if (cantidad >= 12) {
            precioPorCamisa *= 1.04; // 4% de incremento
        }

        if (cantidad >= 24) {
            precioPorCamisa *= 1.06; // 6% de incremento
        }
    }

    public double calcularTotal() {
        double subtotal = cantidad * precioPorCamisa;
        double total = subtotal + (subtotal * impuesto);
        return total;
    }

    public int obtenerCamisasRegaladas() {
        return (cantidad / 25) * 2;
    }

    public double calcularMontoCuota(int cuotas) {
        double total = calcularTotal();
        return total / cuotas;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
