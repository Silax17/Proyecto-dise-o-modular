import java.util.Scanner;

public class Carrito {


	public static double totalC(double[] precio,String []nom) {
		Scanner scan= new Scanner(System.in);
		Scanner scan1= new Scanner(System.in);
		String [] llista=new String[nom.length];
		String exit="si";
		int posi=0;
		double total=0;
		while(exit.equals("si")){
		System.out.println("Selecciona producte");
		String producte=scan.nextLine();
		System.out.println("Cantitat");
		float cant=scan1.nextFloat();
		for(int i=0;i<nom.length;i++) {
			if(producte.equals(nom[i])) {
				llista[posi]=nom[i];
				total =+ precio[i]*cant;
				posi++;
				i=nom.length;
			} 
			System.out.println("LISTA DE LA COMPRA");
			System.out.println(nom[i]+" x"+cant);
			}
		
		}
		
		
	}
		
		
	}
	


