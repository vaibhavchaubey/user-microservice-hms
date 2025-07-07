package com.hms.user.service;

import com.hms.user.dto.UserDTO;
import com.hms.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void registerUser(UserDTO userDTO) {
        throw new UnsupportedOperationException("Unimplemented method: registerUser");
    }

    @Override
    public UserDTO loginUser(UserDTO userDTO) {
        throw new UnsupportedOperationException("Unimplemented method: loginUser");
    }

    @Override
    public UserDTO getUserById(Long id) {
        throw new UnsupportedOperationException("Unimplemented method: getUserById");
    }

    @Override
    public void updateUser(UserDTO userDTO) {
        throw new UnsupportedOperationException("Unimplemented method: updateUser");
    }
}
