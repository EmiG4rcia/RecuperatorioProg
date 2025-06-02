import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Tarea {
    private String descripcion;
    private LocalDate fecha;
    private Sector sector;
    private ArrayList<Voluntario>voluntarios;

    public Tarea(String descripcion, LocalDate fecha, Sector sector) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.sector = sector;
        sector.setTarea(this);
        this.voluntarios = new ArrayList<>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
        sector.setTarea(this);
    }

    public ArrayList<Voluntario> getVoluntarios() {
        return voluntarios;
    }

    public void setVoluntarios(ArrayList<Voluntario> voluntarios) {
        this.voluntarios = voluntarios;
    }

    public void agregarVoluntario(Voluntario voluntario) {
        this.voluntarios.add(voluntario);
        voluntario.realizarTarea(this);
    }

    public void eliminarVoluntario(Voluntario voluntario) {
        this.voluntarios.remove(voluntario);
        voluntario.eliminarTarea(this);
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                ", sector=" + sector +
                ", voluntarios=" + voluntarios +
                '}';
    }
}
