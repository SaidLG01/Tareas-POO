package clases.fes;

public class Balon {
    private String materialp;
    private String colorp;
    private int costo;
    private String Tamaño;

    public Balon() {
    }

    public Balon(String materialp, String colorp, int costo, String tamaño) {
        this.materialp = materialp;
        this.colorp = colorp;
        this.costo = costo;
        Tamaño = tamaño;
    }

    public String getMaterialp() {
        return materialp;
    }

    public void setMaterialp(String materialp) {
        this.materialp = materialp;
    }

    public String getColorp() {
        return colorp;
    }

    public void setColorp(String colorp) {
        this.colorp = colorp;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String tamaño) {
        Tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Balon{" +
                "materialp='" + materialp + '\'' +
                ", colorp='" + colorp + '\'' +
                ", costo=" + costo +
                ", Tamaño='" + Tamaño + '\'' +
                '}';
    }
    public void rebotar(){
        System.out.println("La pelota está hecha de " + materialp + "por lo que puede rebotar");
    }
    public void comprar(){
        System.out.println("Usted ha comprado una pelota de color " + colorp + " que costó " + costo + "pesos");
    }
}
