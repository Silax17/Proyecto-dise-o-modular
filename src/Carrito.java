import java.util.Scanner;

public class Carrito {


	public static double total(double[] precio,String []nom) {
		Scanner scan= new Scanner(System.in);
		Scanner scan1= new Scanner(System.in);
		String [] llista=new String[nom.length];
		System.out.println("Selecciona producte");
		String producte=scan.nextLine();
		System.out.println("Cantitat");
		double cant=scan1.nextDouble();
		int posi=0;
		for(int i=0;i<nom.length;i++) {
			if(producte.equals(nom[i])) {
				llista[posi]=nom[i];
				double total=+precio[i]*cant;
				
			}
		}
		
		
	}
		
		
	}
	


