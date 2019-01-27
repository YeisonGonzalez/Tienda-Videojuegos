package data;

import java.util.Arrays;

public class Carreras extends AAA{
	private String[] mapas;
	private boolean nitro;
	private String[] TiposDeCarreras;
	
	public Carreras(String[] plataformas, boolean online, boolean campaña, boolean cooperativo, int fov,
			double calificacion, int minedad,String emp, String mot, String[] franq, String[] map,  boolean nit, String[] carrera ) {
		super( plataformas, online, campaña, cooperativo, fov, calificacion, minedad,emp,  mot, franq);
			this.setMa(map);
			this.setN(nit);
			this.setTdc(carrera);
	}
	
	
	public String[] getMa() {
		return this.mapas;
	}
	public void setMa(String[] map) {
		this.mapas= map;
	}
	
	public boolean getN() {
		return this.nitro;
	}
	public void setN(boolean nit) {
		this.nitro= nit;
	}
	
	public String[] getTdc() {
		return this.TiposDeCarreras;
	}
	public void setTdc(String[] tdc) {
		this.TiposDeCarreras= tdc;
	}
	
	@Override
	public String toString() { 
		return super.toString() + ", Mapas: "+ Arrays.toString(mapas) + ", Nitro: " + nitro  ;
	}
}
