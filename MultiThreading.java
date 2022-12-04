import javax.swing.plaf.multi.MultiTableHeaderUI;

//Thread inherit  (extends )
//Runnable interface (inplement)
//public class MultiThreading implements Runnable
public class MultiThreading extends Thread{

    public static int arr[][];
    int rowStart;
    int rowEnd;
    int colStart;
    int colEnd;

    MultiThreading(int rowStart, int rowEnd, int colStart, int colEnd){
        this.rowStart =rowStart;
        this.colStart=colStart;
        this.rowEnd=rowEnd;
        this.colEnd=colEnd;
    }

   
    public void run( ){
        int sum=0 ;
        for(int  i=rowStart ; i<=rowEnd; i++){
            for(int j =colStart ; j<=colEnd ;j++){
             sum+= arr[i][j];
            }
        }
        System.out.println("sum of this seg : = "+sum );
    }

    public static void main(String[] args) {
       
        // MultiThreading mt = new MultiThreading();
        // mt.start();
        // for(int i =0 ; i<100; i++){
        //     System.out.println("first thread  :  "+i);
        // }
        
        int m =6;
        int n=6;
        arr =new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=1;
            }
        }
        int mid= m/2;
        //(m=6 n =6 => mid=6/2=3)
       
        MultiThreading thread1 = new MultiThreading(0 , mid-1, 0, mid-1 );
        MultiThreading thread2 = new MultiThreading(mid , m-1, 0, mid-1);
        MultiThreading thread3 = new MultiThreading( 0,mid-1, mid, m-1);
        MultiThreading thread4 = new MultiThreading(mid, m-1, mid, m-1);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        // [1,2,3 | ,4,5,6]
        // [2,3,4,|  5,6,7]
        // [3,4,5,|  6,7,8]
        //-------------------
        // [3,4,5,|  6,7,8]
        // [3,4,5,|  1,2,3]
        // [1,2,3,|  5,6,7]


    }
  

}

