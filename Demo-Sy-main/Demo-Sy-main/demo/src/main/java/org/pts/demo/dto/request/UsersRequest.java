package org.pts.demo.dto.request;

import lombok.Data;

@Data
public class UsersRequest {
    private String email;
    private String password;
}
