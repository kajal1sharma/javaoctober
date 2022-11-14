class Student{
    // Student this;
    private String name;
    Student(){
        name ="akanksha";
        // this.name ="akanksha";
    }
    void getInfo(){
        //this is also object reference like obj and obj2
        // this.name ="akanksha";

        System.out.println("value of this is : "+ this);

    }

}

class ThisOperator{
    public static void main(String[] args) {
        // any reference type variable can be initiaized with null or some reference(addr)
        Student obj = null ;
        obj = new Student();
        Student obj2 = new Student();
        System.out.println("what is inside obj : "+obj);
        obj.getInfo();
        System.out.println("what is inside obj2 : "+obj2);
        obj2.getInfo();
        // // obj is refernce 
        // int number;

        // //local variables should be initialized before using anywhere
        // int sum =0;
        // number=90;
        // sum =sum +number;

        
       
    }
    public static void getInfo(){
        //obj => not viwible here because obj is local to main to function
        int answer;
    }
}




// //tihs is the current object
// class Student{
//     private int rollNumber;
//     private int marks;
//     private String name;
//     private int standard;
//     private int id;

//     Student(){
//         this.rollNumber=0;
//         this.marks=0;
//         name="";
//         standard=0;
//         id=0;
//     }
// //setters getters
//     public void setName(String fullName){
//         this.name=fullName;
//     }
//     public String getName(){
//         return name;
//     }
//     public void setRollNumber(int roll_number){
//         rollNumber=roll_number;
//     }

// }
// public class ThisOperator {
//     // 
//     public static void main(String[] args) {
//         Student obj =new Student();
//         obj.setName("akanksha");
//         System.out.println(obj.getName());
//         // akansha.name="akanksha";
//         // akansha.rollNumber=34;
//         Student nawani =new Student();
//         nawani.setName("nawani");
//         // nawani.name="nawani";
//         // nawani.rollNumber=45;
//         System.out.println(nawani.getName());
//     }
// }
