package ecuacion;
import java.util.Scanner;

public class Ecuacion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c1, c2, x;
		
		System.out.println("Soy un programa para resolver la siguiente ecuación: \nc1x + c2 = 0");
		System.out.println("Donde c1 y c2 son coeficientes que me debes dar tú.");
		System.out.print("c1 = ");
		c1 = sc.nextShort();
		System.out.print("c2 = ");
		c2 = sc.nextShort();
		
		// c1x + c2 = 0;
		x = (~(c2 - 1)) / c1;
		System.out.println(x);
		
	}

}
