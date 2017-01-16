package SergeQA.homework.lesson15;


public class BicycleWithRing extends CustomBicycle implements BicycleWithRingInterface {

    public BicycleWithRing(String name) {
        super(name);
    }

    public void ring(){
        System.out.println("Di-ling!");
    }


}
