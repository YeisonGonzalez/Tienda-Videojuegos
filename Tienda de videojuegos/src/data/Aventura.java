package data;

import java.util.Arrays;

public class Aventura extends indies {
	
	private String trama;
	private String localizacion;
	private String[] personajes;
	
	
	public String getTrama() {
		return trama;
	}
	public void setTrama(String trama) {
		this.trama = trama;
	}
	public String getLocalizacion() {
		return localizacion;
	}
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	public String[] getPersonajes() {
		return personajes;
	}
	public void setPersonajes(String[] personajes) {
		this.personajes = personajes;
	}
	
	public Aventura(String[] plataformas, boolean online, boolean campaña, boolean cooperativo, int fov,
			double calificacion, int minedad, int integrantes, int inversion, String ludonarratividad, String trama,
			String localizacion, String[] personajes) {
		super(plataformas, online, campaña, cooperativo, fov, calificacion, minedad, integrantes, inversion,
				ludonarratividad);
		this.trama = trama;
		this.localizacion = localizacion;
		this.personajes = personajes;
	}
	@Override
	public String toString() {
		return super.toString()+"trama=" + trama + "localizacion=" + localizacion + "personajes="
				+ Arrays.toString(personajes) ;
	}
	
	

}
