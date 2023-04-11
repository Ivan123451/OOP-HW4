package HW2;

public class Monkey <T, V> {
    T years;
    V name;

    public Monkey(T years, V name) {
        this.years = years;
        this.name = name;
    }

    T getYears() {
        return years;
    }

    V getName() {
        return name;
    }
}
