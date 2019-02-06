package data;

import java.util.Arrays;

public class PvPRoyale extends OneVsAll{
	private int equipos;
	private String mapa;
	private String[] CondicionesDeVictoria;
	private static int numeroPvPRoyale = 0;
	
	public PvPRoyale(String[] plataformas, boolean online, boolean campaña, boolean cooperativo, int fov,
			double calificacion, int minedad,String empresa, String motor, String[] franquicias, int pers, int lug, String[] reg, int ene, double sim, String[] arm, int eq, String map, String[] cond) {
		super(plataformas, online, campaña, cooperativo, fov, calificacion, minedad,empresa, motor, franquicias, pers, lug, reg, ene, sim, arm);
		this.setC(cond);
		this.setEq(eq);
		this.setM(map);
		numeroPvPRoyale++;
	}
	
	public static int getNumeroPvPRoyale() {
		return numeroPvPRoyale;
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
