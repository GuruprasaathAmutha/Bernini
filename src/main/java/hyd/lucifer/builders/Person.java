package hyd.lucifer.builders;

public class Person {

    private String Firstname;
    private String Lastname;
    private String PhoneNumber;
    private String Address;


    public Person(String address, String lastname, String firstname, String phoneNumber) {
        Address = address;
        Lastname = lastname;
        Firstname = firstname;
        PhoneNumber = phoneNumber;
    }

    public String getName() {
        return Firstname + " " + Lastname;
    }

    public static void main(String[] args) {
        System.out.println("This is getting printed out from main method suckazzz!!! Well done");
        for (String s : args) {
            System.out.println(s);
        }
    }


//    public class Builder {
//
//        private String Firstname;
//        private String Lastname;
//        private String PhoneNumber;
//        private String Address;
//
//        public Builder() {
//
//        }
//
//    }


}
