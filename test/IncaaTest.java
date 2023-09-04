package test;

import excepciones.PeliculaExistenteException;
import excepciones.PeliculaInexistenteException;

import modelos.Genero;
import modelos.Incaa;
import modelos.Pelicula;

public class IncaaTest {

	public static void main(String[] args) throws PeliculaExistenteException, PeliculaInexistenteException {
		
		Incaa i = new Incaa();
		
		Genero drama = new Genero(1, "Drama");
		Genero comedia = new Genero(1, "Comedia");
		Pelicula p1 = new Pelicula(1, "Oppenheimer", drama);
		Pelicula p2 = new Pelicula(2, "Barbie", comedia);
		
		System.out.println(i.agregarPelicula(p1));
		System.out.println(i.agregarPelicula(p2));
		
	}
}
