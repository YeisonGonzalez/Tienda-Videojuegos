package data;

import java.util.Arrays;

public class Automovil extends Carreras{
	private int VehiculosLicenciados;
	private String[] clases;
	private String[] competiciones;
	
	public Automovil(String[] plataformas, boolean online, boolean campaña, boolean cooperativo, int fov,
			double calificacion, int minedad,String empresa, String motor, String[] franquicias, String[] map, boolean nit, String[] tip, int vehi, String[] clas, String[] compe ) {
		super(plataformas, online, campaña, cooperativo, fov, calificacion, minedad,empresa,  motor, franquicias, map, nit, tip);
		this.setV(vehi);
		this.setC(clas);
		this.setCo(compe);
	}
	
	public int getV() {
		return this.VehiculosLicenciados;
	}
	
	public void setV(int ve) {
		this.VehiculosLicenciados= ve;
	}
	
	public String[] getC() {
		return this.clases;
	}
	public void setC(String[] cl) {
		this.clases= cl;
	}
	
	public String[] getCo() {
		return this.competiciones;
	}
	public void setCo(String[] cop) {
		this.competiciones= cop;
	}
	
	@Override
	public String toString() { 
		return super.toString() + ", Total de vehículos: " + VehiculosLicenciados + ", Clases de vehiculos: " + Arrays.toString(clases) + ", Competiciones: " + Arrays.toString(competiciones) ;
	}
}
