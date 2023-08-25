package modelos;

public class Pelicula {
	
	private int id;
	private String nombre;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Pelicula(int id, String nombre) {
		super();
		this.setId(id);
		this.setNombre(nombre);
	}
	
	@Override
	public boolean equals(Object o) {
		Pelicula p = (Pelicula) o;
		return this.getId() == p.getId();
	}

	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", nombre=" + nombre + "]";
	}
}
