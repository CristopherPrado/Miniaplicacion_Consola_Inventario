package builder;

public class OrdenCompra {

    private final String proveedor;
    private final String producto;
    private final int    cantidad;
    private final double precioUnitario;

    private OrdenCompra(Builder builder) {
        this.proveedor      = builder.proveedor;
        this.producto       = builder.producto;
        this.cantidad       = builder.cantidad;
        this.precioUnitario = builder.precioUnitario;
    }

    @Override
    public String toString() {
        return "OrdenCompra{proveedor='" + proveedor + "', producto='" + producto +
               "', cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + "}";
    }

    public static class Builder {
        private String proveedor      = "sin proveedor";
        private String producto;
        private int    cantidad       = 2;
        private double precioUnitario = 0.0;

        public Builder(String producto) { this.producto = producto; }
        public Builder proveedor(String proveedor) { this.proveedor = proveedor; return this; }
        public Builder cantidad(int cantidad) { this.cantidad = cantidad; return this; }
        public Builder precioUnitario(double precioUnitario) { this.precioUnitario = precioUnitario; return this; }
        public OrdenCompra build() { return new OrdenCompra(this); }
    }
}
