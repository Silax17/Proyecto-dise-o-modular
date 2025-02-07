import java.util.Scanner;

public class Buscar {
	

	public static void main(String[] args) {
		double[] precio = { 1.70, 4.20, 2.47, 1.33 };
		String[] hierba = { "Maria Juana", "Hierba de los bosques", "La seta feliz", "El oro verde" };
		System.out.println(BuscarProduNom(hierba));
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
