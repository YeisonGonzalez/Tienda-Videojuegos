package data;

import java.util.Arrays;

public class OneVsOne extends Lucha{
	private double SimetriaDeCondiciones;
	private String[] habilidades;
	private String metodologia;
	private static int numeroOneVSOne = 0;
	
	public OneVsOne(String[] plataformas, boolean online, boolean campaña, boolean cooperativo, int fov,
			double calificacion, int minedad,String empresa, String motor, String[] franquicias, int pers, int lug, String[] reg, double sim, String[] hab, String met) {
		super(plataformas, online, campaña, cooperativo, fov, calificacion, minedad,empresa, motor, franquicias, pers, lug, reg);
		this.setS(sim);
		this.setH(hab);
		this.setMe(met);
		numeroOneVSOne++;
	}
	
	public static int getNumeroOneVSOne() {
		return numeroOneVSOne;
	}

	public double getS() {
		return this.SimetriaDeCondiciones;
	}
	public void setS(double si) {
		this.SimetriaDeCondiciones= si;
	}
	
	public String[] getH() {
		return this.habilidades;
	}
	public void setH(String[] habil) {
		this.habilidades= habil;
	}
	
	public String getMe() {
		return this.metodologia;
	}
	public void setMe(String me) {
		this.metodologia= me;
	}
	
	@Override
	public String toString() { 
		return super.toString() + ", Simetria de condiciones: " + SimetriaDeCondiciones + ", Habilidades: "+ Arrays.toString(habilidades) + ", Metodologia: " + metodologia;
	}
}
