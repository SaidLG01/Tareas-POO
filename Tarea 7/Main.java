import clases.fes.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Clase Pais");
        System.out.println("");
        Pais p1 = new Pais("Asia","Francés", 12, 5, "Parangaricutirimicuaro");
        System.out.println(p1.toString());
        p1.setContinente("Asia");
        p1.setIdioma("Francés");
        p1.fundar();
        p1.hablar();
        p1.constituir();

        System.out.println("Clase Giroscopio");
        System.out.println("");
        Giroscopio g1 = new Giroscopio("Acero",350,"Plateado");
        System.out.println(g1.toString());
        g1.describir();
        g1.girar();

        System.out.println("Clase Computadora");
        System.out.println("");
        Computadora c1 = new Computadora("Dell","Negra",256,"Windows");
        System.out.println(c1.toString());
        c1.setSoperativo("Windows");
        c1.descargar();
        c1.ocupar();

        System.out.println("Clase Cubo");
        System.out.println("");
        Cubo cr1 = new Cubo("Azul Amarillo Rojo Naranja Blanco Verde",6,3);
        System.out.println(cr1.toString());
        cr1.resolver();
        cr1.revolver();

        System.out.println("Clase Libro");
        System.out.println("");
        Libro l1 = new Libro(600,"Drama","JK Rowling","Harry Potter",350.00);
        System.out.println(l1.toString());
        l1.escribir();
        l1.comprar();

        System.out.println("Clase Balon");
        System.out.println("");
        Balon b1 = new Balon("Plastico","Azul",40,"Mediana");
        System.out.println(b1.toString());
        b1.comprar();
        b1.rebotar();

        System.out.println("Clase Lampara");
        System.out.println("");
        Lampara lm1 = new Lampara(450.50,"Amarilla","Cilindro");
        System.out.println(lm1.toString());
        lm1.prender();
        lm1.apagar();

        System.out.println("Clase Gato");
        System.out.println("");
        GatoC gt = new GatoC("Naranja",5,"Garfield");
        System.out.println(gt.toString());
        gt.bañar();
        gt.ronronear();
    }
}