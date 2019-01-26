package data;

import java.util.Arrays;

public class EstiloLibre extends Deportes {
	private String[] lugares;
	private String[] personajes; 
	private String[] objetos;

	public EstiloLibre(String empresa, String motor, String[] franquicias, String dep, int juga, String[] ubi, String[] lug, String[] pers, String[] obj) {
		super(empresa, motor, franquicias, dep, juga, ubi);
		this.setL(lug);
		this.setP(pers);
		this.setO(obj);
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
