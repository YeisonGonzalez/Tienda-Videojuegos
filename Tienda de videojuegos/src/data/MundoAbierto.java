package data;

public class MundoAbierto extends AAA{
	private double TamanoDeMapa;
	private int edificios;
	private int poblacion;
	
	public MundoAbierto(String[] plataformas, boolean online, boolean campaña, boolean cooperativo, int fov,
			double calificacion, int minedad,String emp, String mot, String[] franq, double mapa,  int edif, int pobla) {
		super(plataformas, online, campaña, cooperativo, fov, calificacion, minedad, emp, mot, franq);
		this.setT(mapa);
		this.setEd(edif);
		this.setPo(pobla);
	}
	
	public double getT() {
		return this.TamanoDeMapa;
	}
	public void setT(double tama) {
		this.TamanoDeMapa= tama;
	}
	
	public int getEd() {
		return this.edificios;
	}
	
	public void setEd(int edif) {
		this.edificios= edif;
	}
	
	public int getPo() {
		return this.poblacion;
	}
	
	public void setPo(int pobla) {
		this.poblacion= pobla;
	}
	
	@Override
	public String toString() { 
		return super.toString()+ ", Tamaño de mapa: " + TamanoDeMapa + ", Edificios: " + edificios + ", Poblacion: " + poblacion;
	}
}
