package HW2;

public class Cat implements animal {
    String name;
    int age;
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;


    }

    @Override
    public void hi() {
        System.out.println("Я " + name + " мне " + age + " Мур");

    }

    @Override
    public void eat() {
        System.out.println(name + " ест");

    }

    @Override
    public void ansver() {
        System.out.println(name + "- Мур-Мур-Мур");
    }
}
