//getter setter fucntions
class Calculator{

    private int num1;
    private int num2;

    public void setInput1(int n){
        
        num1=n;
        //we need setter functions when we want validations
        // if(n<0){
        //     num1=0;
        // }
        // else{
        //     num1= n;
        // }
    }
    public void setInput2(int n){
        num2= n;
    }

    public int getInput1(){
        return num1;
    }
    public int getInput2(){
        return num2;
    }


    public void addNumber(){
       
        int result = num1+num2;
        System.out.println(result);
    }

    public void multiplyNumbers(){
        int result = num1 * num2 ;
        System.out.println(result);
    }

    public void subtractNumbers(){
        int result = num1- num2;
        System.out.println(result);
    }

}
class CalculatorTest {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        // obj.num1 =90 ;
        // obj.num2 =90;
        obj.setInput1(90);
        obj.setInput2(90);
        
        int val1 = obj.getInput1();
        int val2 = obj.getInput2();

        System.out.println("value 1 : "+val1+"  Value 2 : "+val2);

        obj.addNumber();
        obj.multiplyNumbers();
        obj.subtractNumbers();
        // Calculator.addNumber()
    }
}
