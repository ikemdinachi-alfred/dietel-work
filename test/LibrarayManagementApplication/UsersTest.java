package LibrarayManagementApplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersTest {
    Users users;

    @BeforeEach
    public void usersName() {
        users = new Users("name", "phonenumber", "id", "address");
    }

    @Test
    public void testUsersname() {
        assertEquals("name", users.getName());
    }

    @Test
    public void testUsersPhoneNumber() {
        assertEquals("phonenumber", users.getPhoneNumber());
    }

    @Test
    public void testUsersAddress() {
        assertEquals("address", users.getAddress());

    }

    @Test
    public void testUsersId() {
        assertEquals("id", users.getId());
    }


}

