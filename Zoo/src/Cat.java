public class Cat extends Animal implements Pet {
    private static final String[] CATS_FOOD = { "CATS_FEED", "FISH", "MILK" };

    private String species;

    public Cat() {
        super();
        this.species = "None species";
    }

    public Cat(String name, String gender, int age, String species) {
        super(name, gender, age);
        this.species = species;
    }

    public void feed(String food) {
        for (String aCATS_FOOD : CATS_FOOD) {
            if (food.toUpperCase().equals(aCATS_FOOD)) {
                System.out.println("omnomnom");
                return;
            }
        }
        System.out.println("Cat won't eat this.");
    }

    private void meow() {
        System.out.println("Meow!");
    }

    public void sound() {
        meow();
        meow();
        meow();
    }

    public String getSpecies() {
        return species;
    }
}
