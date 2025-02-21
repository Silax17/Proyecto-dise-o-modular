import java.util.Scanner;

public class Carrito {

<<<<<<< Updated upstream
=======
<<<<<<< HEAD

	public static double totalC(double[] precio,String []nom) {
		Scanner scan= new Scanner(System.in);
		Scanner scan1= new Scanner(System.in);
		String [] llista=new String[nom.length];
		String [] compra=new String[nom.length];
		double [] preu=new double[nom.length];
		String exit="si";
		int posi=0;
		double total=0;
		
		
		while(exit.equals("si")){
			
		System.out.println("Selecciona producte");
		
		for(int i=0;i<nom.length;i++) {
			System.out.println(nom[i]);
		}
		
		String producte=scan.nextLine();
		System.out.println("Cantitat");
		float cant=scan1.nextFloat();
		
		for(int i=0;i<nom.length;i++) {
			if(producte.equalsIgnoreCase(nom[i])) {
				compra[posi]=nom[i];
				llista[posi]=nom[i]+" x"+cant;
				preu[posi]= precio[i]*cant;
				total+=preu[posi];
				posi++;
				i=nom.length-1;
				
				}
			} 
			
		System.out.println("Vols seguir comprant? si/no");
		exit=scan.nextLine();
		}
		System.out.println("LLISTA DE AL COMPRA");
		for(int i=0;i<posi;i++) {
		System.out.println(llista[i]);
		}
		System.out.println(total);
		
		System.out.println("Vols treure algun element?");
		String treure= scan.nextLine();
		treure=treure.toLowerCase();
			if(treure.equals("si")) {
				System.out.println("Quina planta vols treure?");
				String elimi=scan.nextLine();
				boolean trobat=false;
				for(int i=0;i<posi;i++) {
					if(!trobat&&compra[i] !=null && compra[i].equalsIgnoreCase(elimi)) {
						total-=preu[i];
						trobat=true;
						for(int j=i; j<posi-1;j++) {
							compra[j]=compra[j+1];
							llista[j]=llista[j+1];
							preu[j]=preu[j+1];
							
						}
						posi--;
						break;
					}
				}
				if(!trobat) {
					System.out.println("Producte no trobat");
			}
				
				
				System.out.println("LLISTA FINAL ");
				for(int i=0;i<posi;i++) {
					System.out.println(llista[i]);

				}
				System.out.println("Total final:"+ total+" pokeyenes");
				}
			else if(treure.equals("no")) {
				System.out.println("No has eliminat cap producte");
				System.out.println("LLISTA FINAL");
				for(int i=0;i<posi;i++) {
					System.out.println(llista[i]);
				}
				System.out.println("Total final:"+ total+" pokeyenes");
			}
				
			
			
		
		return total;
			
	}
>>>>>>> Stashed changes
	
	
	}
	
=======
	
	
	}
	
>>>>>>> buscar


