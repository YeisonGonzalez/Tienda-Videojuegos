package data;

import java.util.Arrays;

public class Deportes extends AAA{

	private String deporte;
	private int jugadores;
	private String[] ubicacion;
	private static int numeroDeportes = 0;
	
	public Deportes(String[] plataformas, boolean online, boolean campaña, boolean cooperativo, int fov,
			double calificacion, int minedad,String emp, String mot, String[] franq, String dep, int jugad , String[] ubic) {
		super(plataformas, online, campaña, cooperativo, fov, calificacion, minedad,emp, mot, franq);
		this.setD(dep);
		this.setJu(jugad);
		this.setU(ubic);
		numeroDeportes++;
	}
		
	public static int getNumeroDeportes() {
		return numeroDeportes;
	}

	public String getD() {
		return this.deporte;
	}
	public void setD(String dep) {
		this.deporte= dep;
	}
	
	public int getJu() {
		return this.jugadores;
	}
	
	public void setJu(int juga) {
		this.jugadores= juga;
	}
	
	public String[] getU() {
		return this.ubicacion;
	}
	public void setU(String[] ubi) {
		this.ubicacion= ubi;
	}
	
	@Override
	public String toString() { 
		return super.toString()+ ", Deporte: " + deporte + ", Numero de Jugadores: " + jugadores + ", Ubicacion: " + Arrays.toString(ubicacion);
	}
}
