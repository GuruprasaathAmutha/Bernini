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

    @Override
    public String toString() {
        return "Person{" +
                "Firstname='" + Firstname + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", Address='" + Address + '\'' +
                '}';
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


    public static class PersonBuilder {

        private String Firstname;
        private String Lastname;
        private String PhoneNumber;
        private String Address;

        public PersonBuilder setLastname(String lastname) {
            Lastname = lastname;
            return this;
        }

        public PersonBuilder setFirstname(String firstname) {
            Firstname = firstname;
            return this;
        }

        public PersonBuilder setPhoneNumber(String phoneNumber) {
            PhoneNumber = phoneNumber;
            return this;
        }

        public PersonBuilder setAddress(String address) {
            Address = address;
            return this;
        }

        public Person getPerson() {
            return new Person(Address, Lastname, Firstname, PhoneNumber);
        }
    }


}
