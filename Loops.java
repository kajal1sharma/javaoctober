import java.util.regex.Pattern;

public class Loops {


    static boolean  doPrint(){
       int a =80;
       int b=80;
       System.out.println("first number is : "+a+"  \nsecond number is : "+b);
       int result =a+b;
       if(result == 100){
        return false;
       }
       else{
        return true;
       }
        
    }

    static void pattern1(){
        
        //number of rows
        for (int i=1;i<= 5;i++){
            for(int j =0;j<=5-i;j++){

                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void  pattern2_2(){

        for(int i=0;i<5;i++){
            char ch =(char)('A'+i);//typecasting
            for(int j=0;j<5-i; j++){
                System.out.print(ch+" "+(int)(ch));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {



        

        int number =10;
        int octalnumber = 0234;
        int hexnumber =0x23fcd;
        char ch = 012;
        float num= 3.4e22f;
        char ch2 ='\uface';//16bits (4 4 4 4)(0,1 , 2, 3,4 ,5,6,7,8,9,A,B,C,D,E,F)

        //System.out.println(octalnumber+"  "+ hexnumber);
        System.out.println(num);
        String str="hello world";
        float f= 14.5f;


        //pattern2_2();
        //pattern1();

//java strongly typed language

        // boolean result =doPrint();
        // System.out.println(result);



// 4%2 =4/2
        // for (int i =0;i< 100 ;i++){
        //     if(i==50){
        //         break;
        //     }
        //     //nested if else
        //     if(i%2 == 0){
        //         // if(i==50){
        //         //     break;
        //         // }
        //         continue;
        //     }
        //     else{

        //     }

        //     System.out.println("number is "+i);
        // }


       //for (int i=0; express;)

//         int i =0;
//         while(i < 5){//infinite loop
//             System.out.println(i);
//             i--;   //inc by one  ++i
//         }
// //loop => terminating condition 

    // int i=1;
    // while(i<=5){
    //     int odd = 2*i +1;
    //     System.out.println(odd);
    //     i++;
    // }
 
    // i =1;
    // while(i<12){
    //     System.out.println(i);
    //     i=i+2;
    // }
  
    // for(int j =1 ;j<=5; j++){
    //     System.out.println(j*2);
    // }

    //     System.out.println("iam done");
    // }
    }
}
// table of 2 , 3 ,7 , 9
// sum of first n natural number
// factorial of n => 



//loops condition fucntion  

/*
Ques=> print this pattern 
 *
 * *
 * * *
 * * * *
 * * * * *
 
 Ques2 
# # # # # 
# # # #  
# # #
# # 
#  

Ques 2.2
A A A A A 
B B B B
C C C
D D
E


Ques 3
A B C D E
F G H I
J K L
M N
o


 */

