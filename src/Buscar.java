import java.util.Scanner;

public class Buscar {
	

	public static String BuscarProduNom(String[]hierba){
		Scanner scan=new Scanner(System.in);
		System.out.println("Introduzca nombre");
		String nom="";
		nom=scan.nextLine().toLowerCase();
		for(int i=0;i<hierba.length;i++) {
			hierba[i]=hierba[i].toLowerCase();
			if(hierba[i].contains(nom)) {
				String planta=hierba[i];
				return "Planta trobada "+planta;
			}
		}
		
		return "Planta no trobada";
	}
	public static String BuscarProduOri(String[] origen,String[]hierba) {
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<origen.length;i++) {
			System.out.println(origen[i]);
			
		}
		
		System.out.println("Introduzca nombre");
		String nom="";
		nom=scan.nextLine();
		for(int i=0;i<origen.length;i++) {
			if(origen[i].equals(nom)) {
				String ori=hierba[i];
				return ori;
			}
		}
		return "Pais no trobat";
	}

	public static void OrdenarMajorMenor(double[] precio,String[] hierba) {
		for(int i=0;i<precio.length;i++) {
			for(int j=i+1;j<precio.length;j++) {
				if(precio[i]<precio[j]) {
					double doble=precio[i];
					precio[i]=precio[j];
					precio[j]=doble;
					
					String orde=hierba[i];
					hierba[i]=hierba[j];
					hierba[j]=orde;
						
				}
			}
			System.out.println(hierba[i]+" : "+precio[i]+" pokeyenes");
		}
	}
	
	public static void OrdenarMenorMajor(double[] precio,String[] hierba) {
		
		for(int i=0;i<precio.length;i++) {
			for(int j=i+1;j<precio.length;j++) {
				if(precio[i]>precio[j]) {
					double doble=precio[i];
					precio[i]=precio[j];
					precio[j]=doble;
					String orde=hierba[i];
					hierba[i]=hierba[j];
					hierba[j]=orde;
				}
			}
			System.out.println(hierba[i]+" : "+precio[i]+" pokeyenes");
			
		}
		
	}

}