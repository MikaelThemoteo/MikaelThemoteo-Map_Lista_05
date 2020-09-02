package br.com.q04;

public class IncrementalSingleton {
	
	private static IncrementalSingleton instance;
	private static int count ;
	private int numero;
	
	IncrementalSingleton(int numero) {
		try {
			numero = ++ count;
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		this.numero = numero;
	}
	
	public static IncrementalSingleton getInstance(int numero) {
		if (instance == null) {
			instance = new IncrementalSingleton(numero);
		}
		return instance;
	}	

}
