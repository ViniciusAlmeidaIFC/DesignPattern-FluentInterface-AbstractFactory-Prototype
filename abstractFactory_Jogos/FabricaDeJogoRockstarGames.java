package abstractFactory_Jogos;

public class FabricaDeJogoRockstarGames implements IFabricaDeJogo {

	public IJogoMundoAberto criarJogoMundoAberto() {
		return new GrandTheftAutoV();
	}

	public IJogoTiro criarJogoTiro() {
		return new MaxPayne3();
	}
}