import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Capacitacion {

    private String tema;
    private LocalDate fecha;
    private ArrayList<Voluntario> voluntarios;
    private Capacitador capacitador;

    public Capacitacion(String tema, LocalDate fecha, Capacitador capacitador) {

        this.tema = tema;
        this.fecha = fecha;
        this.voluntarios = new ArrayList<>();
        this.capacitador = capacitador;
        capacitador.setCapacitacion(this);
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Voluntario> getVoluntarios() {
        return voluntarios;
    }

    public void setVoluntarios(ArrayList<Voluntario> voluntarios) {
        this.voluntarios = voluntarios;
    }

    public Capacitador getCapacitador() {
        return capacitador;
    }

    public void setCapacitador(Capacitador capacitador) {
        this.capacitador = capacitador;
        capacitador.setCapacitacion(this);
    }

    public void agregarVoluntario(Voluntario voluntario) {
        this.voluntarios.add(voluntario);
    }

    public void eliminarVoluntario(Voluntario voluntario) {
        if(this.voluntarios.contains(voluntario))this.voluntarios.remove(voluntario);
    }


    public void mostrarAsistentes(){
        System.out.println("Voluntarios que asisteiron a la capacitacion: ");;
        for(Voluntario voluntario:this.voluntarios){
            System.out.println("Nombre: "+voluntario.getNombre()+" DNI: "+voluntario.getDni()+"\n");

        }
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "tema='" + tema + '\'' +
                ", fecha=" + fecha +
                ", voluntarios=" + voluntarios +
                ", capacitador=" + capacitador +
                '}';
    }
}

