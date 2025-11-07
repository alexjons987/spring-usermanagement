package se.alexjons.usermanagement.repository;

import org.springframework.stereotype.Repository;
import se.alexjons.usermanagement.model.User;
import se.alexjons.usermanagement.model.dto.UserDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {
    private final List<User> users = new ArrayList<>();

    public UserRepository() {
        users.add(new User(1, "Alex", "Jons", "alexjons@email.se", 25, LocalDate.now()));
        users.add(new User(2, "Bob", "Bobas", "bob@email.com", 30, LocalDate.now()));
        users.add(new User(3, "Carl", "Larc", "carl@email..com", 35, LocalDate.now()));
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

    public User findByAge(int age) {
        return users.stream()
                .filter(u -> u.getAge() == age)
                .findFirst()
                .orElse(null);
    }
}
