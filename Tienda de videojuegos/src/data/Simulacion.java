package data;

import java.util.Arrays;

public class Simulacion extends Deportes {
	private String[] estudios;
	private String[] licencias;
	private int A�oDeLanzamiento;
	
	public Simulacion(String[] plataformas, boolean online, boolean campa�a, boolean cooperativo, int fov,
			double calificacion, int minedad,String empresa, String motor, String[] franquicias, String dep, int juga, String[] ubi, String[] est, String[] lic, int ano) {
		super(plataformas, online, campa�a, cooperativo, fov, calificacion, minedad,empresa, motor, franquicias, dep, juga, ubi);
		this.setEs(est);
		this.setL(lic);
		this.setAl(ano);
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
		return this.A�oDeLanzamiento;
	}
	
	public void setAl(int adl) {
		this.A�oDeLanzamiento= adl;
	}
	
	@Override
	public String toString() { 
		return super.toString() + ", Estudios: "+ Arrays.toString(estudios) + ", Licencias: "+ Arrays.toString(licencias) + "A�o de lanzamiento" + A�oDeLanzamiento;
	}
}
