package org.pts.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.pts.demo.util.JwtUtil;
import org.pts.demo.model.Users;
import org.pts.demo.repository.UsersRepository;

@Service
public class AuthenticationService {

    @Autowired
    private UsersRepository userRepository;

    @Autowired
    private JwtUtil jwtUtil;

    public String authenticate(String email, String password) {
        Users user = userRepository.findByEmail(email);

        if (user != null && user.getPassword().equals(password)) {
            String jwtToken = jwtUtil.generateToken(user.getUsername());

            user.setJwtToken(jwtToken);
            userRepository.save(user);

            return jwtToken;
        } else {
            return null;
        }
    }
}
