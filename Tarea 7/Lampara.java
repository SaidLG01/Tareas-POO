package clases.fes;

public class Lampara {
    private double precio;
    private String colorl;
    private String forma;

    public Lampara() {
    }

    public Lampara(double precio, String colorl, String forma) {
        this.precio = precio;
        this.colorl = colorl;
        this.forma = forma;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColorl() {
        return colorl;
    }

    public void setColorl(String colorl) {
        this.colorl = colorl;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    @Override
    public String toString() {
        return "Lampara{" +
                "precio=" + precio +
                ", colorl='" + colorl + '\'' +
                ", forma='" + forma + '\'' +
                '}';
    }
    public void prender(){
        System.out.println("La lampara de color" + colorl + "está prendida");
    }
    public void apagar(){
        System.out.println("La lampara está apagada");
    }
}
