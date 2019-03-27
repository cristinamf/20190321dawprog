package examen.ejercicio4;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio4 {
	public static void main(String[] args) throws Exception {
		HashMap<String, String> agenda= new HashMap<String, String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Entrada: ");
		String n=sc.nextLine();
		Pattern p=Pattern.compile("\\s*buscar\\s*|\\s*fin\\s*$|\\s*(\\w+\\s*)+");
		Matcher m=p.matcher(n);
		
		boolean fin=false;
		String token;
		while(!fin) {
			int estado=0;
			switch(estado) {
			case 0:
				try {
					
				}catch{
					
				}
			
				break;
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			}
			
		}
		
		
		
		
		
		
//		if (m.find()) {
//			p=Pattern.compile("\\s*fin\\s*$");
//			m=p.matcher(n);
//			do {
//				p=Pattern.compile("\\s*(\\w+\\s*)+");
//				m=p.matcher(n);
//				if (m.find()) {
//					if(!agenda.containsKey(nombre)) {
//						agenda.put(nombre, nombre);
//						agenda.put(telefono, telefono);
//					}
//					else if(agenda.containsKey(nombre)) {
//				//		agenda.replace(telefono, telefono, telefono);
//						agenda.remove(telefono);
//						agenda.put(telefono, telefono);
//					}
//					else {
//						throw new Exception ("Se ha introducido mal. Tiene que ser nombre-telefono");
//					}
//				}
//				p=Pattern.compile("\\s*buscar\\s*");
//				m=p.matcher(n);
//				if (m.find()) {
//					if(agenda.containsValue(nombre)) 
//						System.out.println(nombre+"->"+agenda.get(telefono));
//					else
//						System.out.println
//						("Salida: "+nombre+" no se encuentra en la agenda");
//				}
//				else {
//					throw new Exception ("Se ha introducido mal. Tiene que ser nombre-telefono o buscar:nombre");
//				}
//			}while (m.find());
//		}
//		else
//			throw new Exception("No se ha introducido bien.");
	}
}
