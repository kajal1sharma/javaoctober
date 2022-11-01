class teacher {

    String teachername;
    int age;
    String dob;
    String salary;
    String subject;
  
    void getsubjectTaught(){
        System.out.println("subject taught by teacher:"+subject);
    }

    void printInfo(){
      System.out.println("name of the teacher is : "+teachername);
      System.out.println("age of the teacher is  :"+age);
      System.out.println("dateOfBirth of teacher : "+dob);
      System.out.println("salary of the teacher : "+salary);
     // System.out.println("subject taught by teacher:"+subject);
    }
  
  }

class Student {
  //class can contain => properties and methods

  String name;
  int rollnumber;
  String dateOfBirth;
  String standard;

  void printInfo(){
    System.out.println("name of the Student is : "+name);
    System.out.println("roll number of the student is  :"+rollnumber);
    System.out.println("dateOfBirth of student : "+dateOfBirth);
    System.out.println("standard of student : "+standard);
  }

}

class ObjectandClassesExample2{
    public static void main(String[] args) {

        // Student ref= new Student();
        // ref.name="neeta";
        // ref.rollnumber=23;
        // ref.dateOfBirth ="12/12/12";
        // ref.standard="1st";
        // ref.printInfo();

        // Student ref2 =new Student();
        // ref2.name="tia";
        // ref2.rollnumber=34;
        // ref2.standard="3rd";
        // ref2.dateOfBirth="13/08/12";
        // ref2.printInfo();

        teacher ref= new teacher();
        ref.teachername="neeta";
        ref.age=37;
        ref.dob ="13/12/1986";
        ref.salary="25k";
        ref.subject="english";
        ref.getsubjectTaught();

        teacher ref2 =new teacher();
        ref2.teachername="siya";
        ref2.age=34;
        ref2.salary="45k";
        ref2.dob="13/08/1989";
        ref2.subject="maths";
        ref.getsubjectTaught();

        // String str = new String(); 
        //in case of objects identifieres are called as references        
       
    
    }
}

// create new class => teacher 
//properties => name , age , salary, dob, subject
//methods => printInfo, getsubjectTaught