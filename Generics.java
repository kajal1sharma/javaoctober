

class Calculation <Type>{
    private Type a ;
    private Type b;
    void setA(Type a){
        this.a=a;
    }
    void setB(Type b){
        this.b=b;
    }

    public Type getA(){
        return a;
    }
    public Type getB(){
        return b;
    }
    public void printNum(){
        System.out.println(a.toString()+"  "+b.toString());
    } 
}
class Generics{

    public static void main(String[] args) {
        Calculation<Integer> cal = new Calculation<Integer>();
        Integer i2=90;
        cal.setA(23);//implicitly converted into an object
        cal.setB(i2);
        cal.printNum();
        Calculation<Float> cal2 =new Calculation<Float>();
        cal2.setA(23.2f);
        cal2.setB(24.3f);
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