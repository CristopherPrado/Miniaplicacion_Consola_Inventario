package factory;

public class ProductoFactory {
    public static Producto crear(String tipo, String nombre) {
        switch (tipo.toLowerCase()) {
            case "electronico": return new ProductoElectronico(nombre);
            case "alimento":    return new ProductoAlimento(nombre);
            default: throw new IllegalArgumentException("Tipo no soportado: " + tipo);
        }
    }
}
