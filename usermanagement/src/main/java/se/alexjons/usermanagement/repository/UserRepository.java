package se.alexjons.usermanagement.repository;

import org.springframework.stereotype.Repository;
import se.alexjons.usermanagement.model.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private final List<User> users = new ArrayList<>();

    public UserRepository() {
        users.add(new User(1, "Alex", "Jons", "alexjons@email.se", 25));
        users.add(new User(2, "Bob", "Bobas", "bob@email.com", 30));
        users.add(new User(3, "Carl", "Larc", "carl@email.com", 35));
        users.add(new User(4, "Daniel", "D", "dd@email.com", 25));
    }

    public List<User> getAll() {
        return users;
    }

    public User save(User user) {
        int nextId = users.stream()
                .mapToInt(User::getId)
                .max()
                .orElse(0) + 1;
        user.setId(nextId);
        users.add(user);
        return user;
    }

    public User findById(int id) {
        return users.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<User> findByAge(int age) {
        return users.stream()
                .filter(u -> u.getAge() == age)
                .toList();
    }
}
