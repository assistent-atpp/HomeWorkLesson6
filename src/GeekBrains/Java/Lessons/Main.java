package GeekBrains.Java.Lessons;

public class Main {

    public static void main(String[] args) {
//        Animal animal = new Animal();
		Cat cat = new Cat("Кот", "Том", 200, 0);
		Dog dog = new Dog("Пёс", "Шарик",500, 10);

		cat.run(200);
		cat.run(201);
		cat.swim(0);
		dog.run(500);
		dog.run(501);
		dog.swim(10);
		dog.swim(11);
    }
}
