package data;

import java.util.Arrays;

public class AAA {
	private String empresa;
	private String motor;
	private String[] franquicias;
	
	public AAA(String emp, String mot, String[] franq ) {
		this.setE(emp);
		this.setM(mot);
		this.setF(franq);
	}
	
	
	public String getE() {
		return this.empresa;
	}
	public void setE(String empr) {
		this.empresa= empr;
	}
	
	public String getM() {
		return this.motor;
	}
	public void setM(String mot) {
		this.motor= mot;
	}
	
	public String[] getF() {
		return this.franquicias;
	}
	public void setF(String[] franq) {
		this.franquicias= franq;
	}
	
	@Override
	public String toString() { 
		return "Empresa:" + empresa + ", Motor gráfico: " + motor + ", Franquicias: " + Arrays.toString(franquicias);
	}
}
