class Final{

    final static int num=90;
    final private int a;
    final private int b=900;
    //values assinged to final propeties cannot be changed 
    //final values can be assigned only once
    
    Final(int val){
        this.a=val;
       // this.b=val;
    }
    int  getA(){
        return a;
    }
    void display(){
        // this.a= 100;
        System.out.println("value of a = "+a);
    }
    public static void main(String[] args) {
        Final t= new Final(34);
        // t.num=100;
        t.getA();
        t.display();
        Final t2 =new Final(89);
        // t2.num=900;
        System.out.println(t.num+"  "+t2.num+"  "+Final.num);
    }
}

//t(a=90) r(34) a(a=78) w(a=76) 