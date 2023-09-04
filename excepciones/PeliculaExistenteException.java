package excepciones;

@SuppressWarnings("serial")
public class PeliculaExistenteException extends Exception {
	public PeliculaExistenteException(int id) {
		super(String.format("La pelicula con id %d ya existe", id));
	}
}
