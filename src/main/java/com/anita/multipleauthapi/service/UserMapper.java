package com.anita.multipleauthapi.service;

import com.anita.multipleauthapi.model.payload.UserResponse;

public class UserMapper {

    public static UserResponse mapToUserResponse(Long id, String email, String firstname, String lastname) {
        UserResponse userResponse = new UserResponse();
        userResponse.setId(id);
        userResponse.setEmail(email);
        userResponse.setFirstname(firstname);
        userResponse.setLastname(lastname);
        return userResponse;
    }

}
