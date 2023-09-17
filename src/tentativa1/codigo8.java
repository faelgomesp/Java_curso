package tentativa1;

public class codigo8 {
	public static void main(String[] args) {

		int nota1 = 98;
		int nota2 = 98;
		int nota3 = 80;
		int nota4 = 90;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		/* operaçoes logicas aninhadas sao operaçoes dentro de operaçoes */
		if (media >= 50) {
			if (media >= 70) {
				if (media > 90) {
					System.out.println("Aluno está aprovado direto Parabens" + media);
				} else {
					System.out.println("Aluno está em aprovado direto" + media);
				}
			} else {
				System.out.println("Aluno esta em recuperação" + media);
			}
		} else {
			System.out.println("Aluno reprovado direto" + media);
		}
	}
}
