package data;

import java.util.Arrays;

public class Fantastica extends Aventura {

	private String[] hechizos ;
	private String[] magos ;
	private String[] artilugios;
	
	
	public String[] getHechizos() {
		return hechizos;
	}
	public void setHechizos(String[] hechizos) {
		this.hechizos = hechizos;
	}
	public String[] getMagos() {
		return magos;
	}
	public void setMagos(String[] magos) {
		this.magos = magos;
	}
	public String[] getArtilugios() {
		return artilugios;
	}
	public void setArtilugios(String[] artilugios) {
		this.artilugios = artilugios;
	}
	public Fantastica(String[] plataformas, boolean online, boolean campaña, boolean cooperativo, int fov,
			double calificacion, int minedad, int integrantes, int inversion, String ludonarratividad, String trama,
			String localizacion, String[] personajes, String[] hechizos, String[] magos, String[] artilugios) {
		super(plataformas, online, campaña, cooperativo, fov, calificacion, minedad, integrantes, inversion,
				ludonarratividad, trama, localizacion, personajes);
		this.hechizos = hechizos;
		this.magos = magos;
		this.artilugios = artilugios;
	}
	@Override
	public String toString() {
		return super.toString()+"hechizos=" + Arrays.toString(hechizos) + "magos=" + Arrays.toString(magos)
				+ "artilugios=" + Arrays.toString(artilugios);
	}
	
	
	
}
