import java.sql.PseudoColumnUsage;
import com.course.structure.App;
abstract class Person{
//cannit create object of this class
    String name;
    int  age;
    int height;
    int weight;

    abstract void dressCode();
    void run(){
       //kjkjkjkj 
    }
     Person(){
        //kjkjkjk
        name="priya";
     }
     Person(String name, int age){
        //kjkjkjk
        this();
        name="priya";
     }
}

class Teacher extends Person{
    int salaray;
    Teacher(){
        super("riya", 12);
        salaray=900;
    }
    void dressCode(){
       
        //kgjdskgdfk,
    }
    //abstract void salary();

}

class Student extends Person{
    int marks;
    void dressCode(){
        //kgjdskgdfk,
    }
}
class Engineer extends Person{
    int salaray;
    void dressCode(){
        //kgjdskgdfk,
    }
}
abstract class Doctor extends Person{
    int salaray;
    String specialist;
    //dressCode();
    // void dressCode(){
    //     //kgjdskgdfk,
    // }
}

class Gynos extends Doctor{
void dressCode(){

}

}

class Physician extends Doctor{
    @Override
    void dressCode() {
        // TODO Auto-generated method stub
        
    }
}


public class Abstract {
    //abstract 

    public static void main(String[] args) {
        Teacher t=new Teacher();        
    }
}
