import java.math.BigDecimal;

public class Linea {
    /**
     *  Precio de producto medio
     * • Precio de producto mínimo
     * • Precio de producto máximo
     * • Hora del día de la factura
     * • Numero total de productos comprados
     */

    private BigDecimal precio;
    private String hora;
    private String nroInvoice;
    private Integer cantidad;

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNroInvoice() {
        return nroInvoice;
    }

    public void setNroInvoice(String nroInvoice) {
        this.nroInvoice = nroInvoice;
    }

}