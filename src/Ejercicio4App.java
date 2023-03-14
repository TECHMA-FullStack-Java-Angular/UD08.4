/*EJERCICIO 4
 * Crearemos una clase llamada Serie con las siguiente caracteristicas:
 * - Sus atributos son titulo, numero de temporadas, entregado, genero y creador.
 * - Por defecto, el numero de temporadas es de 3 temporadas y entregado false. El resto de atributos seran valores por defecto segun el tipo del atributo.
 * - Los constructores que se implementaran serán:
 * 		- Un constructor por defecto.
 * 		- Un constructor con el titulo y creador. El resto por defecto.
 * 		- Un construcot con todos los atributos, excepto de entregado.*/

public class Ejercicio4App {
	
	public static void main (String []args) {
		
		
		//Creamos objetos usando los distintos constructores
		Serie serie1 = new Serie();
		Serie serie2 = new Serie("La casa de papel", "Álex Pina");
		Serie serie3 = new Serie("Last of us", 1, Genero.FICCION,"Craig Mazin");
		
		//probaremos el get y set de temporadas
		System.out.println("Numero de temporadas creado por defecto en constructor por defecto: "+serie1.getNumeroTemporadas()+" temporadas.\n");
		
		//Alteramos el numero de temporada de serie2
		serie2.setNumeroTemporadas(5);
		System.out.println("Numero de temporadas asignado por constructor 2 parametros y alterado por setter: "+serie2.getNumeroTemporadas()+" temporadas.\n");
		
		//Comprobamos el numero de series de la serie3
		System.out.println("Numero de temporadas asignado por de constructor completo: "+serie3.getNumeroTemporadas()+" temporadas.\n");
	}

}
