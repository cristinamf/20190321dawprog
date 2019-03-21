package examen.ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		List <String> agenda=new ArrayList <String>();
		Scanner sc=new Scanner(System.in);
		String n = null;
		do{
			System.out.println("Entrada: ");
			n=sc.nextLine();
			String buscar="buscar:";
			String[] divisionAgenda = n.split("-");
			String nombre = divisionAgenda[0]; // 123
			String telefono = divisionAgenda[1]; // 654321
			if(n!="fin") {
				if(!agenda.contains(n))
					agenda.add(n);
				else if(agenda.contains(nombre))
					agenda.set(divisionAgenda.length+1,telefono);
			}
				
			
		}while (n.equalsIgnoreCase("fin")==false);
	}

}
