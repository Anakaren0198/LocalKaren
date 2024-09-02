import java.util.Scanner;

public class Votos {

	public static void main(String[] args)throws java.io.IOException {
		// TODO Auto-generated method stub

		
		
		 Scanner teclado = new Scanner(System.in);
		    System.out.println("NUMERO DE CANDIDATOS: ");
		    int num_candidatos = teclado.nextInt(); //Aqu� especifico el espacio de la array candidatos

		    System.out.println("NUMERO DE VOTANTES:");
		    int total_votantes = teclado.nextInt(); //Aqu� especifico el espacio de la array votos

		    int voto_user; //Voto de cada user

		    int[] candidatos = new int[num_candidatos]; // Num de Candidatos

		    int[] votos = new int[total_votantes]; // Num de personas que votan


		    for (int i = 0; i < votos.length; i++) { //tienes que compararlo con el numero de votantes, para que repita la accion esa cantidad de veces

		        do {
		            int indice = i + 1;
		            System.out.println("Votante " + indice + ", entra tu voto (1-" + num_candidatos + "):");

		            // Aqu� tenemos el voto del votante
		            voto_user = teclado.nextInt();

		            if (voto_user > num_candidatos) {
		                System.out.println("Voto inv�lido.");
		            }
		            else {
		                candidatos[voto_user-1]++;
		            }
		        } while (voto_user > num_candidatos);
		    }
		    System.out.println("Resultados:");
		    System.out.println("-----------------------");
		    for (int i = 0; i < candidatos.length; i++) {

		        System.out.println("Candidato " + (i + 1) + " " + candidatos[i] + " votos.");
		    }
		}
	}


