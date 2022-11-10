public class Recursion {
    static void work(){
        System.out.println("lets work now");
    }
    static void dosomethingMore(){
        System.out.println("i will do something more");
        work();
        System.out.println("i will do something more twice");
    }
    //definition of function =>curly braces
    static void doSomething(){
        System.out.println("i will do something");
        dosomethingMore();
        System.out.println("i will do something twice");
    }
public static void main(String[] args) {
       // System.out.println("Recursive functions example");
        //function calls itself from its definition

        //fucntion calling => normal round bracket
        doSomething(); 
        System.out.println("Recursive functions example"); 
        //top fucntion on call stack always is executing
        //main is loaded first on call stack
    }
}
