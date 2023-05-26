package java.execut;

public class primeirocodjava {
	/*Variavel Global e acessivel a todos e o seu valor é compartilhado*/
	static int maiorIdadeGlobal = 30;
	
	/*codigo main auto exexutavel em java*/
	public static void main(String[] args) {
		System.out.println("Meu primeiro codigo em java");
		System.out.println("Uma das primeiras aulas em Java");
		
		/*Variavel local porque pertence somente a esse método e o valor fica dentro do método*/
		int maiorIdade = 18;
		System.out.println("Valor variavel local " + maiorIdade);
		System.out.println("Valor variavel local Global" + maiorIdadeGlobal);
			metodo2();
	}
	public static void metodo2() {
		int mediaAno = 50;
			System.out.println("Valor da variavel Global =" + maiorIdadeGlobal);
	}
	
}
