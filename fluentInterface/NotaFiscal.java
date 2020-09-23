package fluentInterface;

public class NotaFiscal implements INotaFiscal {

	public NotaFiscal CalcularVlTotalProdutos()
    {
		// Instruções para cálculo do valor
        // total dos produtos

        return this;
    }

    public NotaFiscal CalcularVlBaseIPI()
    {
    	// Instruções para cálculo do valor
        // da base do IPI

        return this;
    }

    public NotaFiscal CalcularVlIPI()
    {
    	// Instruções para cálculo do valor do IPI

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
    	 // Instruções para cálculo do valor
        // da base do ICMS

        return this;
    }

    public NotaFiscal CalcularVlICMS()
    {

    	 // Instruções para cálculo do valor do ICMS
    	
        return this;
    }

    public NotaFiscal CalcularTotalNotaFiscal()
    {
    	// Calcular total da nota considerando
        // descontos e tributos que deverão ser
        // somados ao mesmo
    	
        return this;
    }
}
