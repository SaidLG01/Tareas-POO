public class DriverMaquina {

    public static void main(String[] args) {
        System.out.println("Buenos días, ¿Qué le vamos a dar :) ?");

        MaquinaDeCafe m1 = new MaquinaDeCafe();
        System.out.println(m1);
        //sirviendo la primera ronda de cafés a 5 personas
        m1.prepararExpresso();
        m1.prepararCapuchino();
        m1.prepararAmericano();
        m1.prepararCapuchino();
        m1.prepararExpresso();
        //Hasta el momento se han usado 620 ml, 83 gramos de café, 140 ml de crema y 5 vasos

        //Segunda vuelta de cafés
        m1.prepararCapuchino();
        m1.prepararAmericano();
        m1.prepararAmericano();
        m1.prepararExpresso();
        m1.prepararCapuchino();
        //Se han usado 1300 ml de agua, 161 gramos de café y 280 ml de crema
        //Llegan nuevos clientes
        System.out.println("Buenos días, ¿Qué les puedo preparar?");
        m1.prepararAmericano();
        m1.prepararAmericano();
        m1.prepararAmericano();
        m1.prepararExpresso();
        m1.prepararExpresso();
        m1.prepararExpresso();
        m1.prepararCapuchino();
        m1.prepararCapuchino();
        m1.prepararCapuchino();
        // recursos utilizados hasta el momento 2500 ml de agua, 308 gramos de café, 500 ml de crema y 19 vasos
        System.out.println("\n Cantidades restantes de los insumos\n");
        int cantAgua = m1.getAgua();
        int cantCafe = m1.getCafe();
        int cantCrema = m1.getCrema();
        int cantVasos = m1.getVasos();

        System.out.println(cantAgua + "ml");
        System.out.println(cantCafe + "gr");
        System.out.println(cantCrema + "ml");
        System.out.println(cantVasos);
    }
}
