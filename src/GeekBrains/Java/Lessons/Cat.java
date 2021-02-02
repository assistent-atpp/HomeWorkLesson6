package GeekBrains.Java.Lessons;

public class Cat extends Animal{
    // конструктор Кота
    public Cat (String type, String name, int maxRunLength, int maxSwimLength){
        super(type, name, maxRunLength,0);
    }
    // переопределение метода плавать в классе Кот
    @Override
    public void swim (int length){
        System.out.println("Кот " + name + " плавать не умеет.");
    }
}
