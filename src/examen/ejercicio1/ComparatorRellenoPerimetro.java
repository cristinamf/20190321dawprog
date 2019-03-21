package examen.ejercicio1;

import java.util.Comparator;

public class ComparatorRellenoPerimetro implements Comparator<Figura>{

	@Override
	public int compare(Figura f1, Figura f2) {
		if (f1.getEstadoFigura().equals(EstadoFigura.Rellena) && f1.getEstadoFigura()!=f2.getEstadoFigura())
			return -1;
		else if (f2.getEstadoFigura().equals(EstadoFigura.Rellena) && f1.getEstadoFigura()!=f2.getEstadoFigura())
			return 1;
		else {
			if(f1.Perimetro()<f2.Perimetro())
				return -1;
			else if(f1.Perimetro()>f2.Perimetro())
				return 1;
			else 
				return 0;
		}
	}

}
