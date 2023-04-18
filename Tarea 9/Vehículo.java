public class Vehículo {
    protected String propiedad;
    protected String tipo;
    protected String carga;

    public Vehículo() {
    }

    public Vehículo(String propiedad, String tipo, String carga) {
        this.propiedad = propiedad;
        this.tipo = tipo;
        this.carga = carga;
    }

    public String getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(String propiedad) {
        this.propiedad = propiedad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Vehículo{" +
                "propiedad='" + propiedad + '\'' +
                ", tipo='" + tipo + '\'' +
                ", carga='" + carga + '\'' +
                '}';
    }
    public void avanzar(){
        System.out.println("El vehículo avanza a gran velocidad");
    }
    public void frenar(){
        System.out.println("El vehículo ha frenado");
    }
}
