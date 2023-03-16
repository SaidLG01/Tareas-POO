public class Avion {
    private String aerolinea;
    private String color;
    private int pasajeros;
    private int velocidad;
    private String destino;

    public Avion() {
    }
    public Avion(String aerolinea, String color, int pasajeros, int velocidad, String destino) {
        this.aerolinea = aerolinea;
        this.color = color;
        this.destino = destino;
        this.pasajeros = pasajeros;
        this.velocidad = velocidad;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "aerolinea='" + aerolinea + '\'' +
                ", color='" + color + '\'' +
                ", pasajeros=" + pasajeros +
                ", velocidad=" + velocidad +
                ", destino='" + destino + '\'' +
                '}';
    }
    public boolean despegar(){
        System.out.println("El vuelo con destino a " + destino + "está despegando");
        return true;
    }
    public boolean abordar(){
        System.out.println("El vuelo con destino a " + destino + "está siendo abordado");
        return true;
    }
    public boolean aterrizar(){
        System.out.println("El vuelo con destino a " + destino + "está aterrizando");
        return true;
    }
}
