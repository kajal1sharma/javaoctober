//object 

class Resource{
    int data=0;
    //synchronized void addData2(){}
    // void addData(){
    //     for(int i=0;i<10;i++){
    //         data=10*i;
    //         System.out.println(Thread.currentThread()+"  "+data);
    //     }
    //     synchronized(this){
    //         for(int i=0;i<10;i++){
    //             data=10*i;
    //             System.out.println("part2 "+Thread.currentThread()+"  "+data);
    //         }
    //     }
      
    // }

    void doSomething(){

    }
}
class MultiThreading extends Thread{
    Resource obj;
    MultiThreading(Resource obj){
        this.obj=obj;
    }
    public void run(){
        // obj.addData();

        try{
        for(int i=0;i<5;i++){
            Thread.sleep(400);
            System.out.println(Thread.currentThread()+"-  "+i);
        }
    }catch(InterruptedException e){

    }
    }
}//join()

public class ThreadingSync {
    public static void main(String[] args) throws InterruptedException {
        //the resource which is shared among diff threads => synch
        Resource obj = new Resource();
        MultiThreading t1= new MultiThreading(obj);
        MultiThreading t2=new MultiThreading(obj);
       t1.start();
       t1.join();
       System.out.println("helo this is main");
       t2.start();
    }
}
