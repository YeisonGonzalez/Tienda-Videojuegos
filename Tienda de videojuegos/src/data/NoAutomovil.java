package data;

import java.util.Arrays;

public class NoAutomovil extends Carreras{
	private int copas;
	private	String[] objetos;
	private	String[] TiposDeVehiculos;
	
	public NoAutomovil(String empresa, String motor, String[] franquicias, String[] map, boolean nit, String[] tip, int cop, String[] obj, String[] vehi ) {
		super( empresa,  motor, franquicias, map, nit, tip);
		this.setC(cop);
		this.setObs(obj);
		this.setTi(vehi);
	}
	
	public int getC() {
		return this.copas;
	}
	public void setC(int cop) {
		this.copas= cop;
	}
	
	public String[] getObs() {
		return this.objetos;
	}
	public void setObs(String[] ob) {
		this.objetos= ob;
	}
	
	public String[] getTi() {
		return this.TiposDeVehiculos;
	}
	public void setTi(String[] tdv) {
		this.TiposDeVehiculos= tdv;
	}
	
	@Override
	public String toString() { 
		return super.toString()+ ", Copas: " + copas + ", Objetos: " + Arrays.toString(objetos) + ", Tipos de vehiculos: "+ Arrays.toString(TiposDeVehiculos);
	}
}
