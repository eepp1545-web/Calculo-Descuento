public class CalculoDescuento {

    // Método que recibe monto total y porcentaje de descuento
    public static double calcularDescuento(double montoTotal, double porcentajeDescuento) {
        return montoTotal * (porcentajeDescuento / 100);
    }

    // Método que solo recibe monto total y aplica 10% de descuento
    public static double calcularDescuento(double montoTotal) {
        return calcularDescuento(montoTotal, 10); // reutiliza el método anterior
    }

    public static void main(String[] args) {
        double montoTotal1 = 2017; // ejemplo 1
        double montoTotal2 = 2020; // ejemplo 2

        // Llamada usando el descuento por defecto (10%)
        double descuento1 = calcularDescuento(montoTotal1);
        double montoFinal1 = montoTotal1 - descuento1;

        // Llamada usando un porcentaje específico (15%)
        double descuento2 = calcularDescuento(montoTotal2, 15);
        double montoFinal2 = montoTotal2 - descuento2;

        // Mostrar resultados
        System.out.println("=== Cálculo de Descuentos ===");
        System.out.println("Monto original: $" + montoTotal1);
        System.out.println("Descuento aplicado (10%): $" + descuento1);
        System.out.println("Monto final a pagar: $" + montoFinal1);

        System.out.println("\nMonto original: $" + montoTotal2);
        System.out.println("Descuento aplicado (15%): $" + descuento2);
        System.out.println("Monto final a pagar: $" + montoFinal2);
    }
}
