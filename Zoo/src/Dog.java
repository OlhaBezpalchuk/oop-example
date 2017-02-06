public class Dog extends Animal implements Pet {
    private static final String[] DOGS_FOOD = { "DOGS_FEED", "MEAT", "BONE", "WATER" };

    private String species;
    private boolean isTrained;

    public Dog() {
        super();
        this.species = "None species";
        this.isTrained = false;
    }

    public Dog(String name, String gender, int age, String species, boolean isTrained) {
        super(name, gender, age);
        this.species = species;
        this.isTrained = isTrained;
    }

    public void feed(String food) {
        for (String aDOGS_FOOD : DOGS_FOOD) {
            if (food.toUpperCase().equals(aDOGS_FOOD)) {
                System.out.println("omnomnom");
                return;
            }
        }
        System.out.println("Dog won't eat this.");
    }

    private void woof() {
        System.out.println("Woof!");
    }

    private void arr() {
        System.out.println("Arrr");
    }

    public void sound() {
        woof();
        arr();
    }

    String getSpecies() {
        return species;
    }

    boolean isTrained() {
        return isTrained;
    }

}
