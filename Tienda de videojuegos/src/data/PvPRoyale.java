package data;

import java.util.Arrays;

public class PvPRoyale extends OneVsAll{
	private int equipos;
	private String mapa;
	private String[] CondicionesDeVictoria;
	
	public PvPRoyale(String empresa, String motor, String[] franquicias, int pers, int lug, String[] reg, int ene, double sim, String[] arm, int eq, String map, String[] cond) {
		super(empresa, motor, franquicias, pers, lug, reg, ene, sim, arm);
		this.setC(cond);
		this.setEq(eq);
		this.setM(map);
	}
	
	public int getEq() {
		return this.equipos;
	}
	
	public void setEq(int equip) {
		this.equipos= equip;
	}
	
	public String getM() {
		return this.mapa;
	}
	public void setM(String map) {
		this.mapa= map;
	}
	
	public String[] getC() {
		return this.CondicionesDeVictoria;
	}
	public void setC(String[] cdv) {
		this.CondicionesDeVictoria= cdv;
	}
	
	@Override
	public String toString() { 
		return super.toString() + "Equipos: " + equipos + "Nombre del mapa: " + mapa + ", Condiciones de victoria: " + Arrays.toString(CondicionesDeVictoria);
	}
	
}
