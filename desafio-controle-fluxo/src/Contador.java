import java.util.Scanner;


public class Contador {
	
	public static void main(String[] args) {
		
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Informe um numero para o primeiro parametro: ");
		int parametroUm = terminal.nextInt();
		
		System.out.println("Informe um numero para o primeiro parametro: ");
		int parametroDois = terminal.nextInt();
		
		
		try {
	
			contar(parametroUm, parametroDois);
			
		} catch (ParametrosInvalidosException exception) {
		
			System.out.println("O primeiro número tem que ser menor que o segundo.");
		}
		
		
	}
	
	static public void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
		if (parametroUm > parametroDois) {
			
		throw new ParametrosInvalidosException();
			
		}else {
			
			int contagem = parametroDois - parametroUm;
			for (int i = 0; i < contagem; i++) {
				System.out.println("Número "+(i+1));
			}
		}
	}

}
	
	
	class ParametrosInvalidosException extends Exception{
		
	}