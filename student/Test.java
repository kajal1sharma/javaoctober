package student;

import address.Address;

class Student extends Address {
    int rollno;
    int marks;
    String name;
  
    Student(){
        // super();
        rollno=10;
        marks=90;
        name="abc";
    }
    
    void printinfo(){
        //System.out.println(this.rollno+"  "+this.marks+"  "+this.houseNo);  
        System.out.println(this.rollno+"  "+this.marks+"  "+this.city+this.pincode+this.state);  
    }
}

class Test{
    public static void main(String[] args) {
        Student st= new Student(); 
           st.printinfo();
    }
}