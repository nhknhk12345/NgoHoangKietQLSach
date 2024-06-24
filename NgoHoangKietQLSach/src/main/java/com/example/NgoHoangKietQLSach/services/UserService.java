package com.example.NgoHoangKietQLSach.services;

import com.example.NgoHoangKietQLSach.entity.User;
import com.example.NgoHoangKietQLSach.repository.IUserRepository;
import com.example.NgoHoangKietQLSach.repository.IRoleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IRoleRepository roleRepository;

    public void save(User user) {
        userRepository.save(user);
        Long userId = userRepository.getUserIdByUsername(user.getUsername());
        Long roleId = roleRepository.getRoleIdByName("USER");

        if (userId == null) {
            logger.error("User ID is null for username: {}", user.getUsername());
            throw new IllegalArgumentException("User ID cannot be null");
        }

        if (roleId == null) {
            logger.error("Role ID is null for role name: USER");
            throw new IllegalArgumentException("Role ID cannot be null");
        }

        logger.info("Assigning role ID {} to user ID {}", roleId, userId);
        userRepository.addRoleToUser(userId, roleId);
    }
}
