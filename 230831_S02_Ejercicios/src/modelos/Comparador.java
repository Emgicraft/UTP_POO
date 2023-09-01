package modelos;

/**
 *
 * @author Magh
 */
public class Comparador {
    private double menor;
    private double mayor;
    
    public Comparador(double num1, double num2) {
        if (num1 > num2) {
            this.mayor = num1;
            this.menor = num2;
        } else {
            this.mayor = num2;
            this.menor = num1;
        }
    }
    
    public static double menor(double num1, double num2) {
        Comparador c = new Comparador(num1, num2);
        return c.getMenor();
    }
    
    public static double mayor(double num1, double num2) {
        Comparador c = new Comparador(num1, num2);
        return c.getMayor();
    }

    public double getMenor() {
        return menor;
    }

    public void setMenor(double menor) {
        this.menor = menor;
    }

    public double getMayor() {
        return mayor;
    }

    public void setMayor(double mayor) {
        this.mayor = mayor;
    }
}
