package clases.fes;

import java.util.ArrayList;

public class Pais {
    private String continente;
    private String idioma;
    private int estados;
    private float poblacion;
    private String nombre;
    public Pais() {
    }

    public Pais(String continente, String idioma, int estados, float poblacion, String nombre) {
        this.continente = continente;
        this.idioma = idioma;
        this.estados = estados;
        this.poblacion = poblacion;
        this.nombre = nombre;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String c) {
        ArrayList<String> continentes = new ArrayList<>();
        continentes.add("AMERICA");
        continentes.add("AFRICA");
        continentes.add("EUROPA");
        continentes.add("OCEANIA");
        continentes.add("ASIA");

    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        ArrayList<String> idiomas = new ArrayList<>();
        idiomas.add("ESPAÑOL");
        idiomas.add("INGLÉS");
        idiomas.add("PORTUGUÉS");
        idiomas.add("FRANCÉS");
        idiomas.add("MANDARÍN");
    }

    public int getEstados() {
        return estados;
    }

    public void setEstados(int estados) {
        this.estados = estados;
    }

    public float getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(float poblacion) {
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "continente='" + continente + '\'' +
                ", idioma='" + idioma + '\'' +
                ", estados=" + estados +
                ", poblacion=" + poblacion +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public void fundar(){
        System.out.println("El pais: " + nombre + " ubicado en " + continente + " se ha fundado");
    }
    public void hablar(){
        System.out.println("Aproximadamente " + poblacion + "millones de personas hablan en: " + idioma);
    }
    public void constituir(){
        System.out.println("El pais: " + nombre + " se constituye por " + estados + " estados");
    }
}
