import java.util.Scanner;

public class Buscar {
	

	public static void main(String[] args) {
		double[] precio = { 1.70, 4.20, 2.47, 1.33 };
		String[] hierba = { "Maria Juana", "Hierba de los bosques", "La seta feliz", "El oro verde" };
		String[] origen = { "Mexico", "Andorra", "Marrueco", "Palestina" };
		OrdenarMajorMenor(precio, hierba);
		OrdenarMenorMajor(precio, hierba);
	}
	public static String BuscarProduNom(String[] hierba){
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
			System.out.println(hierba[i]+" : "+precio[i]+" Pokéyenes");
		}
	}
	
	public static void OrdenarMenorMajor(double[] precio,String[]hierba) {
		
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
			System.out.println(hierba[i]+" : "+precio[i]+" Pokéyenes");
		}
		
	}

}
