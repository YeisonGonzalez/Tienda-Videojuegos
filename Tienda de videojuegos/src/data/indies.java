package data;

public class indies extends Videojuegos {
	
	private int integrantes;
	private int inversion;
	private String ludonarratividad;
	private static int numeroIndies = 0;
	
	public int getIntegrantes() {
		return integrantes;
	}
	public void setIntegrantes(int integrantes) {
		this.integrantes = integrantes;
	}
	public int getInversion() {
		return inversion;
	}
	public void setInversion(int inversion) {
		this.inversion = inversion;
	}
	public String getLudonarratividad() {
		return ludonarratividad;
	}
	public void setLudonarratividad(String ludonarratividad) {
		this.ludonarratividad = ludonarratividad;
	}
	
	public static int getNumeroIndies() {
		return numeroIndies;
	}

	public indies(String[] plataformas, boolean online, boolean campaña, boolean cooperativo, int fov,
			double calificacion, int minedad, int integrantes, int inversion, String ludonarratividad) {
		super(plataformas, online, campaña, cooperativo, fov, calificacion, minedad);
		this.integrantes = integrantes;
		this.inversion = inversion;
		this.ludonarratividad = ludonarratividad;
		numeroIndies++;
	}
	@Override
	public String toString() {
		return super.toString()+"integrantes=" + integrantes + "inversion=" + inversion + "ludonarratividad="
				+ ludonarratividad;
	}
	
	
		

	
}
