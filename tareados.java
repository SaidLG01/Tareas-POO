
import java.util.Scanner;
  public class tareados{

  public static void main(String[] args){

	Scanner nom = new Scanner(System.in);

        	System.out.println( "Ingrese su nombre:");
        	String n = nom.nextLine();
	

        Scanner pro = new Scanner(System.in);

	        System.out.println("Ingrese su profesion:");
		String  p = pro.nextLine();
        

	Scanner nac = new Scanner(System.in);
	        System.out.println("Ingrese su nacionalidad");
	        String nc = nac.nextLine();
        

	System.out.println("Nombre: " + n);
	System.out.println("Profesion: " + p);
	System.out.println("Nacionalidad " + nc);
}
}
