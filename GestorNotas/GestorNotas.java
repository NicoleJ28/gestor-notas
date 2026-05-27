import java.util.ArrayList;
import java.util.List;

public class GestorNotas {

    private List<Nota> notas;

    public GestorNotas() {
        this.notas = new ArrayList<>();
    }

    public void crearNota(String titulo, String contenido, boolean importante) {
        int id = notas.size() + 1;
        Nota nota = new Nota(id, titulo, contenido, importante);
        notas.add(nota);
        System.out.println("Nota creada con id: " + id);
    }

    // TODO: implementar listado
    public void listarNotas() {
        // implementar en la fase correspondiente
    }

    // TODO: implementar filtro
    public void listarImportantes() {
        // implementar en la fase correspondiente
    }
}