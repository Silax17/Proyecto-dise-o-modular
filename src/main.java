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
		System.out.println("Buenos dias! Que quieres hacer hoy?");
		System.out.println("1.Buscar producte per nom");
		System.out.println("2.Buscar producte per origen");
		System.out.println("3.Ordenar de menor a major");
		System.out.println("4.Ordenar de major a menor");
		System.out.println("5.Fer la llista de la compra");
		System.out.println("6.Fer la llista de la compra");
		System.out.println("7.Fer la llista de la compra");
		System.out.println("8.Acabar");
		String exit="";
		String eleccio=scan.nextLine();
		while(!exit.equals("no"))
			if(eleccio.equals("1")) {
				System.out.println("Usuario selecciona buscar por nombre");
				// Codigo para buscar por nombre
			}
			else if(eleccio.equals("2")) {
				System.out.println("Usuario selecciona buscar por origen");
				lugar = "Andorra";
				// Codigo para buscar por origen
			}
		
			else if(eleccio.equals("3")) {
				System.out.println("Usuario selecciona ordenar por precio de menor a mayor");
				Buscar.OrdenarMenorMajor(precio,hierba);

			}
			else if(eleccio.equals("4")) {
				System.out.println("Usuario selecciona ordenar por precio de menor a mayor");
				Buscar.OrdenarMajorMenor(precio,hierba);

			}

			else if(eleccio.equals("5")) {
				System.out.println("Usuario selecciona varios productos para comprar");
				total=Carrito.totalC(precio,hierba);
				nombre = "Hierba de los bosques";
				cantidad = 3;

				// Codigo para seleccionar segundo producto
				nombre = "El oro verde";
				cantidad = 1;

				// Codigo para seleccionar tercer producto
				nombre = "La seta feliz";
				cantidad = 2.5;
			}
			else if(eleccio.equals("6")) {
				
			}


		
		System.out.println("Usuario elimina el segundo elemento de su carrito");
		// Codigo para eliminar elemento del carrito

		System.out.println("Usuario finaliza la compra");
		System.out.println(total);
	}
	
	//Funciones extra que considereis necesarias
}