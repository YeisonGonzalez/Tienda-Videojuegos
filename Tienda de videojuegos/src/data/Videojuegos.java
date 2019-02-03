package data;

import java.util.Arrays;

public class Videojuegos {
	private String[] plataformas;
	private boolean online;
	private boolean campaña;
	private boolean cooperativo;
	private int fov;
	private double calificacion;
	private int minedad;
	private static int numeroVideojuegos = 0;
	
	public String[] getPlataformas() {
		return plataformas;
	}
	public void setPlataformas(String[] plataformas) {
		this.plataformas = plataformas;
	}
	public boolean isOnline() {
		return online;
	}
	public void setOnline(boolean online) {
		this.online = online;
	}
	public boolean isCampaña() {
		return campaña;
	}
	public void setCampaña(boolean campaña) {
		this.campaña = campaña;
	}
	public boolean isCooperativo() {
		return cooperativo;
	}
	public void setCooperativo(boolean cooperativo) {
		this.cooperativo = cooperativo;
	}
	public int getFov() {
		return fov;
	}
	public void setFov(int fov) {
		this.fov = fov;
	}
	public double getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	public int getMinedad() {
		return minedad;
	}
	public void setMinedad(int minedad) {
		this.minedad = minedad;
	}
	
	public static int getNumeroVideojuegos() {
		return numeroVideojuegos;
	}
	public Videojuegos(String[] plataformas, boolean online, boolean campaña, boolean cooperativo, int fov,
			double calificacion, int minedad) {
		super();
		this.plataformas = plataformas;
		this.online = online;
		this.campaña = campaña;
		this.cooperativo = cooperativo;
		this.fov = fov;
		this.calificacion = calificacion;
		this.minedad = minedad;
		numeroVideojuegos++;
	}
	@Override
	public String toString() {
		return "plataformas" + Arrays.toString(plataformas) + "online=" + online + "campaña="
				+ campaña + "cooperativo=" + cooperativo + "fov=" + fov + "calificacion=" + calificacion
				+ "minedad=" + minedad;
	}
	
	

	
	

}
