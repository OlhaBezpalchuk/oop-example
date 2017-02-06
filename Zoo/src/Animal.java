import java.util.Random;

abstract public class Animal {
    private static final String MALE = "male";
    private static final String FEMALE = "female";
    private static final int MAX_AGE = 100;
    private String gender;
    private String name;
    private int age;

    public Animal() {
        this("Animal", new Random().nextFloat() < 0.5 ? MALE : FEMALE, new Random().nextInt(MAX_AGE));
    }

    public Animal(String name, String gender, int age){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void sound() {
        System.out.println("Nothing to say.");
    }

    int getAge() {
        return age;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    String getGender() {
        return gender;
    }

    boolean isMale() {
        return gender.equals(MALE);
    }

    boolean isFemale() {
        return gender.equals(FEMALE);
    }

}
