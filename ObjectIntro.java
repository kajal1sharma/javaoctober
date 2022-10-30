import java.util.Scanner;

class Test{
    // properties 
    // methods 
}


public class ObjectIntro{
    public static void main(String[] args) {
       
        String str=  new String("hello");
        String str2=new String("world");
        System.out.println(str);
        System.out.println(str2);

        str=str2;
        System.out.println(str);
        System.out.println(str2);
   
        String str3 =new String();
        str3 = str2;//world obj acces
        str3 =str;// world obj access


        //  String str=  new String("hello");
        //  String str2=new String("world");
         //Scanner scanner =new Scanner(System.in);
         //left hand side str, str2 and scanner => references
         
    }
}


// import java.util.Scanner;
// public class ObjectIntro {
// public static void main(String[] args) {
    
//         int arr2[] = new int[5];

//         int arrNew[][][] =new int[3][3][4];
//         //int arrNew2[][][] =new int[3][3][4];
        
//         for(int i=0 ;   i<3 ;i++){
//             for(int j=0;j<3; j++)
//             {for(int k = 0; k<3; k++){
//                 arrNew[i][j][k] = 4;
//             }
//         }
//     }
//         //sum
//         int sum =0;
//         for(int i=0 ;   i<3 ;i++){
//             for(int j=0;j<3; j++)
//             {
//                 for(int k = 0; k<3; k++){
//                // System.out.println("sum of m3d matrix"+arrNew[i][j][k]);
//                 // int sum=0;
//                 // sum=arrNew[i][j][k]+arrNew[i][j][k];
//                 sum = sum + arrNew[i][j][k];
//                 }

//             }
//         }

//         System.out.println(sum);
// //current output =>108 
// //answer => 144
// //?? what is the problem 
// //Ques =>  2 d matrix => row wise sum
// //Ques => 2 d matrix => col wise product


//     }
// }
