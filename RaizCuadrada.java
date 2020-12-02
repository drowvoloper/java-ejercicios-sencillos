package raizCuadrada;
import java.util.Scanner;
import java.text.DecimalFormat;


public class RaizCuadrada {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat(".##");
		
		System.out.println("Puedo calcular raíces cuadradas por ti.");
		System.out.print("Dame un número: ");
		int num = sc.nextInt();
		
		System.out.println("La raíz cuadrada de " + num + " es " + df.format(Math.sqrt(num)));
		
		sc.close();
	}
}
