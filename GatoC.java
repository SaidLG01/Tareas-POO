package clases.fes;

public class GatoC {
    private String colorg;
    private int edad;
    private String nombre;

    public GatoC() {
    }

    public GatoC(String colorg, int edad, String nombre) {
        this.colorg = colorg;
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getColorg() {
        return colorg;
    }

    public void setColorg(String colorg) {
        this.colorg = colorg;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "GatoC{" +
                "colorg='" + colorg + '\'' +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }
    public void ronronear(){
        System.out.println("El gato " + nombre + "ronronea si lo acaricias");
    }
    public void bañar(){
        System.out.println("El gato de color "+ colorg + "toma un baño de sol");
    }
}
