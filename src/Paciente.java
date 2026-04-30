import java.util.HashMap;

public class Paciente extends Persona {

    private HashMap<String, String> historialMedico;

    public Paciente(String nombre, int edad, String genero, String identificacion) {
        super(nombre, edad, genero, identificacion);
        historialMedico = new HashMap<>();
    }

    public void agregarHistorial(String motivo, String detalles) {
        historialMedico.put(motivo, detalles);
    }

    public void mostrarHistorial() {
        System.out.println("Historial médico:");
        for (String clave : historialMedico.keySet()) {
            System.out.println(clave + ": " + historialMedico.get(clave));
        }
    }
}