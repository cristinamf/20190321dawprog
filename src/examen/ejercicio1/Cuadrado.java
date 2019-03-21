package examen.ejercicio1;

import java.awt.Color;

public class Cuadrado extends Figura{
	private float longLado;
	
	public Cuadrado(EstadoFigura estadoFigura, int posicionX, int posicionY, float longLado) {
		super(estadoFigura, posicionY, posicionX);
		this.longLado=longLado;
	}

	public float getLongLado() {
		return longLado;
	}

	public void setLongLado(float longLado) {
		this.longLado = longLado;
	}

	@Override
	public String toString() {
		return super.toString()+"Cuadrado [longLado=" + longLado + "]";
	}

	@Override
	public float Area() {
		float area_final=super.Area();
		area_final=(float) (longLado*longLado);
		return area_final;
	}
	
	@Override
	public float Perimetro() {
		float per_final=super.Perimetro();
		per_final=(float)(4*longLado);
		return per_final;
	}
	
}
