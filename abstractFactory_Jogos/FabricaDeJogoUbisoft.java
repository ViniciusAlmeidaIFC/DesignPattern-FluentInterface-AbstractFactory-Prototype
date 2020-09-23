package abstractFactory_Jogos;

public class FabricaDeJogoUbisoft implements IFabricaDeJogo {

	public IJogoMundoAberto criarJogoMundoAberto() {
		return new WatchDogs2();
	}

	public IJogoTiro criarJogoTiro() {
		return new TomClancysRainbowSix3RavenShield();
	}
	
}
