package Cat;

public class Main {
    public static void main(String[] args) {
        Cat cat  = new Cat();
        cat.sound();
        final Cat bigCat = new Cat(5500, "Murka", 2, "Black");
        Cat smallCat = new Cat(1000, "Kuzya", 1, "White");
        //изменять МОЖНО
        bigCat.setName("Kuzya");
    }
}
