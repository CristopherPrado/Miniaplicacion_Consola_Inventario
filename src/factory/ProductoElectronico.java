package factory;

public class ProductoElectronico implements Producto {
    private String nombre;
    public ProductoElectronico(String nombre) { this.nombre = nombre; }

    @Override
    public void mostrarInfo() {
        System.out.println("[ELECTRONICO] Producto: " + nombre);
    }
}
