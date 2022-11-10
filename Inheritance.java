
interface TouchScreen{
    boolean haveTouchScreen =true;

    void canCall();
    void canMessage();
    void canPlayGames();
} 
interface KeyPad{
    boolean haveKeyPad =true;
    void canCall();
    void canMessage();
    void capturePhotos();
}

interface MixPhone  extends TouchScreen, KeyPad{
    //void canCall();
    //void canMessage();
    //void canPlayGames();
    //void capturePhotos();
}
class MixTypePhone implements MixPhone{
    public void canCall(){   }
    public void canMessage(){}
    public void canPlayGames(){}
    public void capturePhotos(){}
}

// class TouchScreenClass implements TouchScreen{

//     @Override
//     public void canCall() {
//         // TODO Auto-generated method stub
//         int a=90;
        
//     }
//     @Override
//     public void canMessage() {
//         int b=90+89;
//     }
//     public void canPlayGames(){
//         int c=90;
//     }
// }
// class TouchScreen{

// }
// class KeyPad{

// }

//multiple inheritance is not allowed
// class Mix extends TouchScreen , KeyPad{

// }


class Inheritance{
    public static void main(String[] args) {
        
    }
}


//child class  parent class 
//code re-use 

//mobile phones

// class Mobile{
//      boolean canCall ;
//      boolean canMessage;
//      String color;
//      int weight;
//      int height;
//      int ram ;

      
//      Mobile(){
//             canCall=true;
//             canMessage=true;
//             color="pink";
//             weight=250;
//             height=3;
//             ram =1;
//      }
// //parameterized cons 
//      void makeACall(){
//      }
//      void  messageSomeOne(){
//      }
// }

// class TypeA extends Mobile{
//     int internet;

//     TypeA(){
//             // canCall=true;
//             // canMessage=true;
//             // color="silver";
//             // weight=250;
//             // height=3;
//             // ram =1;
//             super();
//             internet= 2;
//     }

//      void runInternet(){
//      }
    
// }

// class TypeB extends  TypeA{
//     int cameraSize;
//     TypeB(){
//         super();
//         cameraSize= 12;
//     }
//     void captureImage(){
//     }
// }

// //camera and standard options   without internet
// // class TypeC extends Mobile{
// //     boolean videoCalling;
// //     int cameraSize;
// // }

// public class Inheritance {
//     public static void main(String[] args) {
        
//         Mobile m1 =new Mobile();
//         System.out.println("mobile m1 color : "+m1.color);
//         TypeA m2 =new TypeA();
//         System.out.println("mobile m2 color : "+m2.color);
//         TypeB m3 =new TypeB();
//         System.out.println("mobile m3 color : "+m3.color); 
//         System.out.println("mobile m3 camera  : "+m3.cameraSize);     

//     }
// }



/*
 * class Parent{
    int height;
    int weight;
    String surname;
    int money;
    String color;

    void displayInfo(){
        System.out.println("hi iam going to display all info ");
    }
}

class Child extends Parent{
//this child will have all the properties of the parent 
}
 */