package com.softonicabackend.domain.user;

import com.softonicabackend.domain.user.dto.UserRegisterDto;
import com.softonicabackend.domain.user.dto.UserRegisterResponseDto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserFacade {

    private final UserRegistration userRegistration;

    UserRegisterResponseDto register(UserRegisterDto userRegisterDto){
        return userRegistration.registerUser(userRegisterDto);
    }
}
