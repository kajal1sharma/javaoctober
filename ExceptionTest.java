import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class ExceptionTest{

    public static void main(String[] args) {
        
        try{
            
            int i=90/0;
            // int arr[] =new int[10];
            // arr[12]=90;
            // int[] arr2=null;
            // arr2[0]=90;

        }   
        catch(NullPointerException e){
                System.out.print(e);
        }  
        catch( ArrayIndexOutOfBoundsException arr){
            System.out.println("ArrayIndexOutOfBoundsException execp");
        }  
        catch(ArithmeticException a){
            System.out.println("arithmet");
        }
        catch(Exception e){
            System.out.print("parent exception"+e);
        } 
        finally{
            //clean up 
            System.out.println("hi i will always run");
        }
        
    }
}

// Exception=>ArithmeticException, Io ,
// class ExceptionTest{

//     static void doSomething(){
//         System.out.println("this is line 2");
//         try{
//             doSomethingMore();
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//         System.out.println("this is line 6");

//     }
//     static void doSomethingMore(){
//         System.out.println("this is line 3");
        
//             int num= 90/0;
//             doEvenMore();
//             System.out.println("this is line 7");
//     }
//     static void doEvenMore(){
//         int a;
//         System.out.println("this is line 4");
//     }
//     public static void main(String[] args) {
//         System.out.println("this is line 1");
//         doSomething(); 
//         System.out.println("this is line 5");
//     }
// }




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
