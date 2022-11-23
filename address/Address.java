package address;

public class Address{
    private int houseNo;//private data in not inherited
    //when u dont mention modifier => default
    protected String city;
    String state;
    public String pincode;

    public Address(){
        houseNo=90;
        city="pune";
        state="mh";
        pincode="909090";
    }
}

