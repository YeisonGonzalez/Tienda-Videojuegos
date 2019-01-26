package data;

import java.util.Arrays;

public class Lucha extends AAA {
	private int personajes;
	private int lugares;
	private String[] reglas;
	
	public Lucha(String emp, String mot, String[] franq, int pers, int luga, String[] regl) {
		super(emp, mot, franq);
		this.setP(pers);
		this.setL(luga);
		this.setR(regl);
	}
	
	public int getP() {
		return this.personajes;
	}
	public void setP(int pers) {
		this.personajes= pers;
	}
	
	public int getL() {
		return this.lugares;
	}
	public void setL(int lug) {
		this.lugares= lug;
	}
	
	public String[] getR() {
		return this.reglas;
	}
	public void setR(String[] reg) {
		this.reglas= reg;
	}
	
	@Override
	public String toString() { 
		return super.toString()+ ", Personajes: " + personajes + ", Lugares" + lugares + ", Reglas: " + Arrays.toString(reglas);
	}
}
