// class Engine{
//     int fuelType;
//     String name;

// }

class Car {
    
    void fucntion1(){
        System.out.println("hello world 1");
    }
    static void fucntion2(){
        System.out.println("hello world 2");
    }
    public static void main(String[] args) {
        System.out.println("hello world");
        Car c = new Car();
        c.fucntion1();
        fucntion2();
        Car.fucntion2();
        // Engine obj =new Engine();
        // Engine obj2= new Engine();
    }
}
//javac stands for java compiler