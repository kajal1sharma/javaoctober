
// x= a1+ib1;
// y = a2+ib2;
// z = x+y = (a1+a2) +i(b1+b2);

class Complex{
    double real;
    double img;

    void input(double a, double b){
        this.real= a;
        this.img= b;
    }
    void display(){
        System.out.println("x = "+this.real+" + i"+this.img);
    }
    void add(Complex x , Complex y){
        this.real= x.real+y.real;
        this.img = x.img +y.img;
    }

   static Complex addComplex(Complex x , Complex y){
            Complex z =new Complex();
            z.real = x.real + y.real;
            z.img =x.img +y.img;
            return z;
   }
}


public class ComplexTest {
    public static void main(String[] args) {
        
        Complex x= new Complex();
        x.input(2, 4);
        x.display();
        Complex y = new Complex();
        y.input(3, 6);
        y.display();

        Complex z= new Complex();
        z.add(x, y);
        z.display();

        Complex q =Complex.addComplex(x, y);
        q.display();
    }
}

