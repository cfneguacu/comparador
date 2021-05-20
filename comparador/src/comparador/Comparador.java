package comparador;

public class Comparador {

	public static void main(String[] args) {
		
		String string1 = "Too ";
		String string2 = "Many Strings";
		String string3 = "Too Many Strings";
		
		string1+=string2;
		String string4 = string1;
		
		System.out.println(string1);
		System.out.println(string4);
		
		if (string1==string3) {
			System.out.println("Verdadeiro");
		}else {
			System.out.println("Falso");
		}
		
		
		if (string1==string4) {
			System.out.println("Verdadeiro");
		}else {
			System.out.println("Falso");
		}
		
		if (string1.equals(string3)) {
			System.out.println("Verdadeiro");
		}else {
			System.out.println("Falso");
		}
		
		if (string1.equals(string4)) {
			System.out.println("Verdadeiro");
		}else {
			System.out.println("Falso");
		}
		
		
	}

}
