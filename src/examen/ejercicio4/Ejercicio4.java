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
			if(n!="fin") {
				if(!agenda.contains(n))
					agenda.add(n);
			}
				
			
		}while (n.equalsIgnoreCase("fin")==false);
	}

}
