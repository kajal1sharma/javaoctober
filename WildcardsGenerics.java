import java.nio.file.WatchEvent;
import java.util.Stack;

class Test<Type>{
    Type num;

    Test (Type num){
        this.num =num;
    }

    void printString(Test<?> arg){
        String str= this.num.toString()+"--"+arg.num.toString();
        System.out.println(str);
    }

}

public class WildcardsGenerics {

    public static void main(String[] args) {

        Integer i=90;
        Integer i2=100;
        Float f= 45f;
        Test<Integer> num1 = new Test<Integer>(i);
        Test<Integer> num2 = new Test<Integer>(i2);
        Test<Float> num3 =new Test<Float>(f);
        num1.printString(num2);
         num1.printString(num3);

         Stack<Integer> st = new Stack<Integer>();
         st.push(23);
         st.push(45);
         st.push(233);
         st.push(12);
         st.pop();
        System.out.println("current top"+st.peek());
    }
}
