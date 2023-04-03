package HW2;

public class Dog implements animal{
    String name;
    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void hi() {
        System.out.println("Кличка собаки " + name);

    }

    @Override
    public void eat() {
        System.out.println(name + " ест из миски");

    }

    @Override
    public void ansver() {
        System.out.println("Гав-Гав_Гав");
    }
}
