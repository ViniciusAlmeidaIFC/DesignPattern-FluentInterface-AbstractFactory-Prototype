package fluentInterface;

public class NotaFiscal implements INotaFiscal {

	public NotaFiscal CalcularVlTotalProdutos()
    {
		// Instru��es para c�lculo do valor
        // total dos produtos

        return this;
    }

    public NotaFiscal CalcularVlBaseIPI()
    {
    	// Instru��es para c�lculo do valor
        // da base do IPI

        return this;
    }

    public NotaFiscal CalcularVlIPI()
    {
    	// Instru��es para c�lculo do valor do IPI

        return this;
    }

    public NotaFiscal AplicarDesconto(double percentual)
    {
    	// Aplicar percentual de desconto sobre
        // o total dos produtos

        return this;
    }

    public NotaFiscal CalcularVlBaseICMS()
    {
    	 // Instru��es para c�lculo do valor
        // da base do ICMS

        return this;
    }

    public NotaFiscal CalcularVlICMS()
    {

    	 // Instru��es para c�lculo do valor do ICMS
    	
        return this;
    }

    public NotaFiscal CalcularTotalNotaFiscal()
    {
    	// Calcular total da nota considerando
        // descontos e tributos que dever�o ser
        // somados ao mesmo
    	
        return this;
    }
}
