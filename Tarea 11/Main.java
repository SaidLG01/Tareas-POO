package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Caja<String> micaja = new Caja<>(new String[10]);

        micaja.add(0,"Hola");
        micaja.add(1,"Adiós");
        micaja.add(2,"Hi");
        System.out.println(micaja);
        String tem1 = micaja.get(0);

        System.out.println("--------");
        CajaSinGenericos cajaSin = new CajaSinGenericos(new Object[10]);
        cajaSin.add(0,"Hola");
        cajaSin.add(1,"Adiós");
        cajaSin.add(2,"Hi");
        System.out.println(cajaSin);
        String tem2 = (String)cajaSin.get(0);

        System.out.println("---Comida---");
        Caja<Comida> cajaComida = new Caja<>(new Comida[10]);
        cajaComida.add(0, new Comida("Yogurth", true));
        System.out.println(cajaComida.get(0));

        System.out.println("---------");

        ArrayList<Comida> comidas = new ArrayList<>();
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zarzamora",false));
        comidas.add(new Comida("Zanahoria",false));
        System.out.println(comidas.size());
        System.out.println(comidas.get(9));

        ArrayList<Comida> comidas2 = new ArrayList<>();
        comidas2.add(new Comida("Zanahoria",false));
        comidas2.add(new Comida("Papas",true));
        comidas2.add(new Comida("Refresco",true));
        comidas2.add(new Comida("Fresa",false));
        comidas2.add(new Comida("Pechuga",false));

        System.out.println(comidas2.get(3));
        comidas2.set(3, new Comida("Melon", false));
        comidas2.add(3, new Comida("Naranja", false));
        
        System.out.println("---Final---");
        for (Comida comida: comidas2) {
            System.out.println(comida);
        }
    }
}