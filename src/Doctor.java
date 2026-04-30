import java.util.ArrayList;

public class Doctor extends Persona {

    private String especialidad;
    private String numeroDeLicencia;
    private ArrayList<Paciente> pacientes;

    public Doctor(String nombre, int edad, String genero, String identificacion,
                  String especialidad, String numeroDeLicencia) {
        super(nombre, edad, genero, identificacion);
        this.especialidad = especialidad;
        this.numeroDeLicencia = numeroDeLicencia;
        pacientes = new ArrayList<>();
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void mostrarPacientes() {
        System.out.println("Pacientes asignados:");
        for (Paciente p : pacientes) {
            System.out.println(p.nombre);
        }
    }
}
