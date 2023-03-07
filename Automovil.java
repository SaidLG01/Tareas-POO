import java.util.ArrayList;
public class Automovil {
    private String marca;
    private String submarca;
    private int modelo;
    private String color;

    public Automovil() {
    }

    public Automovil(String marca, String submarca, int modelo, String color) {
        this.marca = marca;
        this.submarca = submarca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String m) {
        ArrayList<String> marcas = new ArrayList<>();
        marcas.add("VW");
        marcas.add("HONDA");
        marcas.add("TESLA");
        marcas.add("NISSAN");
        marcas.add("MITSUBISHI");
        marcas.add("TOYOTA");
        marcas.add("MERCEDES");

            if (marcas.contains(m.toUpperCase())){
                this.marca = m;
            }
            else {
                System.out.println("Esa marca no existe");
            }
        this.marca = m;
    }

    public String getSubmarca() {
        return submarca;
    }

    public void setSubmarca(String submarca) {
        this.submarca = submarca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", submarca='" + submarca + '\'' +
                ", modelo=" + modelo +
                ", color='" + color + '\'' +
                '}';
    }
    public boolean prender(){
        System.out.println("El auto de la marca " + marca + "se está encendiendo");
        return true;
    }
    public boolean avanzando(){
        System.out.println("El auto de la marca " + marca + "está avanzando");
        return true;
    }
    public boolean apagar(){
        System.out.println("El auto de la marca " + marca + "se está apagando");
        return true;
    }

}
