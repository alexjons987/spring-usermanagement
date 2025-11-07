package se.alexjons.usermanagement.service;

import org.springframework.stereotype.Service;
import se.alexjons.usermanagement.mapper.UserMapper;
import se.alexjons.usermanagement.model.User;
import se.alexjons.usermanagement.model.dto.UserDTO;
import se.alexjons.usermanagement.repository.UserRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }


    public List<User> getAllUsers() {
        return userRepository.getAll();
    }

    public UserDTO createUser(UserDTO userDTO) {
        User user = userMapper.toEntity(userDTO);
        userRepository.save(user);

        return userMapper.toDTO(user);
    }

    public Optional<UserDTO> getUserById(int id) {
        User user = userRepository.findById(id);

        return Optional.of(userMapper.toDTO(user));
    }

    public Optional<UserDTO> getUserByAge(int age) {
        User user = userRepository.findByAge(age);

        return Optional.of(userMapper.toDTO(user));
    }
}
