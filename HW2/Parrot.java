package HW2;

public class Parrot {
    int age;

    <T extends Number> Parrot(T age) {
        this.age = age.intValue();
    }

    public int getAge() {
        return age;
    }
}
