package singleton;

public class GestorInventario {

    private static GestorInventario instancia;
    private String almacen;
    private String periodo;

    private GestorInventario() {
        this.almacen = "Almacen Principal";
        this.periodo = "2025-1";
    }

    public static GestorInventario getInstancia() {
        if (instancia == null) {
            instancia = new GestorInventario();
        }
        return instancia;
    }

    public String getAlmacen() { return almacen; }
    public void setAlmacen(String almacen) { this.almacen = almacen; }
    public String getPeriodo() { return periodo; }
    public void setPeriodo(String periodo) { this.periodo = periodo; }

    @Override
    public String toString() {
        return "GestorInventario{almacen='" + almacen + "', periodo='" + periodo + "'}";
    }
}
