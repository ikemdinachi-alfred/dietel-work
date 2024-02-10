package libraryManagementApp;

import LibrarayManagementApplication.Users;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersTest {
    Users users;

    @BeforeEach
    public void usersName() {
        users = new Users("name", "phoneNumber", "id", "address","password");
    }

    @Test
    public void testUsersName() {
        assertEquals("name", users.getUserName());
    }

    @Test
    public void testUsersPhoneNumber() {
        assertEquals("phoneNumber", users.getPhoneNumber());
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

