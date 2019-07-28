import java.math.BigDecimal;

public class DatosFactura {

    private String nroInvoice;
    private BigDecimal precMedio;
    private BigDecimal precMin;
    private BigDecimal precMax;
    private String hora;
    private Integer totalProd;

    public DatosFactura(){
        this.precMax=new BigDecimal(0);
        this.precMin=new BigDecimal(99999);
        this.totalProd=0;
    }

    public BigDecimal getPrecMedio() {
        return precMedio;
    }

    public void setPrecMedio(BigDecimal precMedio) {
        this.precMedio = precMedio;
    }

    public BigDecimal getPrecMin() {
        return precMin;
    }

    public void setPrecMin(BigDecimal precMin) {
        this.precMin = precMin;
    }

    public BigDecimal getPrecMax() {
        return precMax;
    }

    public void setPrecMax(BigDecimal precMax) {
        this.precMax = precMax;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Integer getTotalProd() {
        return totalProd;
    }

    public void setTotalProd(Integer totalProd) {
        this.totalProd = totalProd;
    }
}
