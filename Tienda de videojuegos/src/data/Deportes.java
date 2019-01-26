package data;

import java.util.Arrays;

public class Deportes extends AAA{

	private String deporte;
	private int jugadores;
	private String[] ubicacion;
	
	public Deportes(String emp, String mot, String[] franq, String dep, int jugad , String[] ubic) {
		super(emp, mot, franq);
		this.setD(dep);
		this.setJu(jugad);
		this.setU(ubic);
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
