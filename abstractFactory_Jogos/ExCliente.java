package abstractFactory_Jogos;

public class ExCliente {
	public static void main(String[] args) {
		
		IFabricaDeJogo fabrica = null;
		IJogoMundoAberto jogoMundoAberto = null;
		IJogoTiro jogoTiro = null;
		
		//UBISOFT
		fabrica = new FabricaDeJogoUbisoft();
		
		jogoMundoAberto = fabrica.criarJogoMundoAberto();
		System.out.println("\nNome do jogo: "+jogoMundoAberto.nomeJogoMundoAberto());
		System.out.println("Categoria do jogo: "+jogoMundoAberto.categoriaJogoMundoAberto());
		
		jogoTiro = fabrica.criarJogoTiro();
		System.out.println("\nNome do jogo: "+jogoTiro.nomeJogoTiro());
		System.out.println("Categoria do jogo: "+jogoTiro.categoriaJogoTiro());
		
		
		//ROCKSTAR GAMES
		fabrica = new FabricaDeJogoRockstarGames();
		
		jogoMundoAberto = fabrica.criarJogoMundoAberto();
		System.out.println("\nNome do jogo: "+jogoMundoAberto.nomeJogoMundoAberto());
		System.out.println("Categoria do jogo: "+jogoMundoAberto.categoriaJogoMundoAberto());
		
		jogoTiro = fabrica.criarJogoTiro();
		System.out.println("\nNome do jogo: "+jogoTiro.nomeJogoTiro());
		System.out.println("Categoria do jogo: "+jogoTiro.categoriaJogoTiro());
		
	}
}
