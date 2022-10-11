import java.util.Scanner;

public class Calculator {

    static void calculations(){
        System.out.println("Enter your choice");
        System.out.println("1 for Addition \n2 for multiplication \n3 for division");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        System.out.println("user choice is  : "+choice);
        System.out.print("Enter number 1  : ");
        int  firstNumber ;
        firstNumber = sc.nextInt();
        System.out.print("Enter number 2  : ");
        int secondNumber = sc.nextInt();
        System.out.println("the numberse are : "+ firstNumber +" && " + secondNumber );
        int result =0 ;
        if(choice == 1){
            result = firstNumber + secondNumber ;
            System.out.println("Addition of numbers is "+ result );
        }
        else if(choice ==2 ){
            result = firstNumber * secondNumber;
            System.out.println("Multiplication of numbers is "+ result);
        }
        else if (choice ==3 ){
            result = firstNumber / secondNumber;
            System.out.println( "Division of numbers is "+ result);
        }
        else{
            System.out.println("you have entered wrong choice");
        }
    }

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);

        int ch;
        for(;true;){    
            calculations();
            System.out.print("do you want to continue?(0/1) :");
            ch = sc.nextInt();
            if(ch == 0){
                break;
            }
            else {
                continue;
            }
            //lines of code .... will be ignored by continue
        }


       System.out.println("Thank you !!");    
    }
}
