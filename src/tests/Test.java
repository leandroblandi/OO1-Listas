package tests;

import modelos.Incaa;
import modelos.Pelicula;

public class Test {

	public static void main(String[] args) {
		
		Incaa i = new Incaa();
		Pelicula p = new Pelicula(1, "Oppenheimer");
		
		i.agregarPelicula(p);
		i.mostrarPeliculas();
		
		
		i.eliminarPelicula(1);
		i.mostrarPeliculas();
		
		i.agregarPelicula(p);
		i.modificarPelicula(1, "Barbie");
		i.mostrarPeliculas();
	}
}
