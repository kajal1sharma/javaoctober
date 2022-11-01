

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

        Student ref= new Student();
        ref.name="neeta";
        ref.rollnumber=23;
        ref.dateOfBirth ="12/12/12";
        ref.standard="1st";
        ref.printInfo();

        Student ref2 =new Student();
        ref2.name="tia";
        ref2.rollnumber=34;
        ref2.standard="3rd";
        ref2.dateOfBirth="13/08/12";
        ref2.printInfo();


        // String str = new String(); 
        //in case of objects identifieres are called as references        
       
    
    }
}