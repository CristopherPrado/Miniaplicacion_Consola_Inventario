package factory;

public class ProductoAlimento implements Producto {
    private String nombre;
    public ProductoAlimento(String nombre) { this.nombre = nombre; }

    @Override
    public void mostrarInfo() {
        System.out.println("[ALIMENTO] Producto: " + nombre);
    }
}
