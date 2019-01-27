package data;

import java.util.Arrays;

public class OneVsAll extends Lucha{
	
	private int enemigos;
	private double simetria;
	private String[] armas;
	
	public OneVsAll(String[] plataformas, boolean online, boolean campa�a, boolean cooperativo, int fov,
			double calificacion, int minedad,String emp, String mot, String[] franq, int pers, int luga, String[] regl, int ene, double sim, String[] arm) {
		super(plataformas, online, campa�a, cooperativo, fov, calificacion, minedad,emp, mot, franq, pers, luga, regl);
		this.setEn(ene);
		this.setSi(sim);
		this.setA(arm);
	}
	public int getEn() {
		return this.enemigos;
	}
	public void setEn(int en) {
		this.enemigos= en;
	}
	
	public double getSi() {
		return this.simetria;
	}
	public void setSi(double si) {
		this.simetria= si;
	}
	
	public String[] getA() {
		return this.armas;
	}
	public void setA(String[] ar) {
		this.armas= ar;
	}
	
	@Override
	public String toString() { 
		return super.toString()+ ", Enemigos: " + enemigos + ", Simetria: " + simetria + ", Armas: " + Arrays.toString(armas) ;
	}
}
