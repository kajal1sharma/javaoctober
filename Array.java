import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        int arrNew[][] =new int[3][3];
        //1, 2, 3
        //2, 3, 4
        //4, 5, 7
        //answer => 1 3 7

//2 -D arrays
        int [][] arr1 =new int[3][2];//

        //row 0
        arr1[0][0]=12;
        arr1[0][1]=14;
        //row 1
        arr1[1][0]=11;
        arr1[1][1]=17;
        //row 2
        arr1[2][0]=19;
        arr1[2][1]=16;

        //arr1.length => how many rows are there
        //arr1[i].length=> number of elements in that particular row
        for(int i=0;i<arr1.length;i++){//ist loop is for row traversal
            System.out.println("\nRow  -- "+i);
            for(int j=0 ; j<arr1[i].length ; j++){
                System.out.print(arr1[i][j]+"  ");
            }
        }

        //number of elements are different in different rows

        //1st 4 ele 
        //2nd row 2ele
        //3rd row 5ele
        int [][]arr2 = new int[3][];
        arr2[0] = new int[]{1,2,3,4};
        arr2[1] =new int[]{3,4};
        arr2[2] =new int[]{3,5,6,8,9};
       System.out.println("next array ");
        for(int i=0;i<arr2.length;i++){//ist loop is for row traversal
            System.out.println("\nRow  -- "+i);
            for(int j=0 ; j<arr2[i].length ; j++){
                System.out.print(arr2[i][j]+"  ");
            }
        }
        // int [][]arr = new int[4][];

        // arr[0]= new int[2];
        // arr[1] =new int[4];
        // arr[2] =new int[1];
        // arr[3] =new int[4];

        // int [] studentarr =new int[5];
        // int studentarr2 [] =new int[5];
        // int[] studentarr3, studentarr4;
        // studentarr3 =new int[8];
        // studentarr4= new int[]{1 ,2 ,3 ,4};
        // int student5[], student6;
        // student5 =new int[4];
        // student6=34;


        //1 -D array 
        // Scanner sc = new Scanner(System.in);
        // int[] student = new int[]{10,20, 30, 40, 50 , 60};//initialization
        ;//int [] // new keyword is used to create an object 

        //base Addd + index*data_type_size
        // //input
        // for(int i=0;i< 10 ;i++){
        //     student[i] = sc.nextInt();
        // }
        //printing
        //student.length = auto detects the length of array int[5] length =5
        // for(int i=0;i< student.length;i++){
        //     System.out.print(student[i]+" ");
        // }

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
