package modelos;

/**
 *
 * @author Magh
 */
public class VentaDepartamento {
    private double costo_base;
    private int numHabPrincipales; // 15%
    private int numHabServicios; // 5%
    private int numPiso; // 30%, 24%, 16%, 8%, 0%
    private boolean[] serviciosAdicionales; // telefono: 100, terma: 800, cochera: 2500

    public VentaDepartamento(double costo_base, int numHabPrincipales, int numHabServicios, int numPiso, boolean[] serviciosAdicionales) {
        if (costo_base <= 0 || numHabPrincipales < 2 || numPiso <= 0) {
            throw new IllegalArgumentException("Las propiedades deben ser valores positivos y las habitaciones principales mínimas son dos.");
        } else if (numPiso > 5) {
            throw new IllegalArgumentException("Solo existen cinco pisos.");
        }
        if (serviciosAdicionales.length != 3) {
            throw new IllegalArgumentException("El arreglo serviciosAdicionales debe tener solo 3 elementos.");
        }
        this.costo_base = costo_base;
        this.numHabPrincipales = numHabPrincipales;
        this.numHabServicios = numHabServicios;
        this.numPiso = numPiso;
        this.serviciosAdicionales = serviciosAdicionales;
    }
    
    public double total() {
        double total = costo_base;
        total += (costo_base*((0.15*(numHabPrincipales-2)) + (0.05*numHabServicios)));
        switch (numPiso) {
            case 1:
                total += (costo_base*0.30);
                break;
            case 2:
                total += (costo_base*0.24);
                break;
            case 3:
                total += (costo_base*0.16);
                break;
            case 4:
                total += (costo_base*0.08);
                break;
            case 5:
                break;
            default:
                throw new AssertionError("Numero de piso no válido!");
        }
        if (serviciosAdicionales[0]) {
            total += 100.0;
        }
        if (serviciosAdicionales[1]) {
            total += 800.0;
        }
        if (serviciosAdicionales[2]) {
            total += 2500.0;
        }
        return total;
    }
}
