import java.util.Scanner;

public class Buscar {
	

	public static void main(String[] args) {
		double[] precio = { 1.70, 4.20, 2.47, 1.33 };
		OrdenarMajorMenor(precio);

	}
	public static void BuscarProduNom(String[] hierba){
		
		
		
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
