package modelos;

import java.util.ArrayList;

public class Incaa {

	private ArrayList<Pelicula> catalogo;
	
	public Incaa() {
		this.catalogo = new ArrayList<Pelicula>();
	}

	public void agregarPelicula(Pelicula p) {
		Pelicula peliculaBuscada = this.traerPelicula(p.getId());
		if(peliculaBuscada == null) {
			this.catalogo.add(p);
		}
	}
	
	public Pelicula traerPelicula(int id) {
		for (Pelicula p : this.catalogo) {
			if(p.getId() == id) return p;
		}
		return null;
	}
	
	public void mostrarPeliculas() {
		if(this.catalogo.size() > 0) {
			for (Pelicula pelicula : this.catalogo) {
				System.out.println(pelicula);
			}	
		} else {
			System.out.println("No hay peliculas en el catalogo");		
		}
	}
	
	//public Pelicula traerPelicula(String partePelicula): Pelicula
	
	public void modificarPelicula(int id, String nombre) {
		Pelicula peliculaBuscada = this.traerPelicula(id);
		if(peliculaBuscada != null) {
			peliculaBuscada.setNombre(nombre);
		} else {
			System.out.println("La pelicula no existe");
		}
	}
	
	public boolean eliminarPelicula(int id) {
		Pelicula peliculaBuscada = this.traerPelicula(id);
		if(peliculaBuscada != null) {
			return this.catalogo.remove(peliculaBuscada);
		}
		return false;
	}
}
