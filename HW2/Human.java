package HW2;

import java.util.logging.StreamHandler;

public class Human implements LivingOrganizm{
    String name = "Max";
    int age = 30;

    public void zovCat(Cat zovcat) {
        System.out.println(name + " зовет - Кис-кис-кис");
        zovcat.ansver();

    }


    @Override
    public void hi() {
        System.out.println("Привет, я " + name + " мне " + age);

    }
}
