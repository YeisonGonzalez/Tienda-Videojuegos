package data;

import java.util.Arrays;

public class militar extends estrategia {
	private String[] armamento;
	private String[] unidades;
	private String[] campamentos;
	
	
	public String[] getArmamento() {
		return armamento;
	}
	public void setArmamento(String[] armamento) {
		this.armamento = armamento;
	}
	public String[] getUnidades() {
		return unidades;
	}
	public void setUnidades(String[] unidades) {
		this.unidades = unidades;
	}
	public String[] getCampamentos() {
		return campamentos;
	}
	public void setCampamentos(String[] campamentos) {
		this.campamentos = campamentos;
	}
	public militar(String[] plataformas, boolean online, boolean campaña, boolean cooperativo, int fov,
			double calificacion, int minedad, int integrantes, int inversion, String ludonarratividad,
			String[] parametros, String[] mapas, String[] recursos, String[] armamento, String[] unidades,
			String[] campamentos) {
		super(plataformas, online, campaña, cooperativo, fov, calificacion, minedad, integrantes, inversion,
				ludonarratividad, parametros, mapas, recursos);
		this.armamento = armamento;
		this.unidades = unidades;
		this.campamentos = campamentos;
	}
	@Override
	public String toString() {
		return super.toString()+"armamento=" + Arrays.toString(armamento) + "unidades=" + Arrays.toString(unidades)
				+ "campamentos=" + Arrays.toString(campamentos);
	}
	
	
}
