/*EJERCICIO 4
 * Crearemos una clase llamada Serie con las siguiente caracteristicas:
 * - Sus atributos son titulo, numero de temporadas, entregado, genero y creador.
 * - Por defecto, el numero de temporadas es de 3 temporadas y entregado false. El resto de 
 * atributos seran valores por defecto segun el tipo del atributo.
 * - Los constructores que se implementaran serán:
 * 		- Un constructor por defecto.
 * 		- Un constructor con el titulo y creador. El resto por defecto.
 * 		- Un construcot con todos los atributos, excepto de entregado.*/

public class Serie {

	private String titulo;
	private int numeroTemporadas = 3;
	private boolean entregado = false;
	private Genero genero;
	private String creador;

	public Serie() {

	}

	public Serie(String titulo, String creador) {

		this.titulo = titulo;
		this.creador = creador;
	}

	public Serie(String titulo, int numeroTemporadas, Genero genero, String creador) {

		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.genero = genero;
		this.creador = creador;
	}

	
	//Creo los getters y setters de num de temporadas para probar
	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}
	

}
