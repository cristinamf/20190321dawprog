package examen.ejercicio3;

import java.util.*;

public class Ejercicio3 {
	
	private static Map<String, String> compuestos = new HashMap<>();

	public static String compuestosQuimicosUnicos(String s) {
		String n = compuestos.get(s);
		if (n != null)
			return n;
		else {
			Set<Character> unicas = new HashSet<>();
			Set<Character> repetidas = new HashSet<>();
			for (char c: s.toCharArray()) {
				if (!repetidas.contains(c) && !unicas.add(c)) {
					unicas.remove(c);
					repetidas.add(c);
				}
			}
			n = unicas.toString();
			compuestos.put(s, n);
			return n;

		}

	}

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Introduce el numero de elementos: ");
				int x=sc.nextInt();
				int cont=0;
				do {
					System.out.println();
					String c=sc.nextLine();
					cont++;
				}while(cont<=x);
	}
}


