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
            // Student st =new Student();
            // try{
            // st.setRollno(-90);
            // }
            // catch(Exception e){
            //     System.out.print(e);
            // }

            String str="askksa";
            boolean flag=true;
            for(int i =0, j=str.length()-1;i<str.length()/2;i++, j--){
                if(str.charAt(i)==str.charAt(j)){
                    continue;
                }
                else{
                 
                    flag= false;
                    break;
                }
            }

            if(flag==true){

                System.out.println("it is a plaindrome");
            }
            else{
                System.out.print("not a palindrome");
            }
    }
}
