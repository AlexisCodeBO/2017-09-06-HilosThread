import java.util.Scanner;
public class HiloThread {

	public static void main(String [] args){
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.print("Ingrese el numero de hilos: ");
		int nHilos=entrada.nextInt();
		
		Hilos[]hilos= new Hilos[nHilos];
		
		for(int h=0;h< nHilos; h++){
			hilos[h]=new Hilos(h);
		}
		
		for(int h=0;h< nHilos; h++ ){
			hilos[h].start();
		}
	}//main
}//HiloThread
