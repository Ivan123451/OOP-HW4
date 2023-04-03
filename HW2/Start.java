package HW2;

public class Start {
    public static void main(String[] args) {
        Human man = new Human();
        man.hi();

        System.out.println("--------------------------------");
        LivingOrganizm cat = new Cat("Murka", 4);
        cat.hi();
        ((Cat) cat).eat();
        System.out.println("--------------------------------");
        animal dog = new Dog("Laika");
        dog.hi();
        dog.eat();
        System.out.println("--------------------------------");

        man.zovCat((Cat) cat);


    }

}
