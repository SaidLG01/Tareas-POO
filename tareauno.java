public class tareauno{

 public static void main(String[] args){

//Inicio longitud de una cadena

	String s = "Hola";
	int x = s.length(); //retorna ~4~
	System.out.println(x);

//Fin de la longitud de una cadena

//Inicia .isEmpty

	String s1 = "Hola";
	boolean b1 = s1.isEmpty(); // retorna ~false~ porque la cadena tiene uno o más caracteres
	System.out.println(b1);

	String s2 =  "";
	boolean b2 = s2.isEmpty(); // retorna ~true~ debido a que la cadena está vacía
	System.out.println(b2);

//Fin .isEmpty

//Inicia comparacion de cadenas

	String w = "Hola";
	String y = "Hola";
	 if( w.equals(y) ); // compara sus contenidos, retorna ~true~
	  {
	   System.out.println("Si pasa por aqui!");
	  }

//Fin comparacion de cadenas

//Inicio .indexOf y .lastIndexOf

	String z = "Hola, como estas?";
	int p1 = z.indexOf('a'); // retorna ~3~, ya que retorna la posicion de la primera ocurrencia
	System.out.println(p1);

	int p2 = z.lastIndexOf('a'); // retorna ~14~, debido a que es la ultima ocurrencia del caracter indicado
	System.out.println(p2);

// Fin del .indexOf y .lastIndexoF

// Inicio cadena de caracteres en mayusculas y minusculas

	String v = "Hola, como estas?";
	String may = v.toUpperCase(); // retorna ~HOLA, COMO ESTAS?~
	System.out.println(may);

	String min = v.toLowerCase(); // retorna ~hola, como estas?~
	System.out.println(min);

//Fin de caracteres en mayusculas y minusculas

//Inicio subString

	String t = "Hola, como estas?";
	String t1 = t.substring(0,4); // retorna ~Hola~
	System.out.println(t1);
	String t2 = t.substring(6,10); // retorna ~como~
	System.out.println(t2);
	String t3 = t.substring(11); // retorna ~estas?~
	System.out.println(t3);

// Fin substring

//inicia la clase integer
	//enteros
	String m1 = "1234";
	int i = Integer.parseInt(m1); //retorna ~1234~
	System.out.println(i);

	String n1 = Integer.toString(i); // retorna ~"1234"~
	System.out.println(n1);

	//flotantes
	String m2 = "1234.56";
	double d = Double.parseDouble(m2); // retorna ~1234.56~
	System.out.println(d);

	String n2 = Double.toString(d); // retorna ~"1234.56"~
	System.out.println(n2);

// Fin de la clase integer

// Inicio StringBuilder

	StringBuilder sb = new StringBuilder();
	sb.append("Hola, ");
	sb.append("Chau");
	System.out.println(sb); 
	
	}
}

