package SergeQA.homework.lesson15;


public abstract class Bicycle {
    public String sound = "Wroom!";
    public String name = "Bicycle";

    public Bicycle (String name){
        this.name = name;
    }

    public static void ride(String sound){
        System.out.println(sound);
    }

    abstract void setSpeed();

    abstract void setGear();


}
