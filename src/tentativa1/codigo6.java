package tentativa1;

public class codigo6 {
	public static void main(String[] args) {

		/*int mediaAluno = 70;
		String nome = "Code";

		if (mediaAluno >= 70 && nome.equals("Alex")) {
			System.out.println("Parabens voce esta aprovado");
		} else if (mediaAluno < 70) {
			System.out.println("voce esta reprovado");

		}else {
			System.out.println("Aluno não encontrado");
		}*/
		
		int nota1 = 10;
		int nota2 = 70;
		int nota3 = 20;
		int nota4 = 40;
		int media = 0;
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		if(media >=70) {
			System.out.println("Aluno aprovado" + media);
		}if(media >= 40 && media <= 69) {
			System.out.println("Aluno em recuperação: " + media);
		}
		 else {
			System.out.println("Aluno reprovado: " + media);
		}

	}
}
