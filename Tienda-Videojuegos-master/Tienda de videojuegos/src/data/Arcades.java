package data;

public class Arcades extends indies {

	private int niveles;
	private String visualizacion;
	private int Objetos;
	private static int numeroArcades = 0;
	
	
	public int getNiveles() {
		return niveles;
	}
	public void setNiveles(int niveles) {
		this.niveles = niveles;
	}
	public String getVisualizacion() {
		return visualizacion;
	}
	public void setVisualizacion(String visualizacion) {
		this.visualizacion = visualizacion;
	}
	public int getObjetos() {
		return Objetos;
	}
	public void setObjetos(int objetos) {
		this.Objetos = objetos;
	}
	
	public static int getNumeroArcades() {
		return numeroArcades;
	}
	
	public Arcades(String[] plataformas, boolean online, boolean campaña, boolean cooperativo, int fov,
			double calificacion, int minedad, int integrantes, int inversion, String ludonarratividad, int niveles,
			
			String visualizacion, int objetos) {
		super(plataformas, online, campaña, cooperativo, fov, calificacion, minedad, integrantes, inversion,
				ludonarratividad);
		this.niveles = niveles;
		this.visualizacion = visualizacion;
		this.Objetos = objetos;
		numeroArcades++;
	}
	@Override
	public String toString() {
		return super.toString()+"niveles=" + niveles + "visualizacion=" + visualizacion + "Objetos=" + Objetos ;
	}
	
	
	
	

}
