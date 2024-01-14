package cl.acl.jdiazl.auth.services;

import cl.acl.jdiazl.auth.models.dto.CreateUserDTO;
import cl.acl.jdiazl.auth.models.dto.UserDTO;

import java.util.List;

public interface AuthService {
    List<UserDTO> findAll();

    UserDTO register(CreateUserDTO createUserDTO);
}
