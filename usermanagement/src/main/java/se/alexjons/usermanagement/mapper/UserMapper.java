package se.alexjons.usermanagement.mapper;

import org.springframework.stereotype.Component;
import se.alexjons.usermanagement.model.User;
import se.alexjons.usermanagement.model.dto.UserDTO;

@Component
public class UserMapper {
    public UserDTO toDTO(User user) {
        if (user == null) return null;

        return new UserDTO(user.getFname(), user.getLname(), user.getEmail(), user.getAge());
    }

    public User toEntity(UserDTO userDTO) {
        if (userDTO == null) return null;

        return new User(
                userDTO.getFname(),
                userDTO.getLname(),
                userDTO.getEmail(),
                userDTO.getAge()
        );
    }
}
