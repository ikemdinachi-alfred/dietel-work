package LibrarayManagementApplication;

public class Users {
String userName;
String phoneNumber;
String id;
String address;
String password;

    public Users(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Users(String userName, String phoneNumber, String id, String address, String password) {
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.id = id;
        this.address = address;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getId() {
        return id;
    }

    public String getPassword(){
        return password;
    }

    public String getAddress() {
        return address;
    }
    public String toString(){
        return String.format("""
                User Name : %s
                Phone Number: %s
                Library ID No : %s
                Password : %s
                Address: %s
                
                """, userName,phoneNumber,id,password,address);
    }
}
