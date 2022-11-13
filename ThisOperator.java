//tihs is the current object
class Student{
    private int rollNumber;
    private int marks;
    private String name;
    private int standard;
    private int id;

    Student(){
        this.rollNumber=0;
        this.marks=0;
        name="";
        standard=0;
        id=0;
    }
//setters getters
    public void setName(String fullName){
        this.name=fullName;
    }
    public String getName(){
        return name;
    }
    public void setRollNumber(int roll_number){
        rollNumber=roll_number;
    }

}
public class ThisOperator {
    // 
    public static void main(String[] args) {
        Student obj =new Student();
        obj.setName("akanksha");
        System.out.println(obj.getName());
        // akansha.name="akanksha";
        // akansha.rollNumber=34;
        Student nawani =new Student();
        nawani.setName("nawani");
        // nawani.name="nawani";
        // nawani.rollNumber=45;
        System.out.println(nawani.getName());
    }
}
