package cl.acl.jdiazl.auth.services;

import cl.acl.jdiazl.auth.models.dto.CreateUserDTO;
import cl.acl.jdiazl.auth.models.dto.UserDTO;
import cl.acl.jdiazl.auth.repositories.RoleRepository;
import cl.acl.jdiazl.auth.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<UserDTO> findAll() {
        return userRepository.findAll()
                .stream()
                .map((u) -> new UserDTO(u.getId(), u.getUsername(), u.getEmail(), List.of("ROLE_ADMIN", "ROLE_USER")))
                .collect(Collectors.toList());
    }

    @Override
    public UserDTO register(CreateUserDTO createUserDTO) {
        return null;
    }
}
