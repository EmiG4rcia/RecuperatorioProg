import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Cultivo {
    private String especie;
    private TipoCultivo tipo;
    private LocalDate fechaSiembra;
    private ArrayList<Cosecha> cosechas;

    public Cultivo(String especie, TipoCultivo tipo, LocalDate fechaSiembra) {
        this.especie = especie;
        this.tipo = tipo;
        this.fechaSiembra = fechaSiembra;
        this.cosechas = new ArrayList<>();
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public TipoCultivo getTipo() {
        return tipo;
    }

    public void setTipo(TipoCultivo tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaSiembra() {
        return fechaSiembra;
    }

    public void setFechaSiembra(LocalDate fechaSiembra) {
        this.fechaSiembra = fechaSiembra;
    }

    public ArrayList<Cosecha> getCosechas() {
        return cosechas;
    }

    public void setCosechas(ArrayList<Cosecha> cosechas) {
        this.cosechas = cosechas;
    }

    public void agregarCosecha(Cosecha cosecha) {
        this.cosechas.add(cosecha);

    }

    public void eliminarCosecha(Cosecha cosecha) {
        if(this.cosechas.contains(cosecha))this.cosechas.remove(cosecha);
    }

    @Override
    public String toString() {
        return "Cultivo{" +
                "especie='" + especie + '\'' +
                ", tipo=" + tipo +
                ", fechaSiembra=" + fechaSiembra +
                ", cosechas=" + cosechas +
                '}';
    }
}
