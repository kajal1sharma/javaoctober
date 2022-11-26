class ExceptionTest{

    static void doSomething(){
        System.out.println("this is line 2");
        doSomethingMore();
    }

    static void doSomethingMore(){
        System.out.println("this is line 3");
        try{
            int a=90/0;
        }
        catch(Exception e){
            int a=90/8;
        }
        
            doEvenMore();
    }

    static void doEvenMore(){
        System.out.println("this is line 4");
    }

    public static void main(String[] args) {
        System.out.println("this is line 1");
        doSomething();
    }
}





// import java.util.Scanner;

// public class ExceptionTest {
//     public static void main(String[] args) {
//        //exception occur only at runtime

//        try{
//        System.out.println("enter a number");
//         Scanner sc =new Scanner(System.in);
//         int a =sc.nextInt();

//         int arr[]= new int[10];
//         System.out.println(arr[12]);
//         //file abc => "the "
//        }catch(Exception e){
//         //file handling
//         //file cdf => "the "
        
//         System.out.println(e);
//            // System.out.print("some exception has arised");
//        }


//     }
// }
