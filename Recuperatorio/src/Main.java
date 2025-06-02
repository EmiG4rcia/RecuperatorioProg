import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        /*Si hace correr el programa se mostrarán:

            * 2 Tareas
            * 1 Capacitación
            * 1 Donante

        * */


        Cosecha cosecha1 = new Cosecha(LocalDate.now(), 100.0);
        Cosecha cosecha2 = new Cosecha(LocalDate.now(), 100.0);
        Cosecha cosecha3 = new Cosecha(LocalDate.now(), 100.0);
        Cosecha cosecha4 = new Cosecha(LocalDate.now(), 100.0);

        Cultivo cultivo1 = new Cultivo("Tomate", TipoCultivo.FRUTAL, LocalDate.now());
        Cultivo cultivo2 = new Cultivo("Orquidea", TipoCultivo.AROMATICA, LocalDate.now());

        cultivo1.agregarCosecha(cosecha1);
        cultivo1.agregarCosecha(cosecha2);
        cultivo2.agregarCosecha(cosecha3);
        cultivo2.agregarCosecha(cosecha4);

        Sector sector1 = new Sector("Frutales", "Sector de frutales");
        Sector sector2 = new Sector("Aromaticas", "Sector de Aromaticas");

        sector1.agregarCultivo(cultivo1);
        sector2.agregarCultivo(cultivo2);

        Voluntario voluntario1 = new Voluntario("Juan", "12345678", "juan@gmail.com", new Domicilio("Calle 1", "12345678", "Ciudad", "Mendoza"));

        Tarea tarea1 = new Tarea("Cosechar frutales", LocalDate.now(), sector1);
        Tarea tarea2 = new Tarea("Cosechar aromaticas", LocalDate.now(), sector2);

        tarea1.setSector(sector1);
        tarea2.setSector(sector2);

        tarea1.agregarVoluntario(voluntario1);
        tarea2.agregarVoluntario(voluntario1);

        voluntario1.setTurno(LocalDate.now(), "9:00 am");


        Capacitador capacitador1 = new Capacitador("Lucas", "12387414", "lucas@gmail.com", new Domicilio("Calle 2", "113447958", "Maipu", "Mendoza"), "Ingeniero Agronomo");
        Capacitacion capacitacion1 = new Capacitacion("Capacitacion 1", LocalDate.now(), capacitador1);

        Voluntario asistente1 = new Voluntario("Pedro", "78964521", "pedro@gmail.com", new Domicilio("Calle 3", "366487988", "Lavalle", "Mendoza"));
        Voluntario asistente2 = new Voluntario("Maria", "12498798", "maria@gmail.com", new Domicilio("Calle 4", "567337901", "Lavalle", "Mendoza"));

        asistente1.setTurno(LocalDate.now(), "10:00 pm");
        asistente2.setTurno(LocalDate.now(), "11:00 pm ");

        capacitacion1.agregarVoluntario(asistente1);
        capacitacion1.agregarVoluntario(asistente2);

        Donacion donacion1 = new Donacion(TipoDonacion.SEMILLAS,"Donacion de Semillas para la nueva temporada de Tomate" ,LocalDate.now());
        Donante donante1 = new Donante("Gabriel", "49766487", "gabi@gmail.com", new Domicilio("Calle 6", "366487988", "Lavalle", "Mendoza"));
        donante1.agregarDonacion(donacion1);


        System.out.println(tarea1);

        System.out.println(tarea2);

        System.out.println(capacitacion1);

        System.out.println(donante1);
        
    }
}