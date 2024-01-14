package cl.acl.jdiazl.auth.models.dto;
import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserDTO {

    @NotBlank
    @Size(min = 4, max = 30)
    private String username;

    @NotBlank
    @Size(min = 4, max = 100)
    @Pattern(regexp = "^[a-zA-Z0-9_.+-]{3,30}@[a-zA-Z0-9-]{3,30}\\.[a-zA-Z0-9-.]{2,10}", message = "debe estar en un formato correcto")
    private String email;

    @NotBlank
    @Size(min = 8, max = 16)
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]$", message = "debe tener tener una letra mayúscula, una letra minúscula, un número y un simbolo")
    private String password;

    private String confirmPassword;

    private List<String> roles;
}