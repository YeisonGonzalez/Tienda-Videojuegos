package data;

import java.util.Arrays;

public class Plataformas extends Arcades {
	
	private int velocidad;
	private String[] obstaculos;
	private String[] enemigos;
	private static int numeroPlataformas = 0;
	
	
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public String[] getObstaculos() {
		return obstaculos;
	}
	public void setObstaculos(String[] obstaculos) {
		this.obstaculos = obstaculos;
	}
	public String[] getEnemigos() {
		return enemigos;
	}
	public void setEnemigos(String[] enemigos) {
		this.enemigos = enemigos;
	}
	
	public static int getNumeroPlataformas() {
		return numeroPlataformas;
	}

	public Plataformas(String[] plataformas, boolean online, boolean campaña, boolean cooperativo, int fov,
			double calificacion, int minedad, int integrantes, int inversion, String ludonarratividad, int niveles,
			String visualizacion, int objetos, int velocidad, String[] obstaculos, String[] enemigos) {
		super(plataformas, online, campaña, cooperativo, fov, calificacion, minedad, integrantes, inversion,
				ludonarratividad, niveles, visualizacion, objetos);
		this.velocidad = velocidad;
		this.obstaculos = obstaculos;
		this.enemigos = enemigos;
		numeroPlataformas++;
	}
	@Override
	public String toString() {
		return super.toString()+"velocidad=" + velocidad + "obstaculos=" + Arrays.toString(obstaculos) + "enemigos="
				+ Arrays.toString(enemigos);
	}
		
	
	
	
}
