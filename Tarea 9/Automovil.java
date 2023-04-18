public class Automovil extends Vehículo{
    protected String marca;
    protected String suspensión;
    protected String color;

    public Automovil() {
    }

    public Automovil(String propiedad, String tipo, String carga, String marca, String suspensión, String color) {
        super(propiedad, tipo, carga);
        this.marca = marca;
        this.suspensión = suspensión;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSuspensión() {
        return suspensión;
    }

    public void setSuspensión(String suspensión) {
        this.suspensión = suspensión;
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
                ", suspensión='" + suspensión + '\'' +
                ", color='" + color + '\'' +
                ", propiedad='" + propiedad + '\'' +
                ", tipo='" + tipo + '\'' +
                ", carga='" + carga + '\'' +
                '}';
    }
    public void encender(){
        System.out.println("El carro de color" + color + " está encendido");
    }
    public void apagar(){
        System.out.println("El carro de color" + color + " está apagado");
    }
}
