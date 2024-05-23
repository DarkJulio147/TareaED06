/**
 * Esta es la clase que representa la tarea 6 de ED.
 */
public class Tarea6EDClase {

    /**
     * Aplica una rebaja al precio del producto basado en el número de productos.
     * Si el número de productos es mayor que 3, se descuenta 5 unidades del precio.
     * Si el número de productos no es cero, se aplica un descuento del 20% al total.
     * Si el número de productos es cero, se aplica un descuento del 5% al total.
     */
    public void aplicarRebaja(double precioProducto, int numProducts) {
        double total;
        if (numProducts > 3) {
            precioProducto -= 5;
        }
        if (numProducts != 0) {
            total = precioProducto * 0.8;
            System.out.println("El total a pagar es: " + total);
            System.out.println("Enviado");
        } else {
            total = precioProducto * 0.95;
            System.out.println("El total a pagar es: " + total);
            System.out.println("Enviado");
        }
    }

    /**
     * Método principal que se utiliza para probar la funcionalidad de la clase.
     */
    public static void main(String[] args) {
        Tarea6EDClase miCarrito = new Tarea6EDClase();
        miCarrito.aplicarRebaja(100, 5);
    }
}
