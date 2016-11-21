import java.util.Scanner;

/*
 * CSI Florida
 * Reto Putadon
 * 
 * El siguiente código busca una letra dentro de una frase
 * y devuelve dónde se ha encontrado y ctas veces
 * 
 * Hay dos errores
 * 
 */
public class Putadon {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		//Variables inicialización
		String frase="";
		int numPos=0, numRepeticiones=0;
		char letra=0;
		
		//Pedimos datos
		frase=pideDatos("Introduce tu frase");
		
		//charAt(0) devuelve la primera letra
		letra = pideDatos("Introduce la letra a buscar").charAt(0);
		
		//Buscamos las letras
		for(int i=0;i<frase.length();i++){
			if(letra==frase.charAt(i)){
				numRepeticiones=numRepeticiones+1;
				System.out.println("Letra "+letra+" encontrada en la posicion "+(i+1));
			}
		}
		System.out.println("Total repeticiones "+numRepeticiones);
	}
	public static String pideDatos(String texto){
		System.out.println(texto);
		texto = sc.nextLine();
		return texto;
	}
}
