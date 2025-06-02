import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Voluntario extends Persona {

    private ArrayList<Tarea> tareasRealizadas;
    private Turno turno = new Turno();



//    public Voluntario(Turno turno) {
//        this.turno = turno;
//        this.tareasRealizadas = new ArrayList<>();
//    }

    public Voluntario(String nombre, String dni, String email, Domicilio domicilio) {
        super(nombre, dni, email, domicilio);
        this.tareasRealizadas = new ArrayList<>();
    }

    public ArrayList<Tarea> getTareasRealizadas() {
        return tareasRealizadas;
    }

    public void setTareasRealizadas(ArrayList<Tarea> tareasRealizadas) {
        this.tareasRealizadas = tareasRealizadas;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(LocalDate fecha, String horario) {
        this.turno = new Turno(fecha, horario);
    }

    public void realizarTarea(Tarea tarea) {
        this.tareasRealizadas.add(tarea);
    }
    public void eliminarTarea(Tarea tarea) {
        if(this.tareasRealizadas.contains(tarea))this.tareasRealizadas.remove(tarea);
    }

    @Override
    public String toString() {
        return "Voluntario{" +
                super.toString() +
                "turno=" + turno +
                '}';
    }
}
