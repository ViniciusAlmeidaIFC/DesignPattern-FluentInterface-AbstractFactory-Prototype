package fluentInterface;

public class Main {

	public static void main(String[] args) {
		NotaFiscal nota = new NotaFiscal()
				.CalcularTotalNotaFiscal()
				.CalcularVlBaseICMS();

	}

}
