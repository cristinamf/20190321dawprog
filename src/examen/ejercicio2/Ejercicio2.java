package examen.ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import examen.ejercicio1.*;

public class Ejercicio2 {

	public static void main(String[] args) throws Exception {
		List<Figura> lista = new ArrayList();
		lista.add(new Circulo(EstadoFigura.Contorno, -5, 4, 10f));
		lista.add(new Rectangulo(EstadoFigura.Rellena, 6, 10, 8f, 4f));
		lista.add(new Cuadrado(EstadoFigura.Rellena, -2, -8, 6f));
		
		
		
		mostrarLista(lista);
		
		System.out.println("Lista ordenada por area:");
		Collections.sort(lista); 
		mostrarLista(lista);
		System.out.println("Lista ordenada por area en orden inverso:");
		Collections.sort(lista, Collections.reverseOrder());
		mostrarLista(lista);
		System.out.println("Lista ordenada primero por figuras rellenas y despues por Perimetro:");
		Collections.sort(lista, new ComparatorRellenoPerimetro());
		mostrarLista(lista);
		System.out.println("Lista ordenada primero por figuras rellenas y despues por Perimetro en orden inverso:");
		Collections.sort(lista, Collections.reverseOrder(new ComparatorRellenoPerimetro()));
		mostrarLista(lista);

	}
	
	public static void mostrarLista(List<Figura> lista) {
		Iterator<Figura> i = lista.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
