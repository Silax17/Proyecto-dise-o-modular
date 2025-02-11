import java.util.Scanner;

public class Buscar {
	

	public static String BuscarProduNom(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Introduzca nombre");
		String nom="";
		nom=scan.nextLine().toLowerCase();
		for(int i=0;i<main.hierba.length;i++) {
			main.hierba[i]=main.hierba[i].toLowerCase();
			if(main.hierba[i].contains(nom)) {
				String planta=main.hierba[i];
				return "Planta trobada "+planta;
			}
		}
		
		return "Planta no trobada";
	}
	public static String BuscarProduOri(String[] origen) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Introduzca nombre");
		String nom="";
		nom=scan.nextLine();
		for(int i=0;i<origen.length;i++) {
			if(origen[i].equals(nom)) {
				String ori=origen[i];
				return ori;
			}
		}
		return "Pais no trobat";
	}

	public static void OrdenarMajorMenor(double[] precio) {
		for(int i=0;i<precio.length;i++) {
			for(int j=i+1;j<precio.length;j++) {
				if(precio[i]<precio[j]) {
					double doble=precio[i];
					precio[i]=precio[j];
					precio[j]=doble;
				}
			}
			System.out.println(precio[i]);	
		}
	}
	
	public static void OrdenarMenorMajor(double[] precio) {
		
		for(int i=0;i<precio.length;i++) {
			for(int j=i+1;j<precio.length;j++) {
				if(precio[i]>precio[j]) {
					double doble=precio[i];
					precio[i]=precio[j];
					precio[j]=doble;
				}
			}
			System.out.println(precio[i]);
			
		}
		
	}

}
