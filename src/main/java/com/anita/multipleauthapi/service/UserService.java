
package com.anita.multipleauthapi.service;

import com.anita.multipleauthapi.model.payload.UserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService {

    public UserResponse getUserInfoById(Long id) {
        log.debug("Mocking user info retrieval by id: {}", id);

        // Mock data
        UserResponse mockUser = new UserResponse();
        mockUser.setId(id);
        mockUser.setEmail("testopenid96@gmail.com");
        mockUser.setFirstname("test");
        mockUser.setLastname("openid96");

        return mockUser;
    }
}
