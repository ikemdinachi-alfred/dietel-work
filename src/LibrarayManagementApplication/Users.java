package LibrarayManagementApplication;

public class Users {
String name;
String phoneNumber;
String id;
String address;

    public Users(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Users(String name, String phoneNumber, String id, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }
    public String toString(){
        return String.format("""
                Name : %s
                Phone Number: %s
                Library ID No : %s
                Address: %s
                
                """, name,phoneNumber,id,address);
    }
}
