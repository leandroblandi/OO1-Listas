package modelos;

public class Genero {
	private int id;
	private String genero;
	
	public Genero(int id, String genero) {
		super();
		this.setId(id);
		this.setGenero(genero);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id >= 0) this.id = id;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		if(genero.length() > 0) this.genero = genero;
	}
	@Override
	public String toString() {
		return "Genero(id=" + id + ", genero=" + genero + ")";
	}
	
}
