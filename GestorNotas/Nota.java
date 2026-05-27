public class Nota {
    private int id;
    private String titulo;
    private String contenido;
    private boolean importante;

    public Nota(int id, String titulo, String contenido, boolean importante) {
        this.id = id;
        this.titulo = titulo;
        this.contenido = contenido;
        this.importante = importante;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public boolean isImportante() {
        return importante;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setImportante(boolean importante) {
        this.importante = importante;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", contenido='" + contenido + '\'' +
                ", importante=" + importante +
                '}';
    }
}