package variosTipos;
import java.util.Scanner;

public class VariosTipos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String casado = "";
		String diaSemana = "";
		String[] diasDeLaSemana = { "lunes", "martes", "miércoles", "miercoles", "jueves", "viernes", "sábado", "sabado", "domingo" };
		short diaDelAnio;
		String sexo = "";
		long milisegundos;
		int factura;
		long poblacion;
		
		while (casado.compareTo("sí") != 0 && 
				casado.compareTo("si") != 0 && 
				casado.compareTo("no") != 0) {
			System.out.println("¿Te has casado? ");
			casado = sc.nextLine().toLowerCase();
		}
		
		while (diaSemana == "") {
			System.out.println("¿Qué día de la semana es hoy? ");
			diaSemana = sc.nextLine().toLowerCase();
			boolean encontrado = false;
			
			for (int i = 0; i < diasDeLaSemana.length; i++) {
				if (diaSemana.compareTo(diasDeLaSemana[i]) == 0) {
					encontrado = true;
				}
			}
			
			if (encontrado != true) {
				diaSemana = "";
			}
		}
		
		System.out.println("¿Qué día del año es hoy? ");
		diaDelAnio = sc.nextShort();
		
		while (sexo.compareTo("m") != 0 && sexo.compareTo("f") != 0) {
			System.out.println("¿Cuál es tu sexo? ");
			sexo = sc.next().toLowerCase();
		}
		
		System.out.println("¿Cuántos milisegundos han pasado desde 01/01/1970 hasta ahora? ");
		milisegundos = sc.nextLong();
		
		System.out.println("Introduce el total de tu factura: ");
		factura = sc.nextInt();
		
		System.out.println("¿Cuántas personas hay viviendo en la Tierra? ");
		poblacion = sc.nextLong();
		
		System.out.println("####### Tus Respuestas #######");
		
		if (casado.compareTo("no") == 0) {
			System.out.println("No te has casado.");
		} else {
			System.out.println("Te has casado.");
		}
		
		System.out.println("Hoy es " + diaSemana + " y el día nº " + diaDelAnio + " del año.");
		
		if (sexo.compareTo("m") == 0) {
			System.out.println("Tu sexo es masculino.");
		} else {
			System.out.println("Tu sexo es femenino.");
		}
		
		System.out.println("Han pasado " + milisegundos + " milisegundos desde 01/01/1970.");
		
		System.out.println("Tu factura asciende a " + factura + " bellotas.");
		
		System.out.println("Y hay " + poblacion + " personas viviendo en el planeta.");
		
		
		sc.close();
	}

}
