package SergeQA.homework.lesson15;


public class CustomBicycle extends Bicycle {
    private int speed = 8;
    private int gear = 5;

    public CustomBicycle(String name) {
        super(name);
    }

    void setSpeed (){
        System.out.println(speed);
    }

    void setGear (){
        System.out.println(gear);
    }

    public void ride(){
        ride();
        System.out.println("Wshhhh!");
    }

}
