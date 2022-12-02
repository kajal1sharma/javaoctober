class StudentException extends Exception{
    // Exception(msg){

    // }
    
    StudentException(){
        super();
    }
    StudentException(String msg){
            super(msg);
        }
} 
class Student{
    private int rollno;

    void setRollno(int roll) throws StudentException{
        //try{
            if(roll<0){
               //let obj = new Exception("roll no is not valid");
              //  throw obj;
            // throw new Exception("roll no is not valid");

              StudentException obj = new StudentException("roll no is not valid");
              throw obj;
            }
            else{
                this.rollno=roll;
            }
        //}
        // catch(Exception e){
        //     this.rollno=0;
        //     System.out.print(e);
        // }
        
        
    }
}
public class ExceptionHandling {
    public static void main(String[] args) {
         //try catch finally 
         //exception => call stack (noraml )=> exception obj
            Student st =new Student();
            try{
            st.setRollno(-90);
            }
            catch(Exception e){
                System.out.print(e);
            }
    }
}
