public class ESTUDIANTE {
    int id;
    String nombre;
    int edad;

    public ESTUDIANTE(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nombre: " + nombre + " | Edad: " + edad;
    }
}