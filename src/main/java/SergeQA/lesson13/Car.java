package SergeQA.lesson13;


public class Car {
/*    @Override
    public String toString(){
        return name + " " + color + " " + price;
    }

    private String name; private String color; private int price;
    public Car (){
        this.name = "Toyota";
        this.color = "green";
        this.price = 999;
    }
*/
/*    String name;
    Car (String name){
        this.toString() = name;
    }
*/
    private String name = "BMW";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
