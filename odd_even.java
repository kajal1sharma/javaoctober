//homework => odd even into an function 
//classname=> capital letter
//Identifier addNumber fucntion variable

public class odd_even
{
    

    static void checkOddEven(int n){
        
        if(n % 2 == 0 )
        {
            System.out.println("this is a even number");
        }
        else{
            System .out .println ("this is a odd number ");
        }
    }
public static void main (String[]args)
{
    int n = 6;
    odd_even.checkOddEven(n);
    n=4;
    odd_even.checkOddEven(n);
    n=7;
    odd_even.checkOddEven(n);
    odd_even.checkOddEven(9);
   
}
}
