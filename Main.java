import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Clase Monitor");
        Monitor m1 = new Monitor(24,"Dell","rtx-350","OLED",8000);

        System.out.println(m1.toString());
        m1.encender();
        m1.proyectar();
        m1.apagar();

        System.out.println("");
        System.out.println("Clase Automovil");
        Automovil a1 = new Automovil("Mercedes","AMG", 63,"Negro mate");
        System.out.println(a1.toString());
        a1.setMarca("Mercedes");
        a1.prender();
        a1.avanzando();
        a1.apagar();

        System.out.println("");
        System.out.println("Clase Avion");
        Avion av1 = new Avion("Volaris","Blanco",120,720,"Lima,Perú");
        System.out.println(av1.toString());
        av1.despegar();
        av1.abordar();
        av1.aterrizar();

        System.out.println("");
        System.out.println("Clase Persona");
        Persona p1 = new Persona(15,"Natanael",1.72,70.4,"Hombre");
        System.out.println(p1.toString());
        p1.Comer();
        p1.tomar();
        p1.bañarse();
    }
}