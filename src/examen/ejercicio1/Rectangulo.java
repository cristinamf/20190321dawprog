package examen.ejercicio1;

import java.awt.Color;

public class Rectangulo extends Figura{
	private float longBase;
	private float longAltura;
	
	public Rectangulo(EstadoFigura estadoFigura, int posicionX, int posicionY, float longBase, float longAltura) {
		super(estadoFigura, posicionY, posicionX);
		this.longBase=longBase;
		this.longAltura=longAltura;
	}

	public float getLongBase() {
		return longBase;
	}

	public void setLongBase(float longBase) {
		this.longBase = longBase;
	}

	public float getLongAltura() {
		return longAltura;
	}

	public void setLongAltura(float longAltura) {
		this.longAltura = longAltura;
	}

	@Override
	public String toString() {
		return super.toString()+"Rectangulo [longBase=" + longBase + ", longAltura=" + longAltura + "]";
	}
	
	@Override
	public float Area() {
		float area_final=super.Area();
		area_final=(float) (longBase*longAltura);
		return area_final;
	}
	
	@Override
	public float Perimetro() {
		float per_final=super.Perimetro();
		per_final=(float)(2*(longBase+longAltura));
		return per_final;
	}
	
}
