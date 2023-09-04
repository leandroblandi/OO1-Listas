package modelos;

public class Pelicula {
	
	private int id;
	private String pelicula;
	private Genero genero;
	
	public Pelicula(int id, String pelicula, Genero genero) {
		this.setId(id);
		this.setPelicula(pelicula);
		this.setGenero(genero);
	}

	public void setId(int id) {
		if(id >= 0) this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setPelicula(String pelicula) {
		if(pelicula.length() > 0) this.pelicula = pelicula;
	}
	public String getPelicula() {
		return pelicula;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public Genero getGenero() {
		return genero;
	}
	@Override
	public String toString() {
		return String.format("Pelicula(id=%d, pelicula=%s, genero=%s)", id, pelicula, genero);
	}
	public boolean equals(Pelicula pelicula) {
		return this.id == pelicula.id;
	}
}
