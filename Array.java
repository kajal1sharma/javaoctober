import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] student = new int[10];//int [] // new keyword is used to create an object 
//base Addd + index*data_type_size
        //input
        for(int i=0;i< 10 ;i++){
            student[i] = sc.nextInt();
        }
        //printing
        for(int i=0;i< 10 ;i++){
            System.out.print(student[i]+" ");
        }

        //int student1 =20;// int 
        // int student2 =14 ;
        // int student3 =15;

        // int maxMarks =0;

        // if(student1>student2 && student1> student3 ){maxMarks =student1;}
        // else if(student2> student1 && student2>student3){maxMarks =student2;}
        // else{
        //     maxMarks =student3;
        // }
    }
}