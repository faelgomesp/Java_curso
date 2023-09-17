package tentativa1;

public class codigo7 {
	public static void main(String[] args) {

		/* Operadores ternarios sao para micro validacoes 
		 * pra verdadeiro ou falso, uma linha so*/
		int nota1 = 90;
		int nota2 = 80;
		int nota3 = 70;
		int nota4 = 40;
		int media = 0;
		
		media = (nota1+nota2+nota3+nota4)/4;
		String saidaResultado;
		
		saidaResultado = media >= 70 ? "Aluno aprovado" : "Aluno reprovado";
		
		System.out.println(saidaResultado);
	}
}
