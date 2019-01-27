package data;

import java.util.Arrays;

public class PvE extends OneVsAll{
	private int ordas;
	private String[] dificultad;
	private String[] TiposDeEnemigos;
	
	public PvE(String[] plataformas, boolean online, boolean campaña, boolean cooperativo, int fov,
			double calificacion, int minedad,String empresa, String motor, String[] franquicias, int pers, int lug, String[] reg, int ene, double sim, String[] arm, int or, String[] dif, String[] tip) {
		super(plataformas, online, campaña, cooperativo, fov, calificacion, minedad,empresa, motor, franquicias, pers, lug, reg, ene, sim, arm);
		this.setO(or);
		this.setD(dif);
		this.setT(tip);
	}
	
	public int getO() {
		return this.ordas;
	}
	public void setO(int or) {
		this.ordas= or;
	}
	
	public String[] getD() {
		return this.dificultad;
	}
	public void setD(String[] dif) {
		this.dificultad= dif;
	}
	
	public String[] getT() {
		return this.TiposDeEnemigos;
	}
	public void setT(String[] tde) {
		this.TiposDeEnemigos= tde;
	}
	
	@Override
	public String toString() { 
		return super.toString() + "Ordas: " + ordas + ", Dificultades: " + Arrays.toString(dificultad) + ", Tipos de Enemigos: " + Arrays.toString(TiposDeEnemigos);
	}
}
