package com.anita.multipleauthapi.security;

import com.anita.multipleauthapi.model.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    // private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        // Mock User data
        if ("testopenid96@gmail.com".equals(email)) {
            User mockUser = new User();
            mockUser.setId(1L);
            mockUser.setEmail("testopenid96@gmail.com");
            mockUser.setFirstname("test");
            mockUser.setLastname("openid96");
            return UserPrincipal.create(mockUser);
        } else {
            throw new UsernameNotFoundException(String.format("User not found with email: %s.", email));
        }
    }

    public UserDetails loadUserById(Long id) {
        // Mock User data
        if (id == 1L) {
            User mockUser = new User();
            mockUser.setId(1L);
            mockUser.setEmail("testopenid96@gmail.com");
            mockUser.setFirstname("test");
            mockUser.setLastname("openid96");
            return UserPrincipal.create(mockUser);
        } else {
            throw new UsernameNotFoundException(String.format("User not found with ID: %s.", id));
        }
    }

}
