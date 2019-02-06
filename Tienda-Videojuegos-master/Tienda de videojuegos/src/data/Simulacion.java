package data;

import java.util.Arrays;

public class Simulacion extends Deportes {
	private String[] estudios;
	private String[] licencias;
	private int AñoDeLanzamiento;
	private static int numeroSimulacion = 0;
	
	public Simulacion(String[] plataformas, boolean online, boolean campaña, boolean cooperativo, int fov,
			double calificacion, int minedad,String empresa, String motor, String[] franquicias, String dep, int juga, String[] ubi, String[] est, String[] lic, int ano) {
		super(plataformas, online, campaña, cooperativo, fov, calificacion, minedad,empresa, motor, franquicias, dep, juga, ubi);
		this.setEs(est);
		this.setL(lic);
		this.setAl(ano);
		numeroSimulacion++;
	}
	
	public static int getNumeroSimulacion() {
		return numeroSimulacion;
	}

	public String[] getEs() {
		return this.estudios;
	}
	public void setEs(String[] est) {
		this.estudios= est;
	}
	
	public String[] getL() {
		return this.licencias;
	}
	public void setL(String[] lice) {
		this.licencias= lice;
	}
	
	public int getAl() {
		return this.AñoDeLanzamiento;
	}
	
	public void setAl(int adl) {
		this.AñoDeLanzamiento= adl;
	}
	
	@Override
	public String toString() { 
		return super.toString() + ", Estudios: "+ Arrays.toString(estudios) + ", Licencias: "+ Arrays.toString(licencias) + "Año de lanzamiento" + AñoDeLanzamiento;
	}
}
