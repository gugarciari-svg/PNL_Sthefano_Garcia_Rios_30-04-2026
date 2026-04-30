public class Persona {

    protected String nombre;
    protected int edad;
    protected String genero;
    protected String identificacion;

    public Persona(String nombre, int edad, String genero, String identificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.identificacion = identificacion;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("Identificación: " + identificacion);
    }
}