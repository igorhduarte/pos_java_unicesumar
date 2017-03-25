package entidades;

public class Calculadora {

	static Integer valorInicial = 2;
	
	public static void main(String[] args) {
		System.out.println("***Calculadora***");
		exemploDivisao();
		exemploMultiplicacao();
		exemploAdicao();
		exemploSubtracao();
		validaSeValorEhPar(valorInicial);
		validaSeValorEhImpar(valorInicial);
	}

	public static String validaSeValorEhPar(Integer valorInicial) {
		if (valorInicial % 2 == 0){
			return "PAR";
		}
		return "";
	}
	
	public static String validaSeValorEhImpar(Integer valorInicial) {
		if ( valorInicial % 2 != 0 ){
			return "IMPAR";
		}
		return "";
	}
		
	private static void exemploSubtracao() {
		Integer resultadoDaSubtracao = valorInicial - 2;
	}

	private static void exemploAdicao() {
		Integer resultadoDaAdicao = valorInicial + 2;
	}

	private static void exemploMultiplicacao() {
		Integer resultadoDaMultiplicacao = valorInicial * 2;
	}

	private static void exemploDivisao() {
		Integer resultadoDaDivisao = valorInicial / 2;
	}
}
