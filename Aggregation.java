class Address{
    String pincode;
    String city;
    String state;
    String landmark;
    String houseNumber;
    //parameterized
    Address(String pincode , String city, String state, String landmark, String houseNumber){
            this.pincode = pincode;
            this.city =city;
            this.state =state;
            this.landmark =landmark;
            this.houseNumber =houseNumber;
    }
}

class Person {
    String name;
    String mobileNumber;
    Address address;

    Person(String name, String mobileNumber , Address address){
        this.name=name;
        this.mobileNumber=mobileNumber;
        this.address =address;
    }
}

public class Aggregation {
    public static void main(String[] args) {
        // Address a1 =new Address("1123", "pune","maharashtra","gurudwara","45");
        // Address a2 =new Address("2345","kolkata","west bengal", "nali gali","56");
        // Address a3 =new Address("34234", "dehradun","uttrakhand", "clinic","89");

        // Person p1= new Person("neeta","1231231", a1);
        // Person p2 =new Person("pooja", "3i309530-", a2);
        // Person p3 =new Person("tina", "435094053", a3);

        

    }
}

//write a program with address and person 
//person class should have fucntion => getInfo(), getAddress(), setAddress(), setName(), SetMobileNumber(),
//parameterizedd constructor for both classes
//keep all the properties of both the classes as private
