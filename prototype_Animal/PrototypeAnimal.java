package prototype_Animal;

public class PrototypeAnimal {

	Animal prototypeAnimal;

	public PrototypeAnimal(Animal animal) {
		this.prototypeAnimal = animal;
	}

	public Animal geraClone() {
		return (Animal) prototypeAnimal.clone();
	}
	
}