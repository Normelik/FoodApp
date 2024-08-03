package com.foodapp.backend.DTOs;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RequestUserDto {
    @NotEmpty(message = "Username should not be empty")
    private String userName;

    @NotEmpty(message = "Password should not be empty")
    private String password;

    public String getUsername() {
        return userName;
    }

    public void setUsername(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
