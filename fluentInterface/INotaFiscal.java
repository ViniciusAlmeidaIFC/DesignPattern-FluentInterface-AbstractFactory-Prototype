package fluentInterface;

public interface INotaFiscal {

	INotaFiscal CalcularVlTotalProdutos();
    INotaFiscal CalcularVlBaseIPI();
    INotaFiscal CalcularVlIPI();
    INotaFiscal AplicarDesconto(double percentual);
    INotaFiscal CalcularVlBaseICMS();
    INotaFiscal CalcularVlICMS();
    INotaFiscal CalcularTotalNotaFiscal();
}
