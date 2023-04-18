public class Taxi extends Automovil{
    private String app;
    private String encuentro;
    private String destino;

    public Taxi() {
    }

    public Taxi(String propiedad, String tipo, String carga, String marca, String suspensión, String color, String app, String encuentro, String destino) {
        super(propiedad, tipo, carga, marca, suspensión, color);
        this.app = app;
        this.encuentro = encuentro;
        this.destino = destino;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getEncuentro() {
        return encuentro;
    }

    public void setEncuentro(String encuentro) {
        this.encuentro = encuentro;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "app='" + app + '\'' +
                ", encuentro='" + encuentro + '\'' +
                ", destino='" + destino + '\'' +
                ", marca='" + marca + '\'' +
                ", suspensión='" + suspensión + '\'' +
                ", color='" + color + '\'' +
                ", propiedad='" + propiedad + '\'' +
                ", tipo='" + tipo + '\'' +
                ", carga='" + carga + '\'' +
                '}';
    }
    public void iniciar(){
        System.out.println("El viaje hacia " + destino + "ha iniciado");
    }
    public void finalizar(){
        System.out.println("El viaje hacia " + destino + "ha finalizado");
    }
}
