import java.util.Scanner;
/**
 * @author Peter
 * @version 1.0
 * */
public class Triangulo {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la medida del cateto");
		double cateto = sc.nextDouble();
		System.out.println("Introduce la medida de la hipotenusa");
		double hipotenusa = sc.nextDouble();
		double area = 0;
		obtenerAreaTriangulo(cateto, hipotenusa);
		obtenerAlturaTriangulo(cateto,hipotenusa);
		System.out.println(obtenerAreaTriangulo(cateto,hipotenusa));


	}
	public static double obtenerAreaTriangulo(double cateto, double hipotenusa){
		
		
		return  ((cateto * 2) * obtenerAlturaTriangulo(cateto,hipotenusa))/2;
	}
	public static double obtenerAlturaTriangulo(double cateto, double hipotenusa){
		
		
		return Math.sqrt((hipotenusa*hipotenusa)-(cateto*cateto));
	}
}

