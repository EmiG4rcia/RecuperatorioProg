import java.time.LocalDate;

public class Cosecha {
private LocalDate fecha;
private double cantidad;


    public Cosecha(LocalDate fecha, double cantidad) {
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cosecha{" +
                "fecha=" + fecha +
                ", cantidad=" + cantidad +
                '}';
    }
}
