import java.util.ArrayList;
import java.util.List;

public class Sector {

    private String nombre;
    private String descripcion;
    private ArrayList<Cultivo> cultivos;
    private Tarea tarea;


    public Sector(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cultivos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Cultivo> getCultivos() {
        return cultivos;
    }

    public void setCultivos(ArrayList<Cultivo> cultivos) {
        this.cultivos = cultivos;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    public void agregarCultivo(Cultivo cultivo) {
        this.cultivos.add(cultivo);
    }
    public void eliminarCultivo(Cultivo cultivo) {
        if(this.cultivos.contains(cultivo))this.cultivos.remove(cultivo);
    }

    public List<Cosecha> getCosechasDelSector() {
        List<Cosecha> cosechas = new ArrayList<>();
        for (Cultivo cultivo : this.cultivos) {
            cosechas.addAll(cultivo.getCosechas());
        }
        return cosechas;
    }

    @Override
    public String toString() {
        return "Sector{" +
                "cultivos=" + cultivos +
                ", descripcion='" + descripcion + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
