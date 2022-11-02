class Car{
    String color;
    int maxSpeed;
    String modelNumber;
    int price;

    // Car(){

    // }
    //default constr
    Car(){
        color="red";
        maxSpeed=100;
        modelNumber="px232";
        price=500000;

       // System.out.print("iam a default constru");
    }

}
public class ObjClassesEx3 {
    public static void main(String[] args) {
        Car obj1= new Car();

        System.out.println("color of the car is "+obj1.color);
        obj1.color="yellow";
        System.out.println("color of the car is "+obj1.color);
    }
}
