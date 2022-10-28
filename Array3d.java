public class Array3d {
    public static void main(String[] args) {
        int [][][]arr = new int[][][]{{{1,2,3},{1,2,3},{1,2,3}},{{1,2,3},{3,4,5},{3,4,5}},{{3,4,5},{3,4,5},{6,7,8}}};
      //sum of all the ele in 3 d matrix
        for(int i  =0;i<3;i++){//row
            for(int j=0; j< 3;j++){//col
                for(int k=0;k<3;k++){//slices
                    System.out.print(arr[i][j][k]+" , ");
                }
                System.out.println();
            }
            System.out.println("+++++++++++++++++++++++++++++++");
        }

    }
}
