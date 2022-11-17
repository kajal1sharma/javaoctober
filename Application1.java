import java.util.Scanner;

class Address{
    private int houseNumber;
    private String city;
    private String state;
    private String zipCode;

    Address(){
        houseNumber = 0;
        city = "NA";
        state ="NA";
        zipCode="NA";
    }

    Address(int houseNumber, String city, String state, String zipCode){
        this.houseNumber=houseNumber;
        this.city=city;
        this.state =state;
        this.zipCode =zipCode;

    }
    public void enterAddressInfo(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your house number");
        this.houseNumber= sc.nextInt();
        System.out.println("Enter your state");
        
        this.state=sc.next();

    }
    public void showInfo(){
        System.out.println(this.houseNumber+"  "+this.state);
    }
}

class Parent{
    private String nameOfMother;
    private String nameOfFather;
    private String occupationOfMother;
    private String occupationOfFather;

    Parent(){
        nameOfFather="NS";
        nameOfMother="NS";
        occupationOfFather="NS";
        occupationOfMother="NS";

    }
    Parent(String nameOfFather,String nameOfMother,String occupationOfFather,String occupationOfMother){
        this.nameOfFather=nameOfFather;
        this.nameOfMother=nameOfMother;
        this.occupationOfFather=occupationOfFather;
        this.occupationOfMother=occupationOfMother;

    }
}

class Student{
    private String college;
    private String name; 
    private int rollNumber;
    private int sub1Marks;
    private int sub2Marks;
    private int sub3Marks;
    private int sub4Marks;
    private int totalMarks;
    private int marks10th;
    private int marks12th;
    private String branch;
    private int year;
    private Address address;
    private Parent parentdetail;
    

    Student(){
        college = "MIT";
        name ="NS"; 
        rollNumber =0;
        sub1Marks =0;
        sub2Marks=0;
        sub3Marks=0;
        sub4Marks=0;
        totalMarks=0;
        marks10th=0;
        marks12th=0;
        branch="NS";
        year=0;
        address=null;
        parentdetail=null;
    }
    Student (String name,int rollNumber,int sub1Marks,int sub2Marks,int sub3Marks,int sub4Marks,int totalMarks, int marks10th,int marks12th,String branch,int year,Address address,Parent parentdetail){
        this.college="MIT";
        this.name =name; 
        this.rollNumber =rollNumber;
        this.sub1Marks =sub1Marks;
        this.sub2Marks=sub2Marks;
        this.sub3Marks=sub3Marks;
        this.sub4Marks=sub4Marks;
        this.totalMarks=totalMarks;
        this.marks10th=marks10th;
        this.marks12th=marks12th;
        this.branch=branch;
        this.year=year;
        this.address=address;
        this.parentdetail=parentdetail;
    }
    public void enterInfo(){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter your name");
        this.name= sc.nextLine();
        System.out.print("enter your rollNumner");
        this.rollNumber=sc.nextInt();
        this.address= new Address();
        this.address.enterAddressInfo();
    }


    public void showInfo(){
        System.out.println(this.name+"  "+this.rollNumber);
        this.address.showInfo();
    }
}

class Car{
    static String company="Tata motors";
    String color=null;
    int height=0;
    int weight=0;
    Car(){
        this(90, 80);
        color="white";
        height=900;
        weight=800;
    }
    Car(int height , int weight){//Car(int , int)

    }

    // Car(int eheight2, int weight2){//Car(int , int)

    // }

    Car(String usercolor){
        // this(12 , 12);
        
        this();//Car();
        this.color=usercolor;
    }

} 

public class Application1 {
    public static void main(String[] args) {
        
        Car car2= new Car();
        Car car3 =new Car("red");//{color=red, height=0,weight=0}
        Car car4 =new Car();
       //car2.height
        System.out.println(Car.company);//static variables /function => class level entities=> call them with class name


        // System.out.print(" Welcome to MIT University ");
        // System.out.println("Enter your Details");
        // Student st =new Student();
        // st.enterInfo();
        // st.showInfo();
        
    }
}


//statement => students records, top scorer, compare two students 

//student => name , marks , address, year, branch, college, mobile,10th amrks , 12th marks 
// address => house number , loaclity, zipcode, state, city
// parent => mother's name, fathers name, occupation mother, fathers occupation
//