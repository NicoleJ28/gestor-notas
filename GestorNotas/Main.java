import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GestorNotas gestor = new GestorNotas();

        boolean salir = false;

        while (!salir) {

            System.out.println("\n=== GESTOR DE NOTAS ===");
            System.out.println("1. Crear nota");
            System.out.println("2. Listar notas");
            System.out.println("3. Listar importantes");
            System.out.println("0. Salir");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    String titulo = "";
                    while (titulo.isEmpty()) {
                        System.out.print("Título: ");
                        titulo = scanner.nextLine();
                        if (titulo.isEmpty()) System.out.println("El título no puede estar vacío.");
                    }
                    String contenido = "";
                    while (contenido.isEmpty()) {
                        System.out.print("Contenido: ");
                        contenido = scanner.nextLine();
                        if (contenido.isEmpty()) System.out.println("El contenido no puede estar vacío.");
                    }
                    String imp = "";
                    while (!imp.equalsIgnoreCase("s") && !imp.equalsIgnoreCase("n")) {
                        System.out.print("¿Es importante? (s/n): ");
                        imp = scanner.nextLine();
                        if (!imp.equalsIgnoreCase("s") && !imp.equalsIgnoreCase("n"))
                            System.out.println("Solo se acepta s o n.");
                    }
                    boolean importante = imp.equalsIgnoreCase("s");
                    gestor.crearNota(titulo, contenido, importante);
                    break;
                case "2":
                    gestor.listarNotas();
                    break;
                case "3":
                    gestor.listarImportantes();
                    break;
                case "0":
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }

        scanner.close();
    }
}