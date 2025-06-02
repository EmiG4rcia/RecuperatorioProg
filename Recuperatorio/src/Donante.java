import java.util.ArrayList;

public class Donante extends Persona {

    //UN DONANTE TIENE MUCHAS DONACIONES
    private ArrayList<Donacion> donaciones;

    public Donante(String nombre, String dni, String email, Domicilio domicilio) {
        super(nombre, dni, email, domicilio);
        this.donaciones = new ArrayList<>();
    }

    public ArrayList<Donacion> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(ArrayList<Donacion> donaciones) {
        this.donaciones = donaciones;
    }

    public void agregarDonacion(Donacion donacion) {
        this.donaciones.add(donacion);
    }
    public void eliminarDonacion(Donacion donacion) {
        if(this.donaciones.contains(donacion))this.donaciones.remove(donacion);
    }

    public void mostrarDonaciones() {
        System.out.println("Donaciones realizadas por " + this.getNombre() + ":");
        for (Donacion donacion : donaciones) {
            System.out.println("Tipo de donacion: "+donacion.getTipo()+" Descripcion: "+donacion.getDescripcion()+"Fecha de donacion: "+donacion.getFecha());
        }
    }

    @Override
    public String toString() {
        return "Donante{" +
                super.toString() +
                "donaciones=" + donaciones +
                '}';
    }
}
