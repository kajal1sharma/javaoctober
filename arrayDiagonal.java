public class arrayDiagonal {
    public static void main(String[] args) {





        //program of square matrix(number of rows==number of columns)
        // int [][]arr =new int[][]{{2, 3, 4 ,3},
        //                          {4, 5, 6, 4},
        //                          {6, 7 ,8, 8},
        //                          {3, 4, 5, 7}};


        // for(int i=0;i< arr.length ;i++){
            
        //     for(int j=0;j<arr[i].length;j++){
        //         //System.out.print("("+i+" , "+j+")  ");
        //         if(i<=j)
        //         System.out.print("("+arr[i][j]+")   ");
        //     }
        //     System.out.println();
        // }
        
        
        // index of 2 =>0,0
        // index of 5 =>1,1
        // index of 8 => 2,2
        //lower triangle=>
        // 2 0 0
        // 4 5 0
        // 6 7 8
        // outer elements(boundary)
        //2         3       4       3
        //(0,0)    (0,1)    (0,2)   (0,3)

        //4         0       0       4
        //(1,0)     (1,1)   (1,2)   (1, 3)

        //6         0       0       8
        //(2,0)     (2,1)   (2,2)   (2,3)

        //3         4       5       7 
        //(3,0)     (3,1)   (3,2)   (3,3)


        // for(int i= 0; i< arr.length;i++){
        //     for(int j=0 ; j< arr[i].length; j++){
        //         if(i==j)
        //         System.out.print(arr[i][j]+" ");
        //         else{
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println("");
        // }
        

    }
}
