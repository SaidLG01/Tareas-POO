package clases.fes;

public class Cubo {
    private String coloresr;
    private int caras;
    private int tamaño;

    public Cubo() {
    }

    public Cubo(String coloresr, int caras, int tamaño) {
        this.coloresr = coloresr;
        this.caras = caras;
        this.tamaño = tamaño;
    }

    public String getColoresr() {
        return coloresr;
    }

    public void setColoresr(String coloresr) {
        this.coloresr = coloresr;
    }

    public int getCaras() {
        return caras;
    }

    public void setCaras(int caras) {
        this.caras = caras;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Cubo{" +
                "coloresr='" + coloresr + '\'' +
                ", caras=" + caras +
                ", tamaño=" + tamaño +
                '}';
    }
    public void resolver(){
        System.out.println("El cubo se ha resuelto porque cada una de las " + caras + " caras tiene su color respectivo");
    }
    public void revolver(){
        System.out.println("El cubo ha sido revuelto porque las " + caras + "caras tienen diferentes colores");
    }
}
