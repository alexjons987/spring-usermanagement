package se.alexjons.usermanagement.service;

import org.springframework.stereotype.Service;
import se.alexjons.usermanagement.mapper.UserMapper;
import se.alexjons.usermanagement.model.User;
import se.alexjons.usermanagement.model.dto.UserDTO;
import se.alexjons.usermanagement.repository.UserRepository;

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


    public List<UserDTO> getAllUsers() {
        List<UserDTO> userDTOs = new ArrayList<>();

        for (User user : userRepository.getAll()) {
            userDTOs.add(userMapper.toDTO(user));
        }

        return userDTOs;
    }

    public Optional<UserDTO> createUser(UserDTO userDTO) {
        User user = userMapper.toEntity(userDTO);
        userRepository.save(user);

        return Optional.of(userMapper.toDTO(user));
    }

    public Optional<UserDTO> getUserById(int id) {
        User user = userRepository.findById(id);

        return Optional.of(userMapper.toDTO(user));
    }

    public List<UserDTO> filterUsersByAge(int age) {
        List<UserDTO> userDTOs = new ArrayList<>();

        for (User user : userRepository.findByAge(age)) {
            userDTOs.add(userMapper.toDTO(user));
        }

        return userDTOs;
    }
}
