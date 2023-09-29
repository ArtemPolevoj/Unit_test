package thirdSeminar.tdd;

import thirdSeminar.tdd.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public void addUser(User user) {
        data.add(user);
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public boolean loginTrue(User user) {
        boolean login = false;
        if (user.isAdmin) {
            login = false;
        } else {
            if (user.authenticate(user.name, user.password)) {
                login = true;
            }
        }
        return login;
    }
    public  int size(){
        return data.size();
    }
}