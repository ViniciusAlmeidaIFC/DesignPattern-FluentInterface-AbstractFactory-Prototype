package prototype_Animal;

public class Animal implements Cloneable {
	
	private String nome;
	private int idade;
	private String cor;
	private int qtdPatas;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getQtdPatas() {
		return qtdPatas;
	}
	public void setQtdPatas(int qtdPatas) {
		this.qtdPatas = qtdPatas;
	}

	public Object clone() {
		Object obj = null;

		try {
			obj = super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", idade=" + idade + ", cor=" + cor + ", qtdPatas=" + qtdPatas + "]";
	}
}
