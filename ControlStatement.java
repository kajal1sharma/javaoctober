public class ControlStatement {
    static int  addNumbers(int a, int b, int c){
        int result =a+b+c;
        return result;
    }
    public static void main(String[] args) {
        //if(boolean)=>condition(expression) =>true/ false
        //boolean true / false
        // relational operaors == >= <=, > ,<
        //variable boolean 
        // logical operator 

        int num=10;
        boolean a=true;
        boolean b=false;

        //truth table (and) && 
        // false false => false
        // false true => false
        // true  false => false
        // true  true => true

        if(a && b){
            System.out.println("iam in if block");
        }
        else{
            System.out.println(" iam in else block");
        }

        //expressions => (solvable)
       int a1=1;
       int a2=2;
       int a3=3;
       int result = a1+a2+a3;
       result =a1*a2+a3;
       result = addNumbers(a1,a2,a3) +  a2 + a1 + a3;
       //addNumbers(a1, a2, a3) => this will be replaced by the result that is returnd from the function

    }
}
