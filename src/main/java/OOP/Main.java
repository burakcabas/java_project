package OOP;

public class Main {

    public static void main(String[] args){

        Cow cow1 = new Cow("Belted Galloway", "Johnny", 12, "Black&White", true);

        System.out.println(cow1.lifeExpectancy() + " " + cow1.preferredFood() + " " + cow1.sound());

        System.out.println(cow1.getType() + " " + cow1.getName() + " " + cow1.getAge() + " " + cow1.getColor() + " " + cow1.isAlive());

        cow1.setAlive(false);

        System.out.println(cow1.isAlive());

        System.out.println(cow1.sound("Johnny"));

        System.out.println("Hello");

    }

}
