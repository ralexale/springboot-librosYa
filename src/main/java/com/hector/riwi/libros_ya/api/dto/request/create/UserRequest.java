package com.hector.riwi.libros_ya.api.dto.request.create;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    @NotBlank(message = "the fullname is required")
    @Size(
            max = 100,
            message = "the username must be less than 100 characters"
    )
    private String fullname;

        @Email(message = "the email must be a valid email")
    private String email;

    @NotBlank(message = "the username is required")
    @Size(
            max = 50,
            message = "the username must be less than 50 characters"
    )
    private String username;


    @NotBlank(message = "the password is required")
    @Size(
            max = 20,
            min = 8,
            message = "the password must be between 8 and 20 characters"
    )
    @Pattern(
            regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#\\$%\\^&\\*])(?=\\S+$).{8,20}$",
            message = "Password must contain at least one digit, one lowercase letter, one uppercase letter, one special character, and no whitespace"
    )
    private String password;

    @NotBlank(message = "the role field is required")
    private String role;
}
