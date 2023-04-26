package ejemplo;

public class DriverMotocicleta {
    public static void main(String[] args) {
        Motocicleta moto = new Motocicleta(150,"Harley Davidson");
        System.out.println(moto);
        moto.encender();
        moto.avanzar();
        moto.hacerCaballito();
        moto.frenar();
        moto.apagar();
    }
}
