import singleton.GestorInventario;
import factory.Producto;
import factory.ProductoFactory;
import builder.OrdenCompra;
import adapter.LectorStockExterno;
import adapter.ConsultaStock;
import adapter.StockAdapter;

public class Main {

    public static void main(String[] args) {

        System.out.println("=================== Patron Singleton (GestorInventario) ===================");

        GestorInventario g1 = GestorInventario.getInstancia();
        GestorInventario g2 = GestorInventario.getInstancia();
        g1.setAlmacen("Almacen Norte");

        System.out.println("g1: " + g1);
        System.out.println("g2: " + g2);
        System.out.println("g1 == g2? " + (g1 == g2));

        System.out.println("=================== Patron Factory (Productos) ===================");

        Producto electronico = ProductoFactory.crear("electronico", "Laptop HP");
        electronico.mostrarInfo();

        Producto alimento = ProductoFactory.crear("alimento", "Arroz 5kg");
        alimento.mostrarInfo();

        System.out.println("=================== Patron Builder (OrdenCompra) ===================");

        OrdenCompra orden = new OrdenCompra.Builder("Laptop HP")
                .proveedor("TecnoDistribuidora")
                .cantidad(10)
                .precioUnitario(850.00)
                .build();
        System.out.println("Orden: " + orden);

        OrdenCompra ordenSimple = new OrdenCompra.Builder("Cable USB")
                .build();
        System.out.println("Orden simple: " + ordenSimple);

        System.out.println("=================== Patron Adapter (ConsultaStock) ====================");

        LectorStockExterno lectorExterno = new LectorStockExterno();
        ConsultaStock stock = new StockAdapter(lectorExterno);
        int unidades = stock.obtenerStock("Laptop HP");
        System.out.println("Stock disponible: " + unidades + " unidades");
    }
}
