
class Car{
    int weight;
    String color;
    int price;
    String modelNumber;
    boolean airBags;


    Car(){
        getInfo();
        weight =100;
        color="red";
        price=200000;
        modelNumber="fefer3";
        airBags=true;
    }

    Car(int carWeight, String carColor, boolean wantAirBags ){
        weight= carWeight;
        color= carColor;
        airBags = wantAirBags;
        modelNumber="fefer3";
        price=200000;
    }

    void getInfo(){
        System.out.println("================================================");
        System.out.println("Wight of the car : "+weight);
        System.out.println("color of the Car : "+color);
        System.out.println("price of the car : " +price);
        System.out.println("Model number of the car : "+modelNumber);
        System.out.println("airbags : "+airBags);
        System.out.println("================================================");
    }
}

public class Constructor {
    public static void main(String[] args) {
        System.out.println("welcome to main fucntion");
        //default 
        //Car c= new Car();
       // c.getInfo();

        //parameterized constructor
        //int carWeight, String carColor, boolean wantAirBags
        Car c2 =new Car(120,"pink", true  );
        // Car c2 =new Car(120,"pink", true  );
        c2.getInfo();
    }
}
