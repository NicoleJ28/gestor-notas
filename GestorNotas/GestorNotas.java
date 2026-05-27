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

    public void listarNotas() {
        if (notas.isEmpty()) {
            System.out.println("No hay notas.");
        } else {
            for (Nota nota : notas) {
                System.out.println("ID: " + nota.getId());
                System.out.println("Título: " + nota.getTitulo());
                System.out.println("Contenido: " + nota.getContenido());
                System.out.println("Importancia: " + (nota.isImportante() ? "Importante" : "Normal"));
                System.out.println("---");
            }
        }
    }

    public void listarImportantes() {
        boolean hayImportantes = false;
        for (Nota nota : notas) {
            if (nota.isImportante()) {
                System.out.println("ID: " + nota.getId());
                System.out.println("Título: " + nota.getTitulo());
                System.out.println("Contenido: " + nota.getContenido());
                System.out.println("---");
                hayImportantes = true;
            }
        }
        if (!hayImportantes) {
            System.out.println("No hay notas importantes.");
        }
    }
}