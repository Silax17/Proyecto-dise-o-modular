import java.util.Scanner;

public class Carrito {
	public static void main(String args[]) {
		 String[] hierba = { "Maria Juana", "Hierba de los bosques", "La seta feliz", "El oro verde" };
		 String[] origen = { "Mexico", "Andorra", "Marrueco", "Palestina" };
		 double[] precio = { 1.70, 4.20, 2.47, 1.33 };
		 double res=totalC(precio,hierba);
	}


	public static double totalC(double[] precio,String []nom) {
		Scanner scan= new Scanner(System.in);
		Scanner scan1= new Scanner(System.in);
		String [] llista=new String[nom.length];
		String exit="si";
		int posi=0;
		double total=0;
		String compra="";
		while(exit.equals("si")){
		System.out.println("Selecciona producte");
		
		for(int i=0;i<nom.length;i++) {
			System.out.println(nom[i]);
		}
		
		String producte=scan.nextLine();
		System.out.println("Cantitat");
		float cant=scan1.nextFloat();
		
		for(int i=0;i<nom.length;i++) {
			if(producte.equals(nom[i])) {
				llista[posi]=nom[i];
				total += precio[i]*cant;
				posi++;
				compra += nom[i]+" x"+cant;
				i=nom.length-1;
				
				}
			} 
			
		System.out.println("Vols seguir comprant? si/no");
		exit=scan.nextLine();
		}
		System.out.println("LLISTA DE AL COMPRA");
		System.out.println(compra);
		System.out.println(total);
		return total;
	}
	
		
		
	}
	


