package seminars.third.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import thirdSeminar.tdd.User;
import thirdSeminar.tdd.UserRepository;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {
    UserRepository userRepository;

    @BeforeEach
    void setUp() {
        userRepository = new UserRepository();
    }

    @Test
    void checkAddUser() {
        User user = new User("test", "test", false);
        userRepository.addUser(user);
        assertEquals(userRepository.size(), 1);
    }

    @Test
    void checkAutificationTrue() {
        User user = new User("test", "test", true);
        assertTrue(user.authenticate("test", "test"));
    }

    @Test
    void checkAutificationFalseName() {
        User user = new User("test", "test", true);
        assertFalse(user.authenticate("tes", "test"));
    }

    @Test
    void checkAutificationFalsePassword() {
        User user = new User("test", "test", true);
        assertFalse(user.authenticate("test", "tes"));
    }

    @Test
    void checkAutificationFalseNamePassword() {
        User user = new User("test", "test", true);
        assertFalse(user.authenticate("tes", "tes"));
    }

    @Test
    void checkLoginAdminResultFalse() {
        User user = new User("test", "test", true);
        assertFalse(userRepository.loginTrue(user));
    }

    @Test
    void checkLoginAdminResultTrue() {
        User user = new User("test", "test", false);
        assertTrue(userRepository.loginTrue(user));
    }
}