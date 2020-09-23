package prototype_Animal;

public class Main {
	public static void main(String[] args) {
		
		Animal animalParaClonar = new Gato("Garfield", 5, "Amarelo", 4);
		
		System.out.println("Animal para clonar: "+animalParaClonar.toString());
		
		PrototypeAnimal prototypeClonar = new PrototypeAnimal(animalParaClonar);
		
		
		Animal animalClonado = prototypeClonar.geraClone();
		animalClonado.setNome("Hulk");
		System.out.println("1º Animal clonado: "+animalClonado.toString());
		
		
		Animal animalClonado2 = prototypeClonar.geraClone();
		animalClonado2.setIdade(9);
		System.out.println("2º Animal clonado: "+animalClonado2.toString());
		
		
		Animal animalClonado3 = prototypeClonar.geraClone();
		animalClonado3.setCor("Branco");
		System.out.println("1º Animal clonado: "+animalClonado3.toString());

	}
}
