package OOP;

public class Cow extends Animal implements AnimalAction{
    public Cow(String type, String name, int age, String color, boolean isAlive){
        super(type, name, age, color, isAlive);
    }

    public String sound(){
        return "Moo!";
    }

    public String sound(String name){
        return name + " Moo!";
    }

    public String preferredFood(){
        return "Grass.";
    }
    public int lifeExpectancy(){
        return 20;
    }
}
