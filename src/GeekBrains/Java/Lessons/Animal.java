package GeekBrains.Java.Lessons;

public class Animal {
    // свойства животных
    String type;
    String name;
    int maxRunLength;
    int maxSwimLength;

    
    public Animal(String type, String name, int maxRunLength, int maxSwimLength){
        this.type = type;
        this.name = name;
        this.maxRunLength = maxRunLength;
        this.maxSwimLength = maxSwimLength;
    }

    // метод бежать
    public void run (int lengthRun){
        System.out.println("Способность " + type + " " + name + " выполнить команду бег: " + powerRunAnimal(lengthRun, maxRunLength));
    }

    // метод плыть
    public void swim (int lengthSwim){
        System.out.println("Способность " + type + " " + name + " выполнить команду плавание: " + powerSwimAnimal(lengthSwim, maxSwimLength));
    }

    // метод определения возможностей бега животных
    public boolean powerRunAnimal (int commandRun, int powerRun){
        if (commandRun <= powerRun){
            System.out.println(type + " " + name + " пробежал " + commandRun + " м");
            return true;
        }
        System.out.println(type + " " + name + " не способен пробежать " + commandRun + " м");
        return false;
    }

    // метод определения возможностей плавания животных
    public boolean powerSwimAnimal (int commandSwim, int powerSwim){
        if (commandSwim <= powerSwim){
            System.out.println(type + " " + name + " проплыл " + commandSwim + " м");
            return true;
        }
        System.out.println(type + " " + name + " не способен проплыть " + commandSwim + " м");
        return false;
    }
}
