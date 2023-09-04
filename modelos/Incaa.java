package modelos;
import java.util.ArrayList;

import excepciones.PeliculaExistenteException;
import excepciones.PeliculaInexistenteException;

public class Incaa {
	
	private ArrayList<Pelicula> catalogo;
	
	public Incaa() {
		this.catalogo = new ArrayList<Pelicula>();
	}
	
	public boolean existePelicula(int id) {
		if(catalogo.size() > 0) {
			for (Pelicula pelicula : catalogo) {
				if(pelicula.getId() == id) {
					return true;
				}
			}
		}
		return false;		
	}
	
	public boolean existePelicula(Pelicula peliculaBuscada) {
		if(catalogo.size() > 0) {
			for (Pelicula pelicula : catalogo) {
				if(pelicula.equals(peliculaBuscada)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean agregarPelicula(Pelicula pelicula) throws PeliculaExistenteException {
		boolean existePelicula = existePelicula(pelicula);
		if(!existePelicula) {
			catalogo.add(pelicula);
			return true;
		}
		throw new PeliculaExistenteException(pelicula.getId());
	}
	
	public Pelicula traerPelicula(int id) {
		if(catalogo.size() > 0) {
			for (Pelicula pelicula : catalogo) {
				if(pelicula.getId() == id) return pelicula;
			}		
		}
		return null;
	}
	
	// not implemented yet
	public Pelicula traerPelicula(String partePelicula) {
		
		String partePeliculaToLower = partePelicula.toLowerCase();
		
		for (Pelicula pelicula : catalogo) {
			if(pelicula.getPelicula().toLowerCase().contains(partePeliculaToLower)) {
				return pelicula;
			}
		}
		return null;
	}
	
	public void modificarPelicula(int id, String pelicula) throws PeliculaInexistenteException {
		if((catalogo.size() > 0) && (existePelicula(id))) {
			
			Pelicula p = traerPelicula(id);
			int indice = catalogo.indexOf(p);
			
			p.setPelicula(pelicula);
			catalogo.set(indice, p);
			
		} else if(!existePelicula(id)) {
			throw new PeliculaInexistenteException(id);
		}
	}
	
	public boolean eliminarPelicula(int id) throws PeliculaInexistenteException {
		if((catalogo.size() > 0) && (existePelicula(id))) {
			Pelicula p = traerPelicula(id);
			catalogo.remove(p);
			return true;
		} else if(!existePelicula(id)) {
			throw new PeliculaInexistenteException(id);
		}
		return false;
	}
}
