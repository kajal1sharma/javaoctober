import java.util.Scanner;

public class FlowControl {
    public static void main(String[] args) {
        //flow control 

        // if else
        int a =15;
        Scanner sc =new Scanner(System.in);
        a= sc.nextInt();
        
        System.out.println("hello world");
        System.out.println("hello world 2 ");


        switch(a){
            case 1:    System.out.println("case 1");
                        break;
            case 10 : System.out.println("case 10");
            case 12: System.out.println("case 12");
            default : System.out.println("default case");
        }

        // if(a==12){
        //     System.out.println("iam the if block");
        //     //12 line code
        // }
        // else {
        //     System.out.println("else block");
        //     //50 lines
        // }
    }
}
