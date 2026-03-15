public class Subasta {
    private String fechaVencimiento;
    private double precioMinimo;
    private String estado;

    public Subasta() {}
    public Subasta(String fechaVencimiento, double precioMinimo, String estado) {
        this.fechaVencimiento = fechaVencimiento;
        this.precioMinimo = precioMinimo;
        this.estado = estado;
    }
    @Override
    public String toString() {
        return "Subasta{" +
                "Fecha de Vencimiento='" + fechaVencimiento + '\'' +
                ", Precio Mínimo=" + precioMinimo +
                ", Estado='" + estado + '\'' +
                '}';
    }
}

class Oferta {
    private String nombreOferta;
    private double montoOferta;

    public Oferta() {}
    public Oferta(String nombreOferta, double montoOferta) {
        this.nombreOferta = nombreOferta;
        this.montoOferta = montoOferta;
    }
    @Override
    public String toString() {
        return "Oferta{" +
                "Nombre de la Oferta='" + nombreOferta + '\'' +
                ", Monto de la Oferta=" + montoOferta +
                '}';
    }
}

