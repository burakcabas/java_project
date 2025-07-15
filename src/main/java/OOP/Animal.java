package OOP;

public class Animal {
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    private String type;
    private String name;
    private int age;
    private String color;
    private boolean isAlive;

    public Animal(String type, String name, int age, String color, boolean isAlive){
        this.type = type;
        this.name = name;
        this.age = age;
        this.color = color;
        this.isAlive = isAlive;
    }


}
