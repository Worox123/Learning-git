package Cat;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();

        animal.move();  // Запускает метод в классе Animal
        cat.move();
        final Cat bigCat = new Cat(5500, "Murka", 2, "Black");
        Cat smallCat = new Cat(1000, "Kuzya", 1, "White");
        //изменять МОЖНО
        bigCat.setName("Kuzya");
    }
}
