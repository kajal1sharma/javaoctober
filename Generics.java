

class Calculation <Type1, Type2>{
    private Type1 a ;
    private Type2 b;
    void setA(Type1 a){
        this.a=a;
    }
    void setB(Type2 b){
        this.b=b;
    }
   
    public Type1 getA(){
        return a;
    }
    public Type2 getB(){
        return b;
    }
    public void printNum(){
        System.out.println(a.toString()+"  "+b.toString());
    } 
}
class Generics{

    public static void main(String[] args) {
        Calculation<Integer, Integer> cal = new Calculation<Integer, Integer>();
        Integer i2=90;
        cal.setA(23);//implicitly converted into an object
        cal.setB(i2);
        cal.printNum();
        Calculation<Float, Integer> cal2 =new Calculation<Float, Integer>();
        cal2.setA(23.2f);
        cal2.setB(24);
        cal2.printNum();
       
       
        
        
        // Calculation c= new Calculation();
        // c.setA(10);
        // c.setB(90);

        // c.add();     
        // int => Integer;
        // float => Float;
        // double=>Double;
        // boolean => Boolean;
        // long=> Long;
        // char => Character;
        // byte=> Byte;



        // int a=90;
        // Integer i=90;
      
    }
}