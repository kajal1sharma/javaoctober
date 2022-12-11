import java.util.Scanner;

class Test<T extends People>{

    T obj;

    Test(T obj){
        this.obj =obj;
        Object obj2 =obj;
    }

    void sing(){

    }


}

class Train{

}
class People{

}
class Singers extends People{

}

public class Generics3 {
    public static void main(String[] args) {
        Integer i =90;
        String s= "fdksdkgf";
        // Test<Integer> c= new Test<Integer>(i);
        // Test<String> c2= new Test<String>(s);
        // Scanner sc =new Scanner(System.in);
        // Test <Scanner> c3 = new Test<Scanner>(sc);
        // Test <Train> c4 = new Test<Train>(new Train());
        Test <People> c5 =new Test<People>(new People());
        Test <Singers> c6 =new Test<Singers>(new Singers());
    }
}
