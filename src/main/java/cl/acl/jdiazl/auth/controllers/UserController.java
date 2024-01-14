package cl.acl.jdiazl.auth.controllers;

import cl.acl.jdiazl.auth.models.dto.CreateUserDTO;
import cl.acl.jdiazl.auth.models.dto.UserDTO;
import cl.acl.jdiazl.auth.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth")
public class UserController {

    @Autowired
    private AuthService authService;

    @GetMapping
    List<UserDTO> index() {
        return authService.findAll();
    }

    @PostMapping("/register")
    UserDTO register(@RequestBody CreateUserDTO createUserDTO) {
        return authService.register(createUserDTO);
    }
}
