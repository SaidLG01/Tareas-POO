package clases.fes;

import java.util.ArrayList;

public class Computadora {
    private String marcac;
    private String colorc;
    private int memoria;
    private String soperativo;

    public Computadora() {
    }

    public Computadora(String marcac, String colorc, int memoria, String soperativo) {
        this.marcac = marcac;
        this.colorc = colorc;
        this.memoria = memoria;
        this.soperativo = soperativo;
    }

    public String getMarcac() {
        return marcac;
    }

    public void setMarcac(String marcac) {
        this.marcac = marcac;
    }

    public String getColorc() {
        return colorc;
    }

    public void setColorc(String colorc) {
        this.colorc = colorc;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getSoperativo() {
        return soperativo;
    }

    public void setSoperativo(String soperativo) {
        ArrayList<String> sistema = new ArrayList<>();
        sistema.add("LINUX");
        sistema.add("WINDOWS");
        sistema.add("MAC OS");
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marcac='" + marcac + '\'' +
                ", colorc='" + colorc + '\'' +
                ", memoria=" + memoria +
                ", soperativo='" + soperativo + '\'' +
                '}';
    }
    public void descargar(){
        System.out.println("La computadora " + marcac + "está descargando un programa para el sistema operativo: " + soperativo);
    }
    public void ocupar(){
        System.out.println("El dispositivo con capacidad de: " + memoria + "gb, lleva ocupada la mitad");
    }
}
