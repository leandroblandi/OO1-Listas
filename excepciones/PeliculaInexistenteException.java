package excepciones;

@SuppressWarnings("serial")
public class PeliculaInexistenteException extends Exception {
	public PeliculaInexistenteException(int id) {
		super(String.format("La pelicula con id %d no existe", id));
	}
}
