package data;

import java.util.Arrays;

public class Bullethell extends Arcades {
	
	private String contexto;
	private String[] enemigos;
	private String[] heroes;
	private static int numeroBullethell = 0;
	
	public String getContexto() {
		return contexto;
	}
	public void setContexto(String contexto) {
		this.contexto = contexto;
	}
	public String[] getEnemigos() {
		return enemigos;
	}
	public void setEnemigos(String[] enemigos) {
		this.enemigos = enemigos;
	}
	public String[] getHeroes() {
		return heroes;
	}
	public void setHeroes(String[] heroes) {
		this.heroes = heroes;
	}
	
	public static int getNumeroBullethell() {
		return numeroBullethell;
	}

	public Bullethell(String[] plataformas, boolean online, boolean campaña, boolean cooperativo, int fov,
			double calificacion, int minedad, int integrantes, int inversion, String ludonarratividad, int niveles,
			String visualizacion, int objetos, String contexto, String[] enemigos, String[] heroes) {
		super(plataformas, online, campaña, cooperativo, fov, calificacion, minedad, integrantes, inversion,
				ludonarratividad, niveles, visualizacion, objetos);
		this.contexto = contexto;
		this.enemigos = enemigos;
		this.heroes = heroes;
		numeroBullethell++;
	}
	@Override
	public String toString() {
		return super.toString()+"contexto=" + contexto + "enemigos=" + Arrays.toString(enemigos) + "heroes="
				+ Arrays.toString(heroes);
	}
	

}
