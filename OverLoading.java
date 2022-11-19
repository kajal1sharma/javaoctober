


// class Calculator{

//     public static int  add(int a, int b){//fucntion sig => nameOfThefun (para ) => add(int , int)
      
//         return 10;
//     }
//     public static double add(double a, double  b){// add(double , double)
//         return 10.5;
//     }
//     public static int add(int a ,double b){//add(int , double)
//         return 10;
//     }
//     public static int add(double b, double c, double d){//add( double, double, double)
//    return 10;
//     }
//
//}

class Person{
    int height;
    int weight;
     public int BMI(){
        //calcaution
        return 24;
     }
     public void whatToEat(){
        System.out.println("have fruits and vegetables");
        //description
     }
}
class Student extends Person{
    public void whatToEat(){
        System.out.println("have fruits and vegetables and dry fruits");
        //new description
     }
     public void run(){
     }
}
public class OverLoading {
    public static void main(String[] args) {
        Student st1= new Student();
        st1.whatToEat();
        //p1/p2 => height weight whatToEar BMI
        Person p1 = new Person();
        p1.whatToEat();
        Person p2 = new Student();
        p2.whatToEat();
        // p2.run();


        // Calculator c= new Calculator();
        // c.add(10,10);
    //    System.out.println( Calculator.add(10, 20));//add(int , int)
    //    System.out.println( Calculator.add(12.5, 14.5));
    }    
}
