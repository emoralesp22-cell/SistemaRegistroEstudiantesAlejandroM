import java.util.ArrayList;

public class GestorEstudiantes {

    ArrayList<ESTUDIANTE> lista = new ArrayList<>();

    public void agregarEstudiante(ESTUDIANTE e) {
        lista.add(e);
    }

    public void listarEstudiantes() {
        for (ESTUDIANTE e : lista) {
            System.out.println(e);
        }
    }

    public ESTUDIANTE buscarEstudiante(int id) {
        for (ESTUDIANTE e : lista) {
            if (e.id == id) {
                return e;
            }
        }
        return null;
    }
}