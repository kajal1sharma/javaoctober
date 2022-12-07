
class Calc{
    Number num1;
    Number num2;

    Calc(Number num1, Number num2){
        this.num1=num1;
        this.num2=num2;
    }

    void getResult(){
            
            System.out.println(num1.toString()+"  "+num2.toString());
            
    }

}

public class Generics2 {
    public static void main(String[] args) {
        Integer i1=10;
        Integer i2=90;
        Calc c =new Calc(i1,i2);
        c.getResult();   
        Double d1=10.2;
        Double d2=90.4;
        Calc c2 =new Calc(d1,d2);
        c2.getResult();   
    }
}
