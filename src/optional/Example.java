package optional;

import Chapter10.Animal;

import java.util.Optional;

public class Example {

    public static void main(String[] args) {
    Optional <Animal> foundAnimal =   getAnimal();
    if(foundAnimal.isPresent()){
        Animal animal = foundAnimal.get();
        animal.speak();
    }

    }

    private static Optional <Animal> getAnimal(){
        Animal animal = new Animal();
        return Optional.of(animal);
    }
}
