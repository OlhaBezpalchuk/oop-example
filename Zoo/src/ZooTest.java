public class ZooTest {
    public static void main(String[] args) {
        System.out.println("Zoo Test:");
        System.out.println("---------------");

        Beaver beaver = new Beaver();
        System.out.println("Beaver added:");
        System.out.println("name:" + beaver.getName());
        System.out.println("gender:" + beaver.getGender());
        System.out.println("age:" + beaver.getAge());
        System.out.println("beaver says:");
        beaver.sound();
        System.out.println("---------------");

        Cat cat = new Cat("Cat", "male", 12, "None");
        System.out.println("Cat added:");
        System.out.println("name:" + cat.getName());
        System.out.println("species:" + cat.getSpecies());
        System.out.println("is Female:" + cat.isFemale());
        System.out.println("Cat says:");
        cat.sound();
        System.out.println("Feed the cat with fish:");
        cat.feed("fish");
        System.out.println("Feed the cat with pen");
        cat.feed("pen");
        System.out.println("---------------");

        Dog dog = new Dog("Dog", "female", 21, "Spaniel", true);
        System.out.println("Dog added:");
        System.out.println("name:" + dog.getName());
        System.out.println("is trained:" + dog.isTrained());
        System.out.println("Dog says:");
        dog.sound();

    }
}
