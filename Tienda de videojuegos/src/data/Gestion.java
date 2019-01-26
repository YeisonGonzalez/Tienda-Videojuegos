package data;

import java.util.Arrays;

public class Gestion extends estrategia {
	private String[] edificios;
	private int poblacion;
	private String[] recursosamb;
	
	
	public String[] getEdificios() {
		return edificios;
	}
	public void setEdificios(String[] edificios) {
		this.edificios = edificios;
	}
	public int getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}
	public String[] getRecursosamb() {
		return recursosamb;
	}
	public void setRecursosamb(String[] recursos) {
		this.recursosamb = recursos;
	}
	public Gestion(String[] plataformas, boolean online, boolean campaña, boolean cooperativo, int fov,
			double calificacion, int minedad, int integrantes, int inversion, String ludonarratividad,
			String[] parametros, String[] mapas, String[] recursos, String[] edificios, int poblacion,
			String[] recursosamb) {
		super(plataformas, online, campaña, cooperativo, fov, calificacion, minedad, integrantes, inversion,
				ludonarratividad, parametros, mapas, recursos);
		this.edificios = edificios;
		this.poblacion = poblacion;
		this.recursosamb = recursosamb;
	}
	@Override
	public String toString() {
		return super.toString()+"edificios=" + Arrays.toString(edificios) + "poblacion=" + poblacion + "recursosamb="
				+ Arrays.toString(recursosamb);
	}
	
	
}
