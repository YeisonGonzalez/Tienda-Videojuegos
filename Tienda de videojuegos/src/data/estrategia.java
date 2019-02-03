package data;

import java.util.Arrays;

public class estrategia extends indies {
	private String[] parametros;
	private String[] mapas;
	private String[] recursos;
	private static int numeroEstrategia = 0;
	
	
	
	public static int getNumeroEstrategia() {
		return numeroEstrategia;
	}

	public String[] getParametros() {
		return parametros;
	}
	public void setParametros(String[] parametros) {
		this.parametros = parametros;
	}
	public String[] getMapas() {
		return mapas;
	}
	public void setMapas(String[] mapas) {
		this.mapas = mapas;
	}
	public String[] getRecursos() {
		return recursos;
	}
	public void setRecursos(String[] recursos) {
		this.recursos = recursos;
	}
	
	public estrategia(String[] plataformas, boolean online, boolean campaña, boolean cooperativo, int fov,
			double calificacion, int minedad, int integrantes, int inversion, String ludonarratividad,
			String[] parametros, String[] mapas, String[] recursos) {
		super(plataformas, online, campaña, cooperativo, fov, calificacion, minedad, integrantes, inversion,
				ludonarratividad);
		this.parametros = parametros;
		this.mapas = mapas;
		this.recursos = recursos;
		numeroEstrategia++;
	}
	@Override
	public String toString() {
		return super.toString()+"parametros=" + Arrays.toString(parametros) + "mapas=" + Arrays.toString(mapas)
				+ "recursos=" + Arrays.toString(recursos);
	}
	
	
	
}
