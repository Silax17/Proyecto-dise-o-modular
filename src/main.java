import java.util.Scanner;

public class main {
	public static String[] hierba = { "Maria Juana", "Hierba de los bosques", "La seta feliz", "El oro verde" };
	public static String[] origen = { "Mexico", "Andorra", "Marrueco", "Palestina" };
	public static double[] precio = { 1.70, 4.20, 2.47, 1.33 };

	// Variables publicas extra que considereis

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String nombre, lugar;
		double cantidad;
		double total;
		String exit="";
		String eleccio="";
		System.out.println("Buenos dias! Que quieres hacer hoy?");
		exit=exit.toLowerCase();
		while(!exit.equals("no")) {
		System.out.println("1.Buscar producte per nom");
		System.out.println("2.Buscar producte per origen");
		System.out.println("3.Ordenar de menor a major");
		System.out.println("4.Ordenar de major a menor");
		System.out.println("5.Fer la llista de la compra");
		System.out.println("6.Sortir");
		 eleccio=scan.nextLine();
			if(eleccio.equals("1")) {
				System.out.println("Usuario selecciona buscar por nombre");
				String nom=Buscar.BuscarProduNom(hierba);
				System.out.println(nom);
				System.out.println("Vols seguir?");
				exit=scan.nextLine();
				exit=exit.toLowerCase();
			}
			else if(eleccio.equals("2")) {
				System.out.println("Usuario selecciona buscar por origen");
				String ori=Buscar.BuscarProduOri(origen, hierba);
				System.out.println(ori);
				System.out.println("Vols seguir?");
				exit=scan.nextLine();
				exit=exit.toLowerCase();
				
			}
		
			else if(eleccio.equals("3")) {
				System.out.println("Usuario selecciona ordenar por precio de menor a mayor");
				Buscar.OrdenarMenorMajor(precio,hierba);
				System.out.println("Vols seguir?");
				exit=scan.nextLine();
				exit=exit.toLowerCase();

			}
			else if(eleccio.equals("4")) {
				System.out.println("Usuario selecciona ordenar por precio de menor a mayor");
				Buscar.OrdenarMajorMenor(precio,hierba);
				System.out.println("Vols seguir?");
				exit=scan.nextLine();
				exit=exit.toLowerCase();

			}

			else if(eleccio.equals("5")) {
				double compra=Carrito.totalC(precio, hierba);
				System.out.println("Vols seguir?");
				exit=scan.nextLine();
				exit=exit.toLowerCase();
				
			}
			else if(eleccio.equals("6")) {
				System.out.println("Surtint del programa");
				exit="no";
				
			}
			else if(eleccio.equals("no")) {
				System.out.println("Surtint del programa");
				exit="no";
			}
			else {
				System.out.println("Opcio no valida torna a elegir");
			}
		}

		System.out.println("Usuari finalitza la compra");
		System.out.println("GRACIES PER COMPRAR ");
		
	
	}
	//Funciones extra que considereis necesarias
}