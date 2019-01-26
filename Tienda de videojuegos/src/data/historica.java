package data;

import java.util.Arrays;

public class historica extends Aventura {
	
	private String[] personajesic ;	
	private String epoca;
	private String[] acontecimientos;
	
	
	
	public String[] getPersonajesic() {
		return personajesic;
	}
	public void setPersonajesic(String[] personajes) {
		this.personajesic = personajes;
	}
	public String getEpoca() {
		return epoca;
	}
	public void setEpoca(String epoca) {
		this.epoca = epoca;
	}
	public String[] getAcontecimientos() {
		return acontecimientos;
	}
	public void setAcontecimientos(String[] acontecimientos) {
		this.acontecimientos = acontecimientos;
	}
	public historica(String[] plataformas, boolean online, boolean campaña, boolean cooperativo, int fov,
			double calificacion, int minedad, int integrantes, int inversion, String ludonarratividad, String trama,
			String localizacion, String[] personajes, String[] personajesic, String epoca, String[] acontecimientos) {
		super(plataformas, online, campaña, cooperativo, fov, calificacion, minedad, integrantes, inversion,
				ludonarratividad, trama, localizacion, personajes);
		this.personajesic = personajesic;
		this.epoca = epoca;
		this.acontecimientos = acontecimientos;
	}
	@Override
	public String toString() {
		return super.toString()+"personajesic=" + Arrays.toString(personajesic) + "epoca=" + epoca + "acontecimientos="
				+ Arrays.toString(acontecimientos) ;
	}
	

}
