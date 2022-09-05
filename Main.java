public class Main {
    public static void main(String[] args) {

        Animal dog = new Animal("Tommy", "Black");

        Animal cat = new Animal("Catty", "white");

        setupAnimal(dog);

        setupAnimal(cat);

    }


    public static void setupAnimal(Animal dog){
        dog.setHasTail(true);

        System.out.println(dog.animalName + " color is :- " + dog.getColor());

        System.out.println("Has " + dog.animalName + " got a tail:- " + dog.getHasTail());

        dog.animalGetsTailCut();

        System.out.println("Has " + dog.animalName + " got a tail:- " + dog.getHasTail());
    }

}