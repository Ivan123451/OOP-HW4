package HW2;

public class Start {
    public static void main(String[] args) {

        Turtle<Integer> turtle = (averageAge, ageOfThisTurtle) -> (averageAge-ageOfThisTurtle);
        int z = turtle.test(100,30);
        if(z < 0) {
            System.out.println("черепаха старше средней особи на " + z + " лет");
        }
        if(z > 0) {
            System.out.println("черепаха младше средней особи на " + z + " лет");
        }

        System.out.println("--------------------------------");
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
