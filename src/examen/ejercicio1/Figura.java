package examen.ejercicio1;
import java.awt.Color;
import java.util.Arrays;

public class Figura implements Comparable<Figura>{
	private Color color;
	private int posicionX;
	private int posicionY;
	private EstadoFigura estadoFigura= EstadoFigura.Rellena;
	
	public Figura(EstadoFigura estadoFigura, int posicionX, int posicionY) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.estadoFigura=estadoFigura;
	}
	
	public Figura(Color color, int posicionX, int posicionY) {
		super();
		this.color = color;
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}

	public Figura(int posicionX, int posicionY) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}

	public Color getColor() {
		return color;
	}

	public int getPosicionX() {
		return posicionX;
	}

	public int getPosicionY() {
		return posicionY;
	}

	public EstadoFigura getEstadoFigura() {
		return estadoFigura;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}

	public void setEstadoFigura(EstadoFigura estadoFigura) {
		this.estadoFigura = estadoFigura;
	}
	
	@Override
	public String toString() {
		return "Figura [color=" + color + ", posicionX=" + posicionX + ", posicionY=" + posicionY + ", estadoFigura="
				+ estadoFigura + "]";
	}

	public float Area() {
		float area_final = 0;
		return area_final;
	}
	
	public float Perimetro() {
		float per_final=0;
		return per_final;
	}

	@Override
	public int compareTo(Figura f) {
		if (Area()<f.Area())
			return -1;
		else if (Area()>f.Area())
			return 1;
		return 0;
	}
	
}
