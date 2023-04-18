public class Main {
    public static void main(String[] args) {

        Taxi t1 = new Taxi("privado","terrestre","pasajeros","Volvo",
                "Automática","Negro","Uber","Chapultepec","Fes Aragón");
        System.out.println(t1);
        t1.avanzar();
        t1.frenar();
        t1.apagar();
        t1.encender();
        t1.iniciar();
        t1.finalizar();
    }
}