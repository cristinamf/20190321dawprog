package examen.ejercicio1;

import java.awt.Color;

public class Circulo extends Figura{
	private float radio;
	
	public Circulo(EstadoFigura estadoFigura, int posicionX, int posicionY, float radio) {
		super(estadoFigura, posicionY, posicionX);
		this.radio=radio;
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return super.toString()+"Circulo [radio=" + radio + "]";
	}
	
	@Override
	public float Area() {
		float area_final=super.Area();
		area_final=(float) (Math.PI*radio*radio);
		return area_final;
	}
	
	@Override
	public float Perimetro() {
		float per_final=super.Perimetro();
		per_final=(float)(2*Math.PI*radio);
		return per_final;
	}
}
