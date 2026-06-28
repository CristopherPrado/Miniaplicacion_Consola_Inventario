package adapter;

public class StockAdapter implements ConsultaStock {

    private final LectorStockExterno lector;

    public StockAdapter(LectorStockExterno lector) {
        this.lector = lector;
    }

    @Override
    public int obtenerStock(String nombreProducto) {
        System.out.println("[Adapter] Adaptando obtenerStock() -> consultarUnidades()");
        String codigo = nombreProducto.toUpperCase().replace(" ", "_");
        return lector.consultarUnidades(codigo);
    }
}
