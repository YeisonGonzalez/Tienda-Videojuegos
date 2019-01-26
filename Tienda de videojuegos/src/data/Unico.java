package data;

import java.util.Arrays;

public class Unico extends MundoAbierto{
	private String[] territorios;
	private int secundarias;
	private String[] coleccionables;
	
	public Unico(String empresa, String motor, String[] franquicias, double tamaño, int edificos, int poblacion, String[] territorios, int secundaria, String[] coleccionables ) {
		super(empresa, motor, franquicias, tamaño,edificos, poblacion);
		this.setTer(territorios);
		this.setSec(secundaria);
		this.setCo(coleccionables);
	}
	
	public String[] getTer() {
		return this.territorios;
	}
	public void setTer(String[] terri) {
		this.territorios= terri;
	}
	
	public int getSec() {
		return this.secundarias;
	}
	
	public void setSec(int se) {
		this.secundarias= se;
	}
	
	public String[] getCo() {
		return this.coleccionables;
	}
	public void setCo(String[] cole) {
		this.coleccionables= cole;
	}
	
	@Override
	public String toString() { 
		return super.toString() + ", Territorios: " + Arrays.toString(territorios) +  ", Total de misiones secundarias: " + secundarias + Arrays.toString(coleccionables);
	}
	
}
