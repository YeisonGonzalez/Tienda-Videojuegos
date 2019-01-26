package data;

import java.util.Arrays;

public class Seccionado extends MundoAbierto{
	private String[] NombreDeLasSecciones;
	private int TotalDeMisiones;
	private int CantidadDeMapas;
	
	public Seccionado(String empresa,String motor,String[] franquicias,double tama�o, int edificos,int poblacion,String[] secciones,int misiones,int mapas ) {
		super(empresa, motor, franquicias, tama�o,edificos, poblacion);
		this.setN(secciones);
		this.setTot(misiones);
		this.setC(mapas);
	}
	
	public String[] getN() {
		return this.NombreDeLasSecciones;
	}
	public void setN(String[] nds) {
		this.NombreDeLasSecciones= nds;
	}
	
	public int getTot() {
		return this.TotalDeMisiones;
	}
	
	public void setTot(int tdm) {
		this.TotalDeMisiones= tdm;
	}
	
	public int getC() {
		return this.CantidadDeMapas;
	}
	
	public void setC(int cdm) {
		this.CantidadDeMapas= cdm;
	}
	
	@Override
	public String toString() { 
		return super.toString() + ", Secciones: " + Arrays.toString(NombreDeLasSecciones) + "Misiones: " + TotalDeMisiones + "Cantidad de mapas: " + CantidadDeMapas;
	}
}
