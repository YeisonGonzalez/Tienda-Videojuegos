package data;

import java.util.Arrays;

public class EstiloLibre extends Deportes {
	private String[] lugares;
	private String[] personajes; 
	private String[] objetos;
	private static int numeroEstiloLibre = 0;

	public EstiloLibre(String[] plataformas, boolean online, boolean campaña, boolean cooperativo, int fov,
			double calificacion, int minedad,String empresa, String motor, String[] franquicias, String dep, int juga, String[] ubi, String[] lug, String[] pers, String[] obj) {
		super(plataformas, online, campaña, cooperativo, fov, calificacion, minedad,empresa, motor, franquicias, dep, juga, ubi);
		this.setL(lug);
		this.setP(pers);
		this.setO(obj);
		numeroEstiloLibre++;
	}
	
	public static int getNumeroEstiloLibre() {
		return numeroEstiloLibre;
	}

	public String[] getL() {
		return this.lugares;
	}
	public void setL(String[] lug) {
		this.lugares= lug;
	}
	
	public String[] getP() {
		return this.personajes;
	}
	public void setP(String[] pers) {
		this.personajes= pers;
	}
	
	public String[] getO() {
		return this.objetos;
	}
	public void setO(String[] obj) {
		this.objetos= obj;
	}
	
	@Override
	public String toString() { 
		return super.toString()+ ", Lugares: " + Arrays.toString(lugares) + ", Personajes: " + Arrays.toString(personajes) + ", Objetos: " +  Arrays.toString(objetos);
	}
}
