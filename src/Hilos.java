
public class Hilos extends Thread {
	
	private int miId;
	private int miDato;
	
	public Hilos(int id){
		miId=id;
		miDato=10*miId;
		
	}//Hilo
	 
	@Override
	public void run(){
		System.out.printf("Saludos del hilo %d, mi dato es %d%n", miId, miDato);
		
		
	}//run

}//Hilos
