package com.park.demo_park_api.web.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UsuarioCreateDTO {

    @NotBlank
    @Email(message = "Formato do e-mail está inválido.")
    private String username;

    @NotBlank
    @Size(min = 6, max = 6)
    private String password;
}
