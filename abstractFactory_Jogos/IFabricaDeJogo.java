package abstractFactory_Jogos;

public interface IFabricaDeJogo {

	IJogoMundoAberto criarJogoMundoAberto();
	IJogoTiro criarJogoTiro();
	
}
