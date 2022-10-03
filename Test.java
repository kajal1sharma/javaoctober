class Test{

        static int factorial2( int n){

                //3! = 3*2*1
                //4! = 4*3*2*1
                //0!= 1
                int factResult =1;
                for (int i=n ; i<=1; i--){
                        System.out.println(i+" * ");
                        factResult= factResult*i;
                }
                return factResult;

        }

       static int factorial( int n){

                //3! = 3*2*1
                //4! = 4*3*2*1
                //0!= 1

                int factResult = 1;// right part of assignment operator (=) will run first 
                for (int i=n ; i>=1; i--){
                        System.out.print(i+" * ");//"1 * "
                        factResult= factResult*i;

                }
                
                return factResult;


        }
         
        public static void main(String[] args) {
                // String str ="strig 1";
                // String str2 ="string 2";
                // int num =2;
                // String str3 = str+str2+num;

                
                 int n=3;
                //this value of n will come from user 
                
               int result =  Test.factorial(n);//jvm =>search a fucntion factorial inside Test class
               System.out.println("factorial result is  " + result );
        }
}




///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// class Calculator{
//         int a=90;
//         static void printIt(){
//                 System.out.println("iam a static method of Calculator class");
//                 //12
//         }
//         void printItNonStatic(){
//                 System.out.println("iam not a static method of calculator class");
//         }
// }
// class Calculator2{
//         int a=90;
//         static void printIt(){
//                 System.out.println("iam a static method of Calculator class");
//         }
//         void printItNonStatic(){
//                 System.out.println("iam not a static method of calculator class");
//         }
// }
// class Test {
//         static void printIt(){

//         }

//         public static void main(String[] str) {
//                 int a =10; 
//                 Calculator  obj  =new Calculator();//create obj
//                 Calculator.printIt();
//                 obj.printIt();

//                 Test.printIt();
                
//                 obj.printItNonStatic();
//                 System.out.println(obj.a);
//                 System.out.println(a);
                
//         }

// }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//program to print addition of two numbers => 
//static and non static method access


// class Test{  
// //fucntion => contains single task implementation
// //class contain various functions
//    static int addition( int num1, int num2){
//         int sum = num1+num2;
//         return sum;

//    }

//    int multiply(int num1, int num2){
//         int product= num1*num2;
//         return product;
//    }

//     public static void main(String[] args) {
           



//         int num1=90;
//         int num2=70;

//         int result = Test.addition(num1, num2);
//         System.out.println("addition is : "+result);
          
//        // result = Test.multiply(num1, num2);

//        Test obj =new Test();
//        result = obj.multiply(num1, num2);
//        System.out.println("multiplication is  : "+result);
//        result =obj.addition(num1, num2);
//        System.out.println("addition is : "+result);
          
//        Calculator.printIt();


//     }
// }

