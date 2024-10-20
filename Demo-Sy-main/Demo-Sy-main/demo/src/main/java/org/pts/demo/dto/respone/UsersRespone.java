package org.pts.demo.dto.respone;

import lombok.Data;
import org.pts.demo.model.Users;

import java.time.LocalDate;

@Data
public class UsersRespone {
    private String username;
    private String email;
    private String password;
    private Users.Gender gender;
    private LocalDate birthday;
}
