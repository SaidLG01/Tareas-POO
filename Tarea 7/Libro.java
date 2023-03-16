package clases.fes;

public class Libro {
    private int paginas;
    private String categoria;
    private String autor;
    private String nombrel;
    private double costo;

    public Libro() {
    }

    public Libro(int paginas, String categoria, String autor, String nombrel, double costo) {
        this.paginas = paginas;
        this.categoria = categoria;
        this.autor = autor;
        this.nombrel = nombrel;
        this.costo = costo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNombrel() {
        return nombrel;
    }

    public void setNombrel(String nombrel) {
        this.nombrel = nombrel;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "paginas=" + paginas +
                ", categoria='" + categoria + '\'' +
                ", autor='" + autor + '\'' +
                ", nombrel='" + nombrel + '\'' +
                ", costo=" + costo +
                '}';
    }
    public void comprar(){
        System.out.println("El libro " + nombrel + "ha salido a la venta con un precio de " + costo + "pesos");
    }
    public void escribir(){
        System.out.println("El/La autor(a) " + autor + "le gusta mucho escribir acerca de " + categoria);
    }
}